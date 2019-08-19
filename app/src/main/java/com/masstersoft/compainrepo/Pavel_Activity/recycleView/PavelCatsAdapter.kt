package com.masstersoft.compainrepo.Pavel_Activity.recycleView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.masstersoft.compainrepo.R

class PavelCatsAdapter(val catsList: List<PavelCat>) : RecyclerView.Adapter<PavelCatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PavelCatViewHolder {
        val v = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.pavel_cat_view_holder  , parent, false)
        return PavelCatViewHolder(v)
    }

    override fun getItemCount(): Int {
        return catsList.size
    }

    override fun onBindViewHolder(holder: PavelCatViewHolder, position: Int) {
        val cat = catsList[position]
        val vozrast = "${cat.age} y.o."
        holder.apply {
            name.text = cat.name
            age.text = vozrast
            photo.load(cat.photo)
        }
    }
}