package com.example.day_22.data.remote

import com.example.day_22.data.remote.dto.UserResponse
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): UserResponse
}