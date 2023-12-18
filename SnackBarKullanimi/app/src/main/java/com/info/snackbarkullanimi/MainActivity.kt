package com.info.snackbarkullanimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.info.snackbarkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNormal.setOnClickListener {
            Snackbar.make(it,"Merhaba",Snackbar.LENGTH_LONG).show()
        }
        binding.buttonGeriDonus.setOnClickListener {view ->
            Snackbar.make(view,"Mesaj silinsin mi?",Snackbar.LENGTH_LONG)
                .setAction("Evet"){ x ->
                    Snackbar.make(x,"Mesaj silindi",Snackbar.LENGTH_LONG).show()
                }
                .show()
        }
        binding.buttonOzel.setOnClickListener {view ->
            val snackbar:Snackbar = Snackbar.make(view,"İnternet bağlantısı yok",Snackbar.LENGTH_LONG)
            snackbar.setAction("Tekrar Dene"){

            }
            snackbar.setActionTextColor(Color.GREEN)
            snackbar.setTextColor(Color.MAGENTA)
            snackbar.setBackgroundTint(Color.WHITE)
            snackbar.show()
        }
    }
}