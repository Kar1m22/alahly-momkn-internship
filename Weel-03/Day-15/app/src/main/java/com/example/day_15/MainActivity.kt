package com.example.day_15

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.day_15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val students = listOf(
            Students("Kareem","Kareem@gmail.com",1,21),
            Students("Ahmed","Ahmed@gmail.com",2,22),
            Students("Ali","Ali@gmail.com",3,22),
            Students("Omar","Omar@gmail.com",4,25),
            Students("Scott","Scott @gmail.com",5,21),
            Students("Malek","Malek@gmail.com",6,12),
            Students("Sameh","Sameh@gmail.com",7,18),
            Students("Mostafa","Mostafa@gmail.com",8,20),
            Students("Youssef","Youssef@gmail.com",9,20),
            Students("Alaa","Alaa@gmail.com",10 ,11),
            Students("Mariam","Mariam@gmail.com",11,32),
            Students("Jana","Jana@gmail.com",12,32),
            Students("Ramy","Ramy@gmail.com",13,22),
            Students("Peter","Peter@gmail.com",14,12),
            Students("Parker","Parker@gmail.com",15,42),
            Students("John","John@gmail.com",16,35),
            Students("Samy","Samy@gmail.com",17,37),
            Students("Momen","Momen@gmail.com",18,38),
            Students("Akram","Akram@gmail.com",19,31),
            Students("Salma","Salma@gmail.com",20,30),
        )
        val adapter = StudentAdapter(students){selectedStudent ->
            val intent = Intent(this, DetailActivity::class.java).apply{
                putExtra("STUDENT_ID",selectedStudent.id)
                putExtra("STUDENT_AGE",selectedStudent.age)
            }
            startActivity(intent)
        }
        binding.rvStudent.adapter = adapter
        binding.rvStudent.layoutManager = LinearLayoutManager(this)

    }
}