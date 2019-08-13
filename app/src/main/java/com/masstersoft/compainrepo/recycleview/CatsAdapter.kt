package com.masstersoft.compainrepo.recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.masstersoft.compainrepo.R

class CatsAdapter(val catsList: List<Cat>) : RecyclerView.Adapter<CatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val v = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.cat_view_holder, parent, false)
        return CatViewHolder(v)
    }

    override fun getItemCount(): Int {
        return catsList.size
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val cat = catsList[position]
        val vozrast = "${cat.age} y.o."
        holder.apply {
            name.text = cat.name
            age.text = vozrast
            photo.load(cat.photo)
        }
    }
}