package com.masstersoft.compainrepo.recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_recycle_view.*

class RecycleViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)

        itemList.layoutManager = LinearLayoutManager(this)
        val cats = arrayListOf<Cat>()

        for (i in 0..10)
            cats.add(Cat("Cat $i",i+1,""))
        val adapter = CatsAdapter(cats)
        itemList.adapter = adapter
    }
}
