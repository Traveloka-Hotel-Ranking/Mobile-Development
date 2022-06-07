package com.traveloka.hotelranking.model

import androidx.lifecycle.*
import com.traveloka.hotelranking.data.HotelRepository
import com.traveloka.hotelranking.data.Resource
import com.traveloka.hotelranking.data.remote.response.UserResponse
import kotlinx.coroutines.launch

class LoginViewModel(private val preference: UserPreference,
                     private val hotelRepository: HotelRepository)
    : ViewModel() {

    fun loginUser(email: String?, phone: String?, password: String): LiveData<Resource<UserResponse>> {
        return hotelRepository.loginUser(email, phone, password).asLiveData()
    }

    fun getUser(): LiveData<UserModel> {
        return preference.getUser().asLiveData()
    }

    fun saveUser(userModel: UserModel) {
        viewModelScope.launch {
            preference.saveUser(userModel)
        }
    }

    fun login() {
        viewModelScope.launch {
            preference.login()
        }
    }
}