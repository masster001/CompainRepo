package com.masstersoft.compainrepo.async_tasks

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_async.*
import kotlinx.android.synthetic.main.activity_async_roman.*
import kotlinx.android.synthetic.main.activity_async_roman.btn1
import kotlinx.android.synthetic.main.activity_async_roman.btn2
import kotlinx.android.synthetic.main.activity_async_roman.btn3

class AsyncActivityRoman : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_roman)

        btn1.setOnClickListener {
            object : AsyncTask<Void, Int, String>() {
                override fun onPreExecute() {
                    progress.isVisible = true
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
            }.execute()
        }

        btn2.setOnClickListener {

        }

        btn3.setOnClickListener {

        }
    }

}
