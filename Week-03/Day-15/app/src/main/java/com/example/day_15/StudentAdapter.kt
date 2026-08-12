package com.example.day_15

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day_15.databinding.ItemStudentBinding

class StudentAdapter(
    private val student: List<Students>,
    private val onItemClick: (Students) -> Unit

) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    class StudentViewHolder(val binding: ItemStudentBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StudentViewHolder {
        val binding = ItemStudentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: StudentViewHolder,
        position: Int
    ) {
        val currentStudent = student[position]

        holder.binding.tvName.text = currentStudent.name
        holder.binding.tvEmail.text = currentStudent.email


        holder.itemView.setOnClickListener {
            onItemClick(currentStudent)
        }
    }

    override fun getItemCount(): Int {
        return student.size
    }
}