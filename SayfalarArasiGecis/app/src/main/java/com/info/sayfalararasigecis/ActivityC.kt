package com.info.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }

    override fun onBackPressed() {
        val yeniIntent = Intent(this@ActivityC,MainActivity::class.java)
        startActivity(yeniIntent)
    }
}