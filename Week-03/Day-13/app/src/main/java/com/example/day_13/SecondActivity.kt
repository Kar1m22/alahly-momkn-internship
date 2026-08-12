package com.example.day_13

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.day_13.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("USER_NAME") ?: "guest"
        binding.textView.text = "Hello, $name"


    }
}