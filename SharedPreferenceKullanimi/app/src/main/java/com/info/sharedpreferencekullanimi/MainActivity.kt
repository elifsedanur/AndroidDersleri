package com.info.sharedpreferencekullanimi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.sharedpreferencekullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sp = getSharedPreferences("KisiselBilgiler", Context.MODE_PRIVATE)
        val editor = sp.edit()
        /*editor.putString("Ad","Sedanur")
        editor.putInt("yas",20)
        editor.putFloat("boy",1.56f)
        editor.putBoolean("ogrenciMi",true)

        val arkadasListesi = HashSet<String>()
        arkadasListesi.add("Ayşe")
        arkadasListesi.add("Fatma")
        arkadasListesi.add("Elif")
        editor.putStringSet("arkadasListesi",arkadasListesi)*/
        editor.remove("yas")
        editor.commit()
        binding.buttonGit.setOnClickListener {
            val intent = Intent(this@MainActivity,ActivityB::class.java)
            startActivity(intent)
        }
    }
}