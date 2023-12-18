package com.info.radiobuttoncheckboxkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val kotlinDurum = checkBoxKotlin.isChecked
            val javaDurum = checkBoxJava.isChecked
            val barcelonaDurum = radioButtonBarcelona.isChecked
            val realMadridDurum = radioButtonRealMadrid.isChecked
            Log.e("Kotlin Durum",kotlinDurum.toString())
            Log.e("Java Durum",javaDurum.toString())
            Log.e("Barcelona Durum",barcelonaDurum.toString())
            Log.e("RealMadrid Durum",realMadridDurum.toString())
        }
        radioButtonBarcelona.setOnCheckedChangeListener{buttonView, isCheked ->
            if (isCheked)
                Toast.makeText(this,"Tebrikler :)",Toast.LENGTH_SHORT).show()
        }
    }
}