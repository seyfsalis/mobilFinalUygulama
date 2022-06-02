package com.seyfsalis.mobilfinalsinav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.fragment_goruntu.*
import kotlinx.android.synthetic.main.fragment_goruntu.view.*

class fragmentGoruntu : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_goruntu, container, false)

        v.button2.setOnClickListener {
            if(button3.isVisible){
                button3.setVisibility(View.INVISIBLE)
            }else{
                button3.setVisibility(View.VISIBLE)
            }
        }

        v.button3.setOnClickListener {
            if(button2.isVisible){
                button2.setVisibility(View.INVISIBLE)
            }else{
                button2.setVisibility(View.VISIBLE)
            }
        }

        v.textView11.setOnClickListener {
            if(textView12.isVisible){
                textView12.setVisibility(View.INVISIBLE)
            }else{
                textView12.setVisibility(View.VISIBLE)
            }
        }

        v.textView12.setOnClickListener {
            if(textView11.isVisible){
                textView11.setVisibility(View.INVISIBLE)
            }else{
                textView11.setVisibility(View.VISIBLE)
            }
        }

        v.radioButton.setOnClickListener {
            if(radioButton2.isVisible){
                radioButton2.setVisibility(View.INVISIBLE)
            }else{
                radioButton2.setVisibility(View.VISIBLE)
            }
        }

        v.radioButton2.setOnClickListener {
            if(radioButton.isVisible){
                radioButton.setVisibility(View.INVISIBLE)
            }else{
                radioButton.setVisibility(View.VISIBLE)
            }
        }

        v.checkBox.setOnClickListener {
            if(checkBox2.isVisible){
                checkBox2.setVisibility(View.INVISIBLE)
            }else{
                checkBox2.setVisibility(View.VISIBLE)
            }
        }

        v.checkBox2.setOnClickListener {
            if(checkBox.isVisible){
                checkBox.setVisibility(View.INVISIBLE)
            }else{
                checkBox.setVisibility(View.VISIBLE)
            }
        }

        return v
    }


}