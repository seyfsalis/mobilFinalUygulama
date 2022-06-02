package com.seyfsalis.mobilfinalsinav

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_anasayfa.*
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*
import kotlin.system.exitProcess


class fragmentAnasayfa : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_anasayfa, container, false)

        v.imageView4.setOnClickListener{

            getActivity()?.let { it1 -> Snackbar.make(it1.findViewById(android.R.id.content),"Uygulama Kapatılıyor", Snackbar.LENGTH_SHORT).show() }

            object : CountDownTimer(2000, 1000) {
                override fun onTick(p0: Long) {
                }

                override fun onFinish() {
                    exitProcess(-1)
                }

            }.start()
        }

        return v
    }


}