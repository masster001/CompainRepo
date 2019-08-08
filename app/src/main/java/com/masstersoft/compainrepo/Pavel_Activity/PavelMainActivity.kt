package com.masstersoft.compainrepo.Pavel_Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masstersoft.compainrepo.Pavel_Activity.HomeWork20.PHW20MainActivity
import com.masstersoft.compainrepo.Pavel_Activity.HomeWork21.PHW21MainActivity
import com.masstersoft.compainrepo.R
import com.masstersoft.compainrepo.async_tasks.AsyncActivityPavel
import kotlinx.android.synthetic.main.activity_pavel_one.*

class PavelMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pavel_one)

        pBtnMain1.setOnClickListener {
            startActivity(Intent(this, PHW20MainActivity::class.java))
        }
        pBtnMain2.setOnClickListener {
            startActivity(Intent(this, PHW21MainActivity::class.java))
        }
        pBtnMain3.setOnClickListener {
            startActivity(Intent(this, AsyncActivityPavel::class.java))
        }

    }

}
