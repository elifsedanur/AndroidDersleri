package com.info.simpleloginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.simpleloginscreen.databinding.ActivitySuccessfulBinding

class ActivitySuccessful : AppCompatActivity() {
    private lateinit var binding:ActivitySuccessfulBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccessfulBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val gecis = intent.getIntExtra("gecis",0)
        if(gecis == 1){
            binding.textViewSuccess.text = "Giriş Başarılı"
        }
        else if(gecis == 2){
            binding.textViewSuccess.text = "Hesabınız Başarıyla Oluşturuldu"
        }
        binding.buttonExit.setOnClickListener {
            startActivity(Intent(this@ActivitySuccessful,MainActivity::class.java))
            finish()
        }
    }
}