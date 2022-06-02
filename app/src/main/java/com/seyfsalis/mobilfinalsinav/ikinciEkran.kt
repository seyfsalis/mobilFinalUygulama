package com.seyfsalis.mobilfinalsinav

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_ikinci_ekran.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.alert_tasarim.*
import kotlin.system.exitProcess

class ikinciEkran : AppCompatActivity() {

    lateinit var sharedPreferences : SharedPreferences
    var sharedPreferencesIsim : String? = null
    var sharedPreferencesOkulNo : String? = null

    val name = "Seyfullah SALIS"
    val number = "02185076051"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_ekran)

        sharedPreferences = this.getSharedPreferences("com.seyfsalis.mobilfinalsinav",
            MODE_PRIVATE)

        sharedPreferencesIsim = sharedPreferences.getString("isim", "")
        sharedPreferencesOkulNo = sharedPreferences.getString("okulNo", "")


        println(sharedPreferencesIsim)
        println(sharedPreferencesOkulNo)

        if((sharedPreferencesIsim == "") && (sharedPreferencesOkulNo == "")){
            isimText.hint = "İsminizi Giriniz"
            okulNoText.hint = "Okul Numaranızı Giriniz"
        }else{
            isimText.setText(sharedPreferencesIsim)
            okulNoText.setText(sharedPreferencesOkulNo)
        }


       /* sharedPreferencesIsim = sharedPreferences.getString("isim", "")
        sharedPreferencesOkulNo = sharedPreferences.getString("okulNo", "")

        if((sharedPreferencesIsim != "") && (sharedPreferencesOkulNo != "")){

            sharedPreferences.edit().remove("isim").apply()
            sharedPreferences.edit().remove("okulNo").apply()

        }*/

        switch1.setOnCheckedChangeListener { compoundButton, kontrol ->


            if ((sharedPreferencesIsim == "") && (sharedPreferencesOkulNo == "")){

                val isim = isimText.text.toString()
                val okulNo = okulNoText.text.toString()


                if ((isim != null) && (okulNo != null)){
                    isimText.setText(isim)
                    okulNoText.setText(okulNo)
                    sharedPreferences.edit().putString("isim", isim).apply()
                    sharedPreferences.edit().putString("okulNo", okulNo).apply()
                }
            }else{

                sharedPreferences.edit().putBoolean("kontrol", false).apply()

                sharedPreferencesIsim = sharedPreferences.getString("isim", "")
                sharedPreferencesOkulNo = sharedPreferences.getString("okulNo", "")

                if((sharedPreferencesIsim != "") && (sharedPreferencesOkulNo != "")){

                    sharedPreferences.edit().remove("isim").apply()
                    sharedPreferences.edit().remove("okulNo").apply()

                }
            }

        }


        girisButon.setOnClickListener{

            val isim = isimText.text.toString()
            val okulNo = okulNoText.text.toString()

            if(isim == "" || okulNo == "") {
                val alert = AlertDialog.Builder(this)
                alert.setTitle("Hata")
                alert.setMessage("Alanlar Boş Bıraklamaz")
                alert.create().show()
            }else if(isim == name && okulNo == number){
                val tasarim = layoutInflater.inflate(R.layout.alert_tasarim, null)
                val alert = AlertDialog.Builder(this)
                alert.setView(tasarim)

                object : CountDownTimer(3000, 1000){
                    override fun onTick(p0: Long) {
                        tasarim.timeText.text =  "${p0/1000}"
                    }
                    override fun onFinish() {
                        val intent = Intent(applicationContext, Anasayfa::class.java)
                        startActivity(intent)
                        finish()
                    }

                }.start()

                alert.create().show()



            }else{
                val alert = AlertDialog.Builder(this)
                alert.setTitle("Hata")
                alert.setMessage("İsim veya numara bilgisi yanlış")
                alert.setNegativeButton("Çık"){dialogInterface, i ->
                    exitProcess(-1)
                }
                alert.setNeutralButton("Yeniden Dene"){dialogInterface, i ->
                    isimText.setText("")
                    okulNoText.setText("")
                }
                alert.create().show()
            }

        }

    }


}