package com.masstersoft.compainrepo.async_tasks

import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_async.*


class AsyncActivity : AppCompatActivity() {

    private lateinit var handler: Handler
    var gameOn: Boolean = false
    var startTime: Long = 0

    private val TAG = "CompainRepo"

    override fun onPause() {
        super.onPause()
        gameOn = false
        Log.i(TAG, "onPause")
    }

    override fun onResume() {
        super.onResume()
        gameOn = true
        handler.sendEmptyMessage(0)
        Log.i(TAG, "onResume")
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)

        startTime = System.currentTimeMillis()
        Log.i(TAG, "Before handler=...")
        handler = object : Handler() {
            override fun handleMessage(msg: Message) {
                Log.i(TAG, "Start handleMessage")
                super.handleMessage(msg)

                if (gameOn) {
                    Log.i(TAG, "GameOn = true")
                    val seconds = (System.currentTimeMillis() - startTime) / 1000
                    Log.i(TAG, "seconds = $seconds")
                    handler.sendEmptyMessageDelayed(0, 1000)
                    Log.i(TAG, "After sendEmptyMessageDelayed")
                }else{
                    Log.i(TAG, "Handler stopped")
                }
            }
        }

        btn1.setOnClickListener {
            object : AsyncTask<Double, Int, String>() {
                var internetAvailable: Boolean = false
                override fun onPreExecute() {
                    progress.isVisible = true
                    info.text = ""
                    if (internetAvailable) cancel(internetAvailable)
                }

                override fun doInBackground(vararg p0: Double?): String {
                    if (isCancelled) return "AsyncTask cancelled"

                    for (i in 0..100) {
                        Thread.sleep(200)
                        publishProgress(i)
                    }
                    return "AsyncTask stopped"
                }

                override fun onPostExecute(result: String?) {
                    progress.isVisible = false
                    info.text = result
                }

                override fun onProgressUpdate(vararg values: Int?) {
                    info.text = values[0].toString()
                }
            }.execute()
        }

        btn2.setOnClickListener {

        }

        btn3.setOnClickListener {

        }
    }
}
