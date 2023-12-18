package com.info.preferencesdatastore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ap = AppPref(applicationContext)
        val job = CoroutineScope(Dispatchers.Main).launch {
            ap.kayitAd("Sedanur")
            ap.kayitYas(21)
            ap.kayitBoy(1.58)
            ap.kayitBekar(true)
            val gelenAd = ap.okuAd()
            val gelenYas = ap.okuYas()
            val gelenBoy = ap.okuBoy()
            val gelenBekar = ap.okuBekar()
            val arkadaslar = HashSet<String>()
            arkadaslar.add("Ayse")
            arkadaslar.add("Fatma")
            ap.kayitArkadasListesi(arkadaslar)
            val ark = ap.okuArkadasListesi()
            Log.e("Gelen Ad",gelenAd)
            Log.e("Gelen Yas",gelenYas.toString())
            Log.e("Gelen Boy",gelenBoy.toString())
            Log.e("Gelen Bekar",gelenBekar.toString())
            if(ark != null){
                for(a in ark){
                    Log.e("Ark",a)
                }
            }
        }
    }
}