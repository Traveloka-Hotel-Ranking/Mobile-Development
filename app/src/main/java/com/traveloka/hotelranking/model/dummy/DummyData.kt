package com.traveloka.hotelranking.model.dummy

import com.traveloka.hotelranking.R

object DummyData {

    val listImage = listOf(
        ImageModel(
            image = R.drawable.sample_image
        ),
        ImageModel(
            image = R.drawable.sample_image
        ),
        ImageModel(
            image = R.drawable.sample_image
        ),
        ImageModel(
            image = R.drawable.sample_image
        ),
        ImageModel(
            image = R.drawable.sample_image
        ),
    )

    val listRoom = listOf(
        RoomModel(
            image = R.drawable.sample_image,
            type = "King Mansion",
            guest = 3,
            bedNumber = 3,
            bedType = "King Size Bed",
            breakfast = true,
            wifi = true,
            price = "Rp.2.000.000",
            discount = true,
            discountPrice = "Rp.1.000.000"
        ),
        RoomModel(
            image = R.drawable.sample_image,
            type = "Twin Deluxe",
            guest = 2,
            bedNumber = 2,
            bedType = "Twin Single Bed",
            breakfast = true,
            wifi = true,
            price = "Rp.1.000.000",
            discount = true,
            discountPrice = "Rp.500.000"
        ),
        RoomModel(
            image = R.drawable.sample_image,
            type = "Twin Deluxe",
            guest = 2,
            bedNumber = 2,
            bedType = "Twin Single Bed",
            breakfast = true,
            wifi = true,
            price = "Rp.1.000.000",
            discount = true,
            discountPrice = "Rp.500.000"
        ),
        RoomModel(
            image = R.drawable.sample_image,
            type = "Single Deluxe",
            guest = 2,
            bedNumber = 1,
            bedType = "Queen Size Bed",
            breakfast = true,
            wifi = true,
            price = "Rp.1.000.000",
            discount = true,
            discountPrice = "Rp.500.000"
        ),
        RoomModel(
            image = R.drawable.sample_image,
            type = "Single Deluxe",
            guest = 2,
            bedNumber = 1,
            bedType = "Queen Size Bed",
            breakfast = true,
            wifi = true,
            price = "Rp.1.000.000",
            discount = true,
            discountPrice = "Rp.500.000"
        )
    )

    val listHotel = listOf(
        HomeModel(
            title = "Alila Purnama Hotel",
            rating = "2.0",
            currentLocation = "415m",
            ratingHotel = "9.0",
            discount = "80",
            price = "Rp.1.000.000",
            pricePerNight = "Rp.400.000",
            point = "4000",
            image = listImage,
            room = listRoom
        ),
        HomeModel(
            title = "Four Season Resort Sayan",
            rating = "2.0",
            currentLocation = "4015m",
            ratingHotel = "4.0",
            discount = "60",
            price = "Rp.2.000.000",
            pricePerNight = "Rp.400.000",
            point = "6000",
            image = listImage,
            room = listRoom
        ),
        HomeModel(
            title = "Mandapa A Ritz Carlton Reserve",
            rating = "5.0",
            currentLocation = "1015m",
            ratingHotel = "5.0",
            discount = "90",
            price = "Rp.8.000.000",
            pricePerNight = "Rp.700.000",
            point = "1000",
            image = listImage,
            room = listRoom
        ),
        HomeModel(
            title = "Amanjiwo Resort Borobudur",
            rating = "2.0",
            currentLocation = "215m",
            ratingHotel = "3.0",
            discount = "40",
            price = "Rp.9.000.000",
            pricePerNight = "Rp.300.000",
            point = "20000",
            image = listImage,
            room = listRoom
        ),
        HomeModel(
            title = "DoubleTree by Hilton Jakarta",
            rating = "3.0",
            currentLocation = "615m",
            ratingHotel = "8.0",
            discount = "30",
            price = "Rp.4.000.000",
            pricePerNight = "Rp.800.000",
            point = "50000",
            image = listImage,
            room = listRoom
        )
    )
}