package com.masstersoft.compainrepo.async_tasks

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_asycn_kirill.*
import java.util.*

class AsycnActivityKirill : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asycn_kirill)

        btn1.setOnClickListener {
            @SuppressLint("StaticFieldLeak")
            object : AsyncTask<Unit, Int, String>(){
                override fun onPreExecute() {
                    super.onPreExecute()
                }

                override fun doInBackground(vararg p0: Unit): String {
                    return ""
                }

                override fun onPostExecute(result: String) {
                    super.onPostExecute(result)
                }
            }
        }

        btn2.setOnClickListener {

        }

        btn3.setOnClickListener {

        }
    }
}
