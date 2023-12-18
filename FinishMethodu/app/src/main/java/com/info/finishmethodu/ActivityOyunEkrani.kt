package com.info.finishmethodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.finishmethodu.databinding.ActivityOyunEkraniBinding

class ActivityOyunEkrani : AppCompatActivity() {
    private lateinit var binding : ActivityOyunEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOyunEkraniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOyunEkrani.setOnClickListener {
            val intent = Intent(this@ActivityOyunEkrani,ActivitySonuc::class.java)
            finish()
            startActivity(intent)
        }
    }
}