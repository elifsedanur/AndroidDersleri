package com.info.sayfalararasiveritasimagorselnesne

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGonder.setOnClickListener {
            val alinanVeri = editTextGonderilen.text.toString()
            val newIntent = Intent(this@MainActivity,ActivityB::class.java)
            newIntent.putExtra("veri",alinanVeri)
            startActivity(newIntent)
        }
    }
}