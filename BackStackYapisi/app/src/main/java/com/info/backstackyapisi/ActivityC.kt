package com.info.backstackyapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.backstackyapisi.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    private lateinit var binding : ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGoToD.setOnClickListener {
            startActivity(Intent(this@ActivityC,ActivityD::class.java))
        }
    }
}