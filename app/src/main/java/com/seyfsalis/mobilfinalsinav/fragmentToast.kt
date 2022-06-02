package com.seyfsalis.mobilfinalsinav

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_toast.view.*
import kotlinx.android.synthetic.main.toast_mesaj.view.*

class fragmentToast : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_toast, container, false)

        val tasarim = layoutInflater.inflate(R.layout.toast_mesaj, null)
        val ToastOzel = Toast(activity?.applicationContext!!)
        v.toastButon.setOnClickListener {
            v.logoSecim.setOnCheckedChangeListener { radioGroup, i ->
                when (i) {
                    R.id.birinciSecim -> {
                        tasarim.logo.setImageResource(R.drawable.mylogo)
                    }
                    R.id.ikinciSecim -> {
                        tasarim.logo.setImageResource(R.drawable.mylogoss)
                    }
                    R.id.ucuncuSecim -> {
                        tasarim.logo.setImageResource(R.drawable.mylogoss2)
                    }
                    R.id.dorduncuSecim -> {
                        tasarim.logo.setImageResource(R.drawable.mylogoss3)
                    }
                }
            }
            tasarim.toastIsim.setText(v.toastIsimText.text.toString())
            ToastOzel.view = tasarim
            ToastOzel.duration = Toast.LENGTH_SHORT
            ToastOzel.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL, 0, 0)
            ToastOzel.show()

        }

        return v
    }

}
