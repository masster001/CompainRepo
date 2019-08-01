package com.masstersoft.compainrepo.Pavel_Activity.HomeWork21

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.phw_21_sender.*

class PHW21SenderFragment : Fragment() {

    var listener: PHW21ProxyListener? = null

    override fun onAttach(context: Context?) {
        if (activity is PHW21ProxyListener){
            listener=activity as PHW21ProxyListener
        }

        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.phw_21_sender, container, false)
        val send = root.findViewById<Button>(R.id.btnSend)
        val receiver = root.findViewById<Button>(R.id.btnReceive)
        val info = root.findViewById<EditText>(R.id.etInfo)
        send.setOnClickListener {
            //            Toast.makeText(activity, "Button send clicked", Toast.LENGTH_SHORT).show()
            listener?.getReceiverListener()?.onReceive(info.text.toString())
            etInfo.text.clear()
        }
        receiver.setOnClickListener {
            Toast.makeText(activity, "Chat has abaut ${listener?.getCountListener()?.onSend()}", Toast.LENGTH_SHORT).show()
        }
        return root
    }

}