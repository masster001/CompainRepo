package com.masstersoft.compainrepo.async_tasks

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_async.*
import kotlinx.android.synthetic.main.activity_async.btn1
import kotlinx.android.synthetic.main.activity_async.btn2
import kotlinx.android.synthetic.main.activity_async.btn3
import kotlinx.android.synthetic.main.activity_async_pavel.*


class AsyncActivityPavel : AppCompatActivity() {

    private lateinit var handler: Handler
    var gameOn: Boolean = false
    var startTime: Long = 0

    private val TAG = "PavelLog"

    override fun onPause() {
        super.onPause()
        gameOn = false
    }

    fun preExecute() {
        prProgress.isVisible = true
        tvInfo.text = ""
    }

    fun postExecute(result: String?) {
        prProgress.isVisible = false
        tvInfo.text = result
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_pavel)


        startTime = System.currentTimeMillis()
        Log.i(TAG, "Before handler=...")
        handler = object : Handler() {

            var counter = 0
            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
                counter++

                info.text = counter.toString()
                Log.i(TAG, "New step counter = $counter")

                if (counter < 100) {
                    handler.sendEmptyMessageDelayed(0, 20)
                } else {
                    postExecute("Handler stopped")
                    Log.i(TAG, "Handler stopped")
                    counter = 0
                }
            }
        }
        btn1.setOnClickListener {
            object : AsyncTask<Void, Int, String>() {
                var internetAvailable: Boolean = false
                override fun onPreExecute() {
                    preExecute()
                    if (internetAvailable) cancel(internetAvailable)
                }

                override fun doInBackground(vararg p0: Void?): String {
                    if (!isCancelled) return "AsyncTasc cancelled"

                    for (i in 0..100) {
                        Thread.sleep(20)
                        publishProgress(i)
                    }

                    return "AsyncTasc stoped"
                }

                override fun onPostExecute(result: String?) {
                    postExecute(result)
                }

                override fun onProgressUpdate(vararg values: Int?) {
                    tvInfo.text = values[0].toString()
                }
            }.execute()
        }

        btn2.setOnClickListener {
            handler.sendEmptyMessage(0)
            preExecute()
            Log.i(TAG, "Handler started")
        }

        btn3.setOnClickListener {

        }
    }
}
