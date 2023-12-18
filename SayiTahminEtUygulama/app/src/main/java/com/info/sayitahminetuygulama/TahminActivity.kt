package com.info.sayitahminetuygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import com.info.sayitahminetuygulama.databinding.ActivityTahminBinding
import java.util.*
import  kotlin.random.Random


class TahminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTahminBinding
    private var rastgeleSayi:Int = 0
    private var sayac:Int = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTahminBinding.inflate(layoutInflater)
        setContentView(binding.root)
        rastgeleSayi = Random.nextInt(101)
        Log.e("Rastgele sayi",rastgeleSayi.toString())
        binding.buttonTahmin.setOnClickListener {
            sayac -= 1
            if(TextUtils.isEmpty(binding.editTextGirdi.text)){
                binding.textViewKalanHak.text = "$sayac"
                Toast.makeText(this, "Lütfen sayı giriniz.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            var tahmin = binding.editTextGirdi.text.toString().toInt()
             if(tahmin == rastgeleSayi){
                 val intent = Intent(this@TahminActivity,SonucActivity::class.java)
                 intent.putExtra("Sonuc",true)
                 finish()
                 startActivity(intent)
                 return@setOnClickListener
                }
             if(tahmin > rastgeleSayi){
                binding.textViewYardim.text = "AZALT"
                 binding.textViewKalanHak.text = "$sayac"
             }
             if(tahmin < rastgeleSayi){
                 binding.textViewYardim.text = "ARTTIR"
                 binding.textViewKalanHak.text = "$sayac"
             }
            if(sayac == 0){
            val intent = Intent(this@TahminActivity,SonucActivity::class.java)
            intent.putExtra("Sonuc",false)
            finish()
            startActivity(intent)
        }
            binding.editTextGirdi.setText("")
        }

    }
}