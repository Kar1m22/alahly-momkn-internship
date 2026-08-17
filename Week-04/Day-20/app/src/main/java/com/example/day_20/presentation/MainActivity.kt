package com.example.day_20.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.day_20.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val viewModel : ContactViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contactList = viewModel.contacts.value
        val adapter = ContactAdapter(contactList) { selectedContact ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("CONTACT_NAME", selectedContact.name)
                putExtra("CONTACT_PHONE", selectedContact.phone)
                putExtra("CONTACT_ADDRESS", selectedContact.address)

            }
            startActivity(intent)
        }
        binding.rvContact.adapter = adapter
        binding.rvContact.layoutManager = LinearLayoutManager(this)

    }
}