package com.info.alertviewkullanimi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonNormal.setOnClickListener {
            val alertView = AlertDialog.Builder(this@MainActivity)
            alertView.setMessage("Mesaj")
            alertView.setTitle("Başlık")
            alertView.setIcon(R.drawable.resim)
            alertView.setPositiveButton("Tamam"){dialogInterface, i ->
                Toast.makeText(this@MainActivity,"Button Tamam Seçildi",Toast.LENGTH_SHORT).show()
            }
            alertView.setNegativeButton("İptal"){dialogInterface, i ->
                Toast.makeText(this@MainActivity,"Button İptal Seçildi",Toast.LENGTH_SHORT).show()
            }
            alertView.create().show()
        }
        buttonOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.alertviewlayout,null)
            val editTextAlert = tasarim.findViewById<EditText>(R.id.editTextalertView)
            val alertView = AlertDialog.Builder(this@MainActivity)
            alertView.setMessage("Mesaj")
            alertView.setTitle("Başlık")
            alertView.setIcon(R.drawable.resim)
            alertView.setView(tasarim)
            alertView.setPositiveButton("Tamam"){DialogInterface, i ->
                val alinanVeri = editTextAlert.text.toString()
                Toast.makeText(this@MainActivity,"Alinan veri: $alinanVeri",Toast.LENGTH_SHORT).show()
            }
            alertView.setNegativeButton("İptal"){dialogInterface, i ->
                Toast.makeText(this@MainActivity,"Button İptal Seçildi",Toast.LENGTH_SHORT).show()
            }
            alertView.create().show()

        }
    }
}