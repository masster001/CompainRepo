package com.masstersoft.compainrepo.Pavel_Activity.HomeWork21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.phw_21_reciever.*

class PHW21RecieverFragment : Fragment(), PHW21OnRecieve, PHW21OnSend {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.phw_21_reciever, container, false)
    }

    override fun onReceive(arg: String) {
        chat.append("\n > $arg")
    }

    override fun onSend(): Int {
        return  chat.text.length
    }
}