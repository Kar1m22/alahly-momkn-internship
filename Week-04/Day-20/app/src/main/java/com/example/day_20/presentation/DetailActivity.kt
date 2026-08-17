package com.example.day_20.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.day_20.databinding.ActivityDetailBinding

class DetailActivity: AppCompatActivity(){
    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("CONTACT_NAME") ?: "N/A"
        val phone = intent.getStringExtra("CONTACT_PHONE")?: "N/A"
        val address = intent.getStringExtra("CONTACT_ADDRESS")?: "N/A"



        binding.tvContactName.text = "Name : $name"
        binding.tvContactPhone.text = "Phone : $phone"
        binding.tvContactAddress.text = "Address : $address"

    }
}