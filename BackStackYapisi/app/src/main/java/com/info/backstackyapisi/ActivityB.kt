package com.info.backstackyapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.backstackyapisi.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    private  lateinit var binding : ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGoToC.setOnClickListener {
            startActivity(Intent(this@ActivityB,ActivityC::class.java))
        }
    }
}