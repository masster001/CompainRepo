package com.masstersoft.compainrepo.Pavel_Activity.HomeWork21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.masstersoft.compainrepo.R

class PHW21MainActivity : AppCompatActivity(), PHW21ProxyListener {

    val receiverFragment = PHW21RecieverFragment()

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pavel_main21)

        supportFragmentManager.beginTransaction()
            .add(R.id.PHW21receiver, receiverFragment, "receiver")
            .add(R.id.PHW21sender, PHW21SenderFragment(), "sender")
            .commit()
    }

    override fun getCountListener(): PHW21OnSend? = receiverFragment


    override fun getReceiverListener(): PHW21OnRecieve? = receiverFragment

}