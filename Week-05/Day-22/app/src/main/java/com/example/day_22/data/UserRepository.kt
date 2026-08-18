package com.example.day_22.data

import com.example.day_22.data.remote.ApiService
import com.example.day_22.data.remote.dto.UserResponse
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getUsers(): UserResponse {
        return apiService.getUsers()
    }
}