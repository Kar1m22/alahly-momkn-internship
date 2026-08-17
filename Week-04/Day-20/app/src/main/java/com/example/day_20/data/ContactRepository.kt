package com.example.day_20.data

import com.example.day_20.domain.Contact
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContactRepository @Inject constructor(
    private val dataSource: ContactDataSource
){
    fun getContact(): List<Contact>{
        return dataSource.fetchContacts()
    }
}