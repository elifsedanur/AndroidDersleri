package com.info.sayfalararasiveritasima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

@Suppress("DEPRECATION")
class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val gelenMesaj = intent.getStringExtra("mesaj")
        val yas = intent.getIntExtra("yas",0)
        val boy = intent.getDoubleExtra("boy",0.0)
        val gelenkisi = intent.getSerializableExtra("nesne") as Kisiler
        Log.e("mesaj",gelenMesaj.toString())
        Log.e("yas",yas.toString())
        Log.e("boy",boy.toString())
        Log.e("Kisi tc",gelenkisi.tc.toString())
        Log.e("kisi ad",gelenkisi.isim)
        Log.e("Kisi yas",gelenkisi.yas.toString())
        Log.e("Kisi boy",gelenkisi.boy.toString())
    }
}