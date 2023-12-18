package com.info.yasamdongusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("OnCreate","Çalıstı")
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart","Çalıstı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume","Çalıstı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause","Çalıstı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","Çalıstı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","Çalıstı")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","Çalıstı")

    }
}