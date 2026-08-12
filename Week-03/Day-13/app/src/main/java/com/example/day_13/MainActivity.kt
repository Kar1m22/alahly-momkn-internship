package com.example.day_13

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.day_13.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.applyBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("USER_NAME","${binding.nameField.text}")
            }
            startActivity(intent)
        }
    }

}