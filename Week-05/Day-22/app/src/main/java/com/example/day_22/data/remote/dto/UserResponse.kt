package com.example.day_22.data.remote.dto

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("users") val users: List<User>
)