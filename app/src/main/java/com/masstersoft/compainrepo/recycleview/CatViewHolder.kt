package com.masstersoft.compainrepo.recycleview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.masstersoft.compainrepo.R

class CatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name = itemView.findViewById<TextView>(R.id.name)
    val age = itemView.findViewById<TextView>(R.id.age)
    val photo = itemView.findViewById<ImageView>(R.id.photo)
    init {
        itemView.setOnClickListener{
            Toast.makeText(itemView.context, "Item clicked", Toast.LENGTH_SHORT).show()
        }
    }
}