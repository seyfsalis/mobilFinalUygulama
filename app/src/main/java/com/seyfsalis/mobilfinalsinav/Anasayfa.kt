package com.seyfsalis.mobilfinalsinav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_anasayfa.*

class Anasayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anasayfa)

        callFragment(fragmentAnasayfa())

        button.setOnClickListener {
            val acilirmenu = PopupMenu(this, button)
            acilirmenu.menuInflater.inflate(R.menu.popupmenu, acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i->
                when(i.itemId){
                    R.id.anasayfa -> {
                        callFragment(fragmentAnasayfa())
                        true
                    }
                    R.id.renkler -> {
                        callFragment(fragmentRenkler())
                        true
                    }
                    R.id.gorunurluk -> {
                        callFragment(fragmentGoruntu())
                        true
                    }
                    R.id.hareket -> {
                        callFragment(fragmentHareket())
                        true
                    }
                    R.id.ozelToast -> {
                        callFragment(fragmentToast())
                        true
                    }
                    else -> false
                }

            }
            acilirmenu.show()

            /*val popUpMenu = PopupMenu(this, button)
            popUpMenu.menuInflater.inflate(R.menu.popupmenu, popUpMenu.menu)
            popUpMenu.setOnMenuItemClickListener { i ->
                when(i.itemId){
                    R.id.anasayfa -> {
                        callFragment(fragmentAnasayfa())
                        true
                    }
                    R.id.renkler -> {
                        callFragment(fragmentAnasayfa())
                        true
                    }
                    R.id.gorunurluk -> {
                        callFragment(fragmentAnasayfa())
                        true
                    }
                    R.id.hareket -> {
                        callFragment(fragmentAnasayfa())
                        true
                    }
                    R.id.ozelToast -> {
                        callFragment(fragmentAnasayfa())
                        true
                    }
                    else -> false
                }
            }*/
        }
    }


    fun callFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragmentLayout, fragment).commit()
    }
}