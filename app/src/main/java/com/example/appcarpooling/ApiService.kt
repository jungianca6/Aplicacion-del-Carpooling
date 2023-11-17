package com.example.appcarpooling

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("/chofer")
    fun getChoferes(): Call<List<ChoferModel>>

    @POST("/chofer")
    fun createChofer(@Body chofer: ChoferModel): Call<ChoferModel>
}