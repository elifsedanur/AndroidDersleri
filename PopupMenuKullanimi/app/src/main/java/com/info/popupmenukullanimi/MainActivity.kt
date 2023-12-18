package com.info.popupmenukullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.info.popupmenukullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonMenu.setOnClickListener {
            val popup = PopupMenu(this,binding.buttonMenu)
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
            popup.setOnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.action_duzenle ->{
                        Toast.makeText(this,"Düzenle seçildi",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_sil ->{
                        Toast.makeText(this,"Sil seçildi",Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
            popup.show()
        }
    }
}