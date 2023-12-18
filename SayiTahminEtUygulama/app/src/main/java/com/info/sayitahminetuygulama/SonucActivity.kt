package com.info.sayitahminetuygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayitahminetuygulama.databinding.ActivitySonucBinding

class SonucActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySonucBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonucBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sonuc = intent.getBooleanExtra("Sonuc",false)
        if(sonuc){
            binding.imageViewSonuc.setImageResource(R.drawable.mutluresim)
            binding.textViewSonuc.text = "KAZANDINIZ"
        }
        else{
            binding.imageViewSonuc.setImageResource(R.drawable.uzgunresim)
            binding.textViewSonuc.text = "KAYBETTİNİZ"
        }
        binding.buttonTekrar.setOnClickListener {
            val intent = Intent(this@SonucActivity,TahminActivity::class.java)
            finish()
            startActivity(intent)
        }

    }
}