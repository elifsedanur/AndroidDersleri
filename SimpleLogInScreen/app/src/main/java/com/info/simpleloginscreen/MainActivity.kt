package com.info.simpleloginscreen

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.info.simpleloginscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var kullaniciAdi:String?
        var sifre:String?
        binding.buttonLogIn.setOnClickListener {
            if (TextUtils.isEmpty(binding.editTextUsername.text)) {
                Toast.makeText(
                    applicationContext,
                    "Kullanıcı adı boş bırakılamaz!!",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            } else {
                kullaniciAdi = binding.editTextUsername.text.toString()
            }
            if (TextUtils.isEmpty(binding.editTextPassword.text)) {
                Toast.makeText(applicationContext, "Şifre boş bırakılamaz!!", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            } else {
                sifre = binding.editTextPassword.text.toString()
            }
            val sp = getSharedPreferences("KisiselBilgiler", Context.MODE_PRIVATE)
            if (sp.getString(kullaniciAdi, null) == sifre) {
                val intent = Intent(this@MainActivity, ActivitySuccessful::class.java)
                intent.putExtra("gecis", 1)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Böyle bir hesap bulunamadı, lütfen tekrar deneyiniz.",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
        }
            binding.buttonSignup.setOnClickListener {
                startActivity(Intent(this@MainActivity,ActivitySignUp::class.java))
            }

    }
}