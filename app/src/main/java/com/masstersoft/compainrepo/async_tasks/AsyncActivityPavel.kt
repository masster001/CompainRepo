package com.masstersoft.compainrepo.async_tasks

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import androidx.core.view.isVisible
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_async_pavel.*

class AsyncActivityPavel : AppCompatActivity() {

    private lateinit var handler: Handler
    var gameOn: Boolean = false
    var startTime: Long = 0

    private val TAG = "PavelLog"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_pavel)

        startTime = System.currentTimeMillis()

        Log.i(TAG, "Before Handler = ...")
        handler = object : Handler() {
            override fun handleMessage(msg: Message) {
                Log.i(TAG, "StartHandleMassege")
                super.handleMessage(msg)

                if (gameOn) {
                    Log.i(TAG, "GemeOn = true")
                    val seconds = (System.currentTimeMillis() - startTime) / 1000
                    Log.i(TAG, "seconds = $seconds")
                }

                handler.sendEmptyMessageDelayed(0, 1000)
                Log.i(TAG, "Affter sendEmptyMassageDelayed")

            }
        }
        gameOn = true
        handler.sendEmptyMessage(0)
        Log.i(TAG, "Affter sendEmptyMassageDelayed")

        btn1.setOnClickListener {
            object : AsyncTask<Void, Int, String>() {
                var internetAvailable: Boolean = false
                override fun onPreExecute() {
                    prProgress.isVisible = true
                    tvInfo.text = ""
                    if (internetAvailable) cancel(internetAvailable)
                }

                override fun doInBackground(vararg p0: Void?): String {
                    if (!isCancelled) return "AsyncTasc cancelled"

                        for (i in 0..100) {
                            Thread.sleep(200)
                            publishProgress(i)
                        }

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
