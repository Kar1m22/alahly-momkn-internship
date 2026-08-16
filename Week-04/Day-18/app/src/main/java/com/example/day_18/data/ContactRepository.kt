package com.example.day_18.data

import com.example.day_18.domain.Contact

class ContactRepository {
    fun getContact(): List<Contact>{
        return listOf(
            Contact("Kareem", "Kareem@gmail.com", "+201000000001", "Cairo, Egypt"),
            Contact("Ahmed", "Ahmed@gmail.com", "+201000000002", "Giza, Egypt"),
            Contact("Ali", "Ali@gmail.com", "+201000000003", "Alexandria, Egypt"),
            Contact("Omar", "Omar@gmail.com", "+201000000004", "Cairo, Egypt"),
            Contact("Scott", "Scott@gmail.com", "+15550001111", "New York, USA"),
            Contact("Malek", "Malek@gmail.com", "+201000000006", "Giza, Egypt"),
            Contact("Sameh", "Sameh@gmail.com", "+201000000007", "Mansoura, Egypt"),
            Contact("Mostafa", "Mostafa@gmail.com", "+201000000008", "Cairo, Egypt"),
            Contact("Youssef", "Youssef@gmail.com", "+201000000009", "Tanta, Egypt"),
            Contact("Alaa", "Alaa@gmail.com", "+201000000010", "Cairo, Egypt")

        )

    }
}