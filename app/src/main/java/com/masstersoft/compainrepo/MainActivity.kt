package com.masstersoft.compainrepo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.masstersoft.compainrepo.Pavel_Activity.PavelMainActivity
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
    }

}
