package com.seyfsalis.mobilfinalsinav

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_renkler.*
import kotlinx.android.synthetic.main.fragment_renkler.view.*


class fragmentRenkler : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_renkler, container, false)

        var renkler = arrayOf("Renk Seçiniz", "Soytarı", "Elektrik mor rengi", "Yosun yeşili", "Falu kırmızısı", "Lavanta mor")
        var adapter = ArrayAdapter(activity?.applicationContext!!, android.R.layout.simple_dropdown_item_1line, renkler)

        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)


        v.yaziRengi.adapter = adapter
        v.yaziRengi.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(p2== 0){
                    isimText.setTextColor(Color.parseColor("#84FFFF"))
                }
                if(p2 == 1){
                    isimText.setTextColor(Color.parseColor("#3FFF00"))
                }
                if(p2 == 2){
                    isimText.setTextColor(Color.parseColor("#BF00FF"))
                }
                if(p2 == 3){
                    isimText.setTextColor(Color.parseColor("#ADDFAD"))
                }
                if(p2 == 4){
                    isimText.setTextColor(Color.parseColor("#801818"))
                }
                if(p2 == 5){
                    isimText.setTextColor(Color.parseColor("#967BB6"))
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        v.arkaplanRengi.adapter = adapter
        v.arkaplanRengi.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(p2== 0){
                    isimText.setBackgroundColor(Color.parseColor("#84FFFF"))
                }
                if(p2 == 1){
                    isimText.setBackgroundColor(Color.parseColor("#3FFF00"))
                }
                if(p2 == 2){
                    isimText.setBackgroundColor(Color.parseColor("#BF00FF"))
                }
                if(p2 == 3){
                    isimText.setBackgroundColor(Color.parseColor("#ADDFAD"))
                }
                if(p2 == 4){
                    isimText.setBackgroundColor(Color.parseColor("#801818"))
                }
                if(p2 == 5){
                    isimText.setBackgroundColor(Color.parseColor("#967BB6"))
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        v.fragmentRengi.adapter = adapter
        v.fragmentRengi.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(p2== 0){
                    fragmentRenk.setBackgroundColor(Color.parseColor("#84FFFF"))
                }
                if(p2 == 1){
                    fragmentRenk.setBackgroundColor(Color.parseColor("#3FFF00"))
                }
                if(p2 == 2){
                    fragmentRenk.setBackgroundColor(Color.parseColor("#BF00FF"))
                }
                if(p2 == 3){
                    fragmentRenk.setBackgroundColor(Color.parseColor("#ADDFAD"))
                }
                if(p2 == 4){
                    fragmentRenk.setBackgroundColor(Color.parseColor("#801818"))
                }
                if(p2 == 5){
                    fragmentRenk.setBackgroundColor(Color.parseColor("#967BB6"))
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }




        return v

    }


}