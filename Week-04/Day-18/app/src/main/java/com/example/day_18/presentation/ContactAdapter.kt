package com.example.day_18.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day_18.domain.Contact
import com.example.day_18.databinding.ItemContactBinding

class ContactAdapter(
    private val contacts: List<Contact>,
    private val onItemClick: (Contact) -> Unit
): RecyclerView.Adapter<ContactAdapter.ContactViewHolder>(){
    class ContactViewHolder( val binding: ItemContactBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactViewHolder {
        val binding = ItemContactBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ContactViewHolder,
        position: Int
    ) {
        val currentContact = contacts[position]

        holder.binding.tvName.text = currentContact.name
        holder.binding.tvEmail.text = currentContact.email


        holder.itemView.setOnClickListener{
            onItemClick(currentContact)
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}