package com.info.fabkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.PopupMenu
import android.widget.Toast
import com.info.fabkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener{
            val menu = PopupMenu(this@MainActivity,binding.fab)
            menu.menuInflater.inflate(R.menu.fabmenu,menu.menu)
            menu.show()
        }
        binding.button.setOnClickListener{
            val ad = binding.edittextAd.text.toString().trim()
            val tel = binding.edittextTel.text.toString().trim()
            if(TextUtils.isEmpty(ad)){
                Toast.makeText(this@MainActivity,"Ad boş bırakılamaz!!",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(tel)){
                Toast.makeText(this@MainActivity,"Telefon numarası boş bırakılamaz!!",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (tel.length < 6){
                Toast.makeText(this@MainActivity,"Telefon numarası on hane olmalıdır!!",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this@MainActivity,"$ad - $tel",Toast.LENGTH_SHORT).show()

        }
    }
}