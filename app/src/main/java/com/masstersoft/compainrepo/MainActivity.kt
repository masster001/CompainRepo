package com.masstersoft.compainrepo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import com.masstersoft.compainrepo.Pavel_Activity.PavelMainActivity
import com.masstersoft.compainrepo.async_tasks.AsyncActivity
import com.masstersoft.compainrepo.recycleview.RecycleViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            val intent = Intent(this, KirillActivity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            startActivity(Intent(this, PavelMainActivity::class.java))
        }

        btn3.setOnClickListener {
            startActivity(Intent(this, AsyncActivity::class.java))
        }

        btn4.setOnClickListener {
            startActivity(Intent(this,RecycleViewActivity::class.java))
        }

        img.load("https://images.unsplash.com/photo-1518791841217-8f162f1e1131?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3300&q=80")

    }

}
