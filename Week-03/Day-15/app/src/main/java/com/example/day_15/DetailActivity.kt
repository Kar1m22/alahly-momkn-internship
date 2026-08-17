package com.example.day_15

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.day_15.databinding.ActivityDetailBinding

class DetailActivity: AppCompatActivity(){
    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra("STUDENT_ID",0)
        val age = intent.getIntExtra("STUDENT_AGE",0)


        binding.tvStudentId.text = getString(R.string.student_id_format,id)
        binding.tvStudentAge.text = getString(R.string.student_age_format,age)

    }
}