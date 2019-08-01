package com.masstersoft.compainrepo.Pavel_Activity.main20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.masstersoft.compainrepo.R

class PavelMain20Activity : AppCompatActivity(), PavelMain20NFI {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pavel_main_20)

//        supportFragmentManager
//            .beginTransaction()
//            .add(R.id.content, Fragmeny_1())
//            .addToBackStack("frg")
//            .commit()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, PavelMain20Frg1())
            .addToBackStack("frg")
            .commit()
    }


    override fun nextFragment(frg: Fragment) {
        if (frg is PavelMain20Frg1) {
            supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }

        supportFragmentManager
            .beginTransaction()
            .add(R.id.content, frg)
            .addToBackStack(frg.toString())
            .commit()
        printBackStack()

//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.content, frg)
//            .addToBackStack(frg.toString())
//            .commit()
//        printBackStack()
    }

    fun printBackStack() {
        println("mylogs количество фрагментов в BACKSTAK = ${supportFragmentManager.backStackEntryCount}")

    }

    override fun onBackPressed() {

        if (supportFragmentManager.backStackEntryCount == 1) {
            println("mylogs нажали кнопка Back, Activity finish()")
            finish()
        } else {
            super.onBackPressed()
            println("mylogs нажали кнопка Back в BACKSTACK осталось = ${supportFragmentManager.backStackEntryCount}")
        }
    }

}