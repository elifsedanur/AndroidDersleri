package com.info.yenitaslakproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.info.yenitaslakproje.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main)

        tasarim.textViewSonuc.text="0"

                tasarim.buttonToplama.setOnClickListener {
                    val birinciSayi = tasarim.editTextSayi1.text.toString()
                    val ikinciSayi = tasarim.editTextsayi2.text.toString()
                    val sayi1 = birinciSayi.toInt()
                    val sayi2 = ikinciSayi.toInt()
                    val sonuc = sayi1 + sayi2
                    tasarim.textViewSonuc.text = sonuc.toString()
                }
                tasarim.buttonCarpma.setOnClickListener {
                    val birinciSayi = tasarim.editTextSayi1.text.toString()
                    val ikinciSayi = tasarim.editTextsayi2.text.toString()
                    val sayi1 = birinciSayi.toInt()
                    val sayi2 = ikinciSayi.toInt()
                    val sonuc = sayi1 * sayi2
                    tasarim.textViewSonuc.text = sonuc.toString()
                }
    }
}