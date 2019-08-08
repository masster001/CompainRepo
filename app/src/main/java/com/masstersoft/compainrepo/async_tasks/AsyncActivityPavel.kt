package com.masstersoft.compainrepo.async_tasks

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_async_pavel.*

class AsyncActivityPavel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_pavel)

        btn1.setOnClickListener {
            object : AsyncTask<Void, Int, String>() {
                override fun onPreExecute() {
                    prProgress.isVisible = true
                    tvInfo.text = ""
                }

                override fun doInBackground(vararg p0: Void?): String {
                    for (i in 0..100) {
                        Thread.sleep(200)
                    publishProgress(i)}
                    return "AsyncTasc stoped"
                }

                override fun onPostExecute(result: String?) {
                    prProgress.isVisible = false
                    tvInfo.text = result
                }

                override fun onProgressUpdate(vararg values: Int?) {
                    tvInfo.text = values[0].toString()
                }
            }.execute()
        }

        btn2.setOnClickListener {

        }

        btn3.setOnClickListener {

        }
    }
}
