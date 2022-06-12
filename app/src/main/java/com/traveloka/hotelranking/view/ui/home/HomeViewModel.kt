package com.traveloka.hotelranking.view.ui.home

import androidx.lifecycle.*
import com.traveloka.hotelranking.data.HotelRepository
import com.traveloka.hotelranking.data.Resource
import com.traveloka.hotelranking.data.remote.response.HotelItem
import com.traveloka.hotelranking.data.remote.response.HotelListResponse
import com.traveloka.hotelranking.model.UserModel
import com.traveloka.hotelranking.model.UserPreference
import com.traveloka.hotelranking.model.dummy.HomeModel
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: HotelRepository,
    private val preference: UserPreference
    ) : ViewModel() {

    private val _isErrorRequestList = MutableLiveData<String>()
    private val _dataRequestList = MutableLiveData<List<HotelItem>>()
    private val _isLoadingRequestList = MutableLiveData<Boolean>()

    val isErrorRequestList = _isErrorRequestList
    val dataRequestList = _dataRequestList
    val isLoadingRequestList = _isLoadingRequestList

    fun getUser(): LiveData<UserModel> {
        return preference.getUser().asLiveData()
    }

    fun requestDataList(token : String){
        viewModelScope.launch {
            repository.retrieveHotel(token, "")
                .onStart {
                    _isLoadingRequestList.postValue(true)
                }
                .onCompletion {
                    _isLoadingRequestList.postValue(false)
                }
                .collect{ data ->
                    when(data){
                        is Resource.Loading -> _isLoadingRequestList.postValue(true)
                        is Resource.Success -> _dataRequestList.postValue(data.data?.response?.hotel!!)
                        is Resource.Error -> _isErrorRequestList.postValue(data.message!!)

                    }
                }
        }
    }
}