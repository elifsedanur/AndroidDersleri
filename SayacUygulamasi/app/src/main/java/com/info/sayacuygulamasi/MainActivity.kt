package com.info.sayacuygulamasi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayacuygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sp = getSharedPreferences("sayacUygulamasi", Context.MODE_PRIVATE)
        var sayac = sp.getInt("say",0)
        val editor = sp.edit()
        editor.putInt("say",++sayac)
        editor.commit()
        binding.textViewSayac.text = "Açılış Sayısı: $sayac"
    }
}