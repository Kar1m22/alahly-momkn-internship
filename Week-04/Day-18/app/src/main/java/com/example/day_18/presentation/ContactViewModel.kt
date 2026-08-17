package com.example.day_18.presentation

import androidx.lifecycle.ViewModel
import com.example.day_18.data.ContactRepository
import com.example.day_18.domain.Contact
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContactViewModel: ViewModel() {

    private val repository = ContactRepository()

    private val _contacts = MutableStateFlow<List<Contact>>(emptyList())
    val contacts : StateFlow<List<Contact>> = _contacts.asStateFlow()


    init {
        getContacts()
    }

    fun getContacts(){
        _contacts.value = repository.getContact()
    }
}