package com.seyfsalis.mobilfinalsinav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_hareket.view.*


class fragmentHareket : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_hareket, container, false)

        v.hareketTextView.setOnTouchListener { view, motionEvent ->
            if(motionEvent.action == MotionEvent.ACTION_MOVE){
                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2

            }
            if(motionEvent.action == MotionEvent.ACTION_UP){
                view.y = motionEvent.rawY
                view.x = motionEvent.rawX
                Toast.makeText(activity?.applicationContext!!, "Textview Yeni Konum", Toast.LENGTH_SHORT).show()
            }
            true
        }

        v.hareketButon.setOnTouchListener { view, motionEvent ->
            if(motionEvent.action == MotionEvent.ACTION_MOVE){
                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2

            }
            if(motionEvent.action == MotionEvent.ACTION_UP){
                view.y = motionEvent.rawY
                view.x = motionEvent.rawX
                Toast.makeText(activity?.applicationContext!!, "Button Yeni Konum", Toast.LENGTH_SHORT).show()
            }
            true
        }

        v.hareketImage.setOnTouchListener { view, motionEvent ->
            if(motionEvent.action == MotionEvent.ACTION_MOVE){
                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2

            }
            if(motionEvent.action == MotionEvent.ACTION_UP){
                view.y = motionEvent.rawY
                view.x = motionEvent.rawX
                Toast.makeText(activity?.applicationContext!!, "ImageView Yeni Konum", Toast.LENGTH_SHORT).show()
            }
            true
        }

        v.hareketEditText.setOnTouchListener { view, motionEvent ->
            if(motionEvent.action == MotionEvent.ACTION_MOVE){
                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2

            }
            if(motionEvent.action == MotionEvent.ACTION_UP){
                view.y = motionEvent.rawY
                view.x = motionEvent.rawX
                Toast.makeText(activity?.applicationContext!!, "EditText Yeni Konum", Toast.LENGTH_SHORT).show()
            }
            true
        }

        return v
    }


}