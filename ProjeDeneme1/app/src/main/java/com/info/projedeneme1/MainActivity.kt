package com.info.projedeneme1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.info.projedeneme1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonKayit.setOnClickListener {
            val isim1 = tasarim.editTextIsim.text.toString()
            val soyisim1 = tasarim.editTextSoyisim.text.toString()
            val dogaTar1 = tasarim.editTextDogTar.text.toString()
            val sifre1 = tasarim.editTextSifre.text.toString()

            val kisi = KisiKayit(isim1,soyisim1,dogaTar1,sifre1)
            Snackbar.make(it,"${kisi.isim} ${kisi.soyIsim} kaydınız başarıyla yapıldı.",Snackbar.LENGTH_LONG).show()
        }

    }
}