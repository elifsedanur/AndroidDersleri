package com.info.sharedpreferencekullanimi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sharedpreferencekullanimi.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private lateinit var binding : ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sp = getSharedPreferences("KisiselBilgiler",Context.MODE_PRIVATE)
        val isim = sp.getString("Ad","isim yok")
        val yas = sp.getInt("yas",0)
        val boy = sp.getFloat("boy",0.0f)
        val ogrenci = sp.getBoolean("ogrenciMi",true)
        val arkadasListesi = sp.getStringSet("arkadasListesi",null)

        binding.textViewGoster.text = "Ad: ${isim}\n Yas: ${yas}\n Boy: ${boy}\n Öğrenci Mi: $ogrenci \n Arkadaslar: $arkadasListesi"
    }
}