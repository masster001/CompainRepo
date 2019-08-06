package com.masstersoft.compainrepo.async_tasks

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
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
                    progress.isVisible = true
                    info.text = ""
                }

                override fun doInBackground(vararg p0: Void?): String {
                    for (i in 0..100){
                        Thread.sleep(200)
                        publishProgress(i)
                    }
                    return "AsyncTask Stopped"
                }

                override fun onPostExecute(result: String?) {
                    progress.isVisible = false
                    info.text = result
                }

                override fun onProgressUpdate(vararg values: Int?) {
                    info.text = values[0].toString()
                }
            }
        }

        btn2.setOnClickListener {

        }

        btn3.setOnClickListener {

        }
    }
}