package com.example.day_19.presentation

import androidx.lifecycle.ViewModel
import com.example.day_19.data.ContactRepository
import com.example.day_19.domain.Contact
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ContactViewModel @Inject constructor(
    private val repository: ContactRepository
)
: ViewModel() {

    private val _contacts = MutableStateFlow<List<Contact>>(emptyList())
    val contacts : StateFlow<List<Contact>> = _contacts.asStateFlow()


    init {
        getContacts()
    }

    fun getContacts(){
        _contacts.value = repository.getContact()
    }
}