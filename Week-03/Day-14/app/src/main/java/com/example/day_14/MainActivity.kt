package com.example.day_14

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.day_14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val contacts = listOf(
            Contact( "Kareem", "Kareem@gmail.com", "+201000000001", "Cairo, Egypt"),
            Contact( "Ahmed", "Ahmed@gmail.com", "+201000000002", "Giza, Egypt"),
            Contact( "Ali", "Ali@gmail.com", "+201000000003", "Alexandria, Egypt"),
            Contact( "Omar", "Omar@gmail.com", "+201000000004", "Cairo, Egypt"),
            Contact( "Scott", "Scott@gmail.com", "+15550001111", "New York, USA"),
            Contact( "Malek", "Malek@gmail.com", "+201000000006", "Giza, Egypt"),
            Contact( "Sameh", "Sameh@gmail.com", "+201000000007", "Mansoura, Egypt"),
            Contact( "Mostafa", "Mostafa@gmail.com", "+201000000008", "Cairo, Egypt"),
            Contact( "Youssef", "Youssef@gmail.com", "+201000000009", "Tanta, Egypt"),
            Contact( "Alaa", "Alaa@gmail.com", "+201000000010", "Cairo, Egypt")
        )
        val adapter = ContactAdapter(contacts){ selectedContact ->
            val intent = Intent(this, DetailActivity::class.java).apply{
                putExtra("CONTACT_NAME",selectedContact.name)
                putExtra("CONTACT_PHONE",selectedContact.phone)
                putExtra("CONTACT_ADDRESS",selectedContact.address)

            }
            startActivity(intent)
        }
        binding.rvContact.adapter = adapter
        binding.rvContact.layoutManager = LinearLayoutManager(this)

    }
}