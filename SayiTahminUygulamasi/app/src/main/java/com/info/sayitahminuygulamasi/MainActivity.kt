package com.info.sayitahminuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.info.sayitahminuygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var secim : String? = null
        binding.buttonPlay.setOnClickListener {
            secim = binding.editTextSecim.text.toString()
             if(secim == null){
                 Snackbar.make(it,"Lütfen Bir Seçim Yapınız!!",Snackbar.LENGTH_LONG).show()
             }else if(secim != "1" && secim != "2"){
                 Snackbar.make(it,"Lütfen Geçerli Bir Seçim Yapınız!!",Snackbar.LENGTH_LONG).show()
             }else{
                 val yeniIntent = Intent(this@MainActivity,ActivityOyunEkrani::class.java)
                 yeniIntent.putExtra("secim",secim)
                 startActivity(yeniIntent)
             }
        }
    }



}