package com.info.fragmentcalismasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val ft = fm.beginTransaction()

        ft.add(R.id.frame1,BirinciFragment())
        ft.add(R.id.frame2,IkinciFragment())
        ft.commit()
    }
}