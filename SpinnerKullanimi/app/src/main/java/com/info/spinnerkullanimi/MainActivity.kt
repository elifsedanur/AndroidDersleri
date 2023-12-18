package com.info.spinnerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val ulkeler = ArrayList<String>()
    private lateinit var veriAdaptoru : ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ulkeler.add("Türkiye")
        ulkeler.add("Polonya")
        ulkeler.add("Fransa")
        ulkeler.add("Italya")
        ulkeler.add("Çin")
        ulkeler.add("Japonya")
        veriAdaptoru = ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,ulkeler)
        spinner.adapter = veriAdaptoru

        spinner.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                Toast.makeText(this@MainActivity,"Seçilen Ülke ${ulkeler[position]}",Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        buttonGoster.setOnClickListener {
            Toast.makeText(this@MainActivity,"Seçilen Ülke ${ulkeler[spinner.selectedItemPosition]}",Toast.LENGTH_SHORT).show()

        }
    }
}