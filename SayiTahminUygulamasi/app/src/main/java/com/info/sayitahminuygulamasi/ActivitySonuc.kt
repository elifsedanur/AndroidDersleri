package com.info.sayitahminuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sayitahminuygulamasi.databinding.ActivitySonucBinding

class ActivitySonuc : AppCompatActivity() {
    private lateinit var binding :ActivitySonucBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonucBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var tahminSayi = intent.getStringExtra("sayi")
        binding.textViewSonuc.text = "Tutttuğum sayı $tahminSayi"

    }
}