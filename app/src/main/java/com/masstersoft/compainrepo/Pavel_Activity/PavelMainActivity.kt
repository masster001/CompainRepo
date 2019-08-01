package com.masstersoft.compainrepo.Pavel_Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masstersoft.compainrepo.Pavel_Activity.main20.PavelMain20Activity
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_pavel_one.*

class PavelMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pavel_one)
        pBtnMain1.setOnClickListener {
            startActivity(Intent(this, PavelMain20Activity::class.java))
        }

    }

}
