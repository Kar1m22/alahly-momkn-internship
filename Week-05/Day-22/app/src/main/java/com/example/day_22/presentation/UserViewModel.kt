package com.example.day_22.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.day_22.data.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val repository: UserRepository
) : ViewModel() {

    init {
        fetchUsers()
    }

    fun fetchUsers(){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val users = repository.getUsers()
                Log.d("TASK-22", "Successfully fetched ${users.users.size} users")
                Log.d("TASK-22", "First user: ${users.users.firstOrNull()}")
            }catch (e: Exception){
                Log.e("TASK-22","Error fetch the users: ${e.message}")
            }
        }
    }
}