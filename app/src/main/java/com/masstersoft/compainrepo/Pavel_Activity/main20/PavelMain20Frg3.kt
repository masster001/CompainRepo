package com.masstersoft.compainrepo.Pavel_Activity.main20

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.masstersoft.compainrepo.R
import kotlinx.android.synthetic.main.activity_pavel_main_20_frg_3.*

class PavelMain20Frg3 : Fragment() {

    var listener: PavelMain20NFI? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        if (activity is PavelMain20NFI) listener = activity as PavelMain20NFI
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("mylogs", "Запущен fragment 3.")
        return inflater.inflate(R.layout.activity_pavel_main_20_frg_3, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    fun init() {
        btn1.setOnClickListener {
            if (listener != null) {
                (listener as PavelMain20NFI).nextFragment(PavelMain20Frg1())
                Log.d("mylogs", " Нажали кнопку To the fragment 1.")
            }
        }
    }
}