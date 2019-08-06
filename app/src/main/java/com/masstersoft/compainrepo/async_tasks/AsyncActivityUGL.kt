package com.masstersoft.compainrepo.async_tasks

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_async.*

class AsyncActivityUGL : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)

        btn1.setOnClickListener {
            @SuppressLint("StaticFieldLeak")
            object : AsyncTask<Void, Int, String>() {
                override fun onPreExecute() {
                    super.onPreExecute()
                }

                override fun doInBackground(vararg p0: Void?): String {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onPostExecute(result: String?) {
                    super.onPostExecute(result)
                }

                override fun onProgressUpdate(vararg values: Int?) {
                    super.onProgressUpdate(*values)
                }
            }
        }

        btn2.setOnClickListener {

        }

        btn3.setOnClickListener {

        }
    }
}