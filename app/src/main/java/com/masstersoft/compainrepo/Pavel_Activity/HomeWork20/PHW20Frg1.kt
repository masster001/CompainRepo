package com.masstersoft.compainrepo.Pavel_Activity.HomeWork20

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_pavel_main_20_frg_1.*

class PHW20Frg1 : Fragment() {

    var listener: PHW20NFI? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        if (activity is PHW20NFI) listener = activity as PHW20NFI
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("mylogs", "Запущен fragment 1.")
        return inflater.inflate(R.layout.activity_pavel_main_20_frg_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    fun init() {
        btn1.setOnClickListener {
            if (listener != null) {
                (listener as PHW20NFI).nextFragment(PHW20Frg2())
                Log.d("mylogs", " Нажали кнопку To the fragment 2.")
            }
        }
    }

}
