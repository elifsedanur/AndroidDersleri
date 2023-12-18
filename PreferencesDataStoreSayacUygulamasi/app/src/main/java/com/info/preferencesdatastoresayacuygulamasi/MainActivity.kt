package com.info.preferencesdatastoresayacuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.info.preferencesdatastoresayacuygulamasi.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val job = CoroutineScope(Dispatchers.Main).launch {
            val ap = AppPref(applicationContext)
            var gelenSayac = ap.okusayac()
            ap.kayitsayac(gelenSayac++)
            binding.textViewSayac.text = "Açılış Sayısı: $gelenSayac"
        }
    }
}