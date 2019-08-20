package com.masstersoft.compainrepo.recycleview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.masstersoft.compainrepo.R

class CatsAdapter(val catsList: MutableList<Cat>) : RecyclerView.Adapter<CatViewHolder>() {

    var index = 0
    val TAG = "CatAdapter"

    var recyclerView: RecyclerView? = null

    init {
        setHasStableIds(true)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val v = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.cat_view_holder, parent, false)
        index++
        return CatViewHolder(v, index , recyclerView!!)
    }

    override fun getItemCount(): Int {
        return catsList.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        this.recyclerView = recyclerView
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val cat = catsList[position]
        val vozrast = "${cat.age} y.o."
        holder.apply {
            name.text = cat.name
            age.text = vozrast
            photo.load(cat.photo)
        }
        Log.d(TAG, "We use holder with id = ${holder.id} item id = ${cat.name}")
    }
}