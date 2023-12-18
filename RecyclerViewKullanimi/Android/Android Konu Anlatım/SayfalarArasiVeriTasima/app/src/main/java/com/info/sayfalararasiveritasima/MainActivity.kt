package com.info.sayfalararasiveritasima


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGonder.setOnClickListener {

            val kisi = Kisiler(99999,"Ahmet",1.98)

            val yeniIntent = Intent(this@MainActivity,ActivityB::class.java)

            yeniIntent.putExtra("mesaj","merhaba")
            yeniIntent.putExtra("yas",23)
            yeniIntent.putExtra("boy",1.78)
            yeniIntent.putExtra("nesne",kisi)

            startActivity(yeniIntent)

        }


    }
}
