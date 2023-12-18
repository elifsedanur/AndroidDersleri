package com.info.sayfalararasiveritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kisi = Kisiler(1234,"Sedanur",20,160.4)
        buttonGonder.setOnClickListener {
            val yeniIntent = Intent(this@MainActivity,ActivityB::class.java)

            yeniIntent.putExtra("mesaj","merhaba")
            yeniIntent.putExtra("yas",20)
            yeniIntent.putExtra("boy",1.56)
            yeniIntent.putExtra("nesne",kisi)
            startActivity(yeniIntent)
        }

    }
}