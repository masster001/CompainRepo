package com.masstersoft.compainrepo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masstersoft.compainrepo.Pavel_Activity.PavelMainActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn1

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
    }

}
