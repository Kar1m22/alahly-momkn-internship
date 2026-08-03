package com.example.day_14

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.day_14.databinding.ActivityDetailBinding

class DetailActivity: AppCompatActivity(){
    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra("STUDENT_ID",0)
        val age = intent.getIntExtra("STUDENT_AGE",0)


        binding.tvStudentId.text = "ID : $id"
        binding.tvStudentAge.text = "Age : $age"

    }
}