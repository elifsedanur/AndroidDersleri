package com.info.sayfalararasiveritasima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val gelenMesaj = intent.getStringExtra("mesaj")
        val gelenYas = intent.getIntExtra("yas",0)
        val gelenBoy = intent.getDoubleExtra("boy",0.0)

        Log.e("MESAJ",gelenMesaj)
        Log.e("YAŞ",gelenYas.toString())
        Log.e("BOY",gelenBoy.toString())

        val gelenKisi = intent.getSerializableExtra("nesne") as Kisiler

        Log.e("KİŞİ TCNO",(gelenKisi.tcno).toString())
        Log.e("KİŞİ İSİM",gelenKisi.isim)
        Log.e("KİŞİ BOY",(gelenKisi.boy).toString())

    }
}
