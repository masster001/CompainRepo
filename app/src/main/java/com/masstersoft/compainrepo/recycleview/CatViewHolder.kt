package com.masstersoft.compainrepo.recycleview

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.masstersoft.compainrepo.R

class CatViewHolder(itemView: View, index: Int, recyclerView: RecyclerView) : RecyclerView.ViewHolder(itemView) {
    val name = itemView.findViewById<TextView>(R.id.name)
    val age = itemView.findViewById<TextView>(R.id.age)
    val photo = itemView.findViewById<ImageView>(R.id.photo)
    public val id = index
    val TAG = "CatAdapter"

    init {
        itemView.setOnClickListener {
            if (recyclerView.adapter is CatsAdapter) {
                //val adapter: CatsAdapter = recyclerView.adapter as CatsAdapter
                //val cats = adapter.catsList.toMutableList()
                //cats.removeAt(itemId.toInt())
                //recyclerView.adapter = CatsAdapter(cats)
                Log.d(TAG, "Deleted item with name ${(recyclerView.adapter as CatsAdapter).catsList[itemId.toInt()]}")
                (recyclerView.adapter as CatsAdapter).catsList.removeAt(itemId.toInt())
                (recyclerView.adapter as CatsAdapter).notifyDataSetChanged()
            }
        }
        Log.d(TAG, "View holder created for ${id}")
    }



}