package com.seyfsalis.mobilfinalsinav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        object : CountDownTimer(5000, 1000){
            override fun onTick(p0: Long) {
                timeText.text =  "${p0/1000}"
                if (((p0/1000)%2).toInt() == 0){
                    nameText.setVisibility(View.VISIBLE)
                }else{
                    nameText.setVisibility(View.INVISIBLE)
                }
            }

            override fun onFinish() {
                val intent = Intent(applicationContext,ikinciEkran::class.java)
                startActivity(intent)
                finish()
            }

        }.start()
    }
}