package com.info.toolbarkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.info.toolbarkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.apply {
            title = "ToolBar Başlığı"
            subtitle = "ToolBar Alt Başlığı"
            setLogo(R.drawable.resim)
            setTitleTextColor(resources.getColor(R.color.purple_500))
        }
        setSupportActionBar(binding.toolbar)
    }


    /*
    Toolbara menu ekleme
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }
*/
    /*
    Toolbara eklenen menudeki itemları yakalayıp işleme sokma
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_bilgi -> {
                Toast.makeText( applicationContext,"Bilgi Seçildi",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_ekle -> {
                Toast.makeText( applicationContext,"Ekle Seçildi",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_sil -> {
                Toast.makeText( applicationContext,"Sil Seçildi",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_duzenle-> {
                Toast.makeText( applicationContext,"Düzenle Seçildi",Toast.LENGTH_SHORT).show()
                return true
            }
            else ->   return super.onOptionsItemSelected(item)
        }

    }*/
    //Toolbara arama özelliği ekleme
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_arama,menu)
        val item = menu!!.findItem(R.id.action_ara)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        Log.e("onQueryTextSubmit",query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean {
        Log.e("onQueryTextChange",newText)
        return true
    }
}