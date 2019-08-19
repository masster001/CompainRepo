package com.masstersoft.compainrepo.Pavel_Activity.recycleView

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.masstersoft.compainrepo.R

class PavelCatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name = itemView.findViewById<TextView>(R.id.tvName)
    val age = itemView.findViewById<TextView>(R.id.tvAge)
    val photo = itemView.findViewById<ImageView>(R.id.ivPhoto)
    init {
        itemView.setOnClickListener{
            Toast.makeText(itemView.context, "Item clicked", Toast.LENGTH_SHORT).show()
        }
    }
}