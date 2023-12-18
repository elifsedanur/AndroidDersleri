package com.info.toastmesajkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.DocumentsContract.Root
import android.view.Gravity
import android.widget.Toast
import com.info.toastmesajkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonNormal.setOnClickListener {
            Toast.makeText(applicationContext,"Merhaba",Toast.LENGTH_SHORT).show()
        }
        binding.buttonozel.setOnClickListener {
            var toastOzel:Toast  = Toast.makeText(applicationContext,"Merhaba Özel Mesaj",Toast.LENGTH_SHORT)
            toastOzel.setGravity(Gravity.BOTTOM or Gravity.RIGHT,0,0)
            toastOzel.show()
        }
    }
}