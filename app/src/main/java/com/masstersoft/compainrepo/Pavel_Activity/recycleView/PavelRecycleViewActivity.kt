package com.masstersoft.compainrepo.Pavel_Activity.recycleView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.masstersoft.compainrepo.Pavel_Activity.recycleView.PavelCat
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_recycle_view.*

class PavelRecycleViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pavel_recycle_view)

        itemList.layoutManager = LinearLayoutManager(this)
        val cats = arrayListOf<PavelCat>()

        val urls = arrayListOf(
            "https://images.unsplash.com/photo-1518791841217-8f162f1e1131?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2250&q=80",
            "https://images.unsplash.com/photo-1503844281047-cf42eade5ca5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2255&q=80",
            "https://images.unsplash.com/photo-1488740304459-45c4277e7daf?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2250&q=80",
            "https://images.unsplash.com/photo-1503431128871-cd250803fa41?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2250&q=80",
            "https://images.unsplash.com/photo-1489084917528-a57e68a79a1e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2250&q=80"
        )
        for (i in 0 until urls.size)
            cats.add(PavelCat("Cat ${i + 1}", i + 1, urls[i]))

        val adapter = PavelCatsAdapter(cats)
        itemList.adapter = adapter
    }
}
