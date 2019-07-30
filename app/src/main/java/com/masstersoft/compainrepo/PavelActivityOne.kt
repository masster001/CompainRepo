package com.masstersoft.compainrepo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_pavel_one.*

class PavelActivityOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pavel_one)
        btn1.setOnClickListener {
            startActivity(Intent(this, PavelActivityTwo::class.java))
        }

    }

}
