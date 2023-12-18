package com.info.sayfalararasiveritasimagorselnesne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val veri = intent.getStringExtra("veri")
        textViewAlinan.text = veri
    }
}