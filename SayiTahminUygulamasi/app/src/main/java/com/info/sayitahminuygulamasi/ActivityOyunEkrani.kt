package com.info.sayitahminuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.info.sayitahminuygulamasi.databinding.ActivityMainBinding
import com.info.sayitahminuygulamasi.databinding.ActivityOyunEkraniBinding
import kotlin.random.Random

class ActivityOyunEkrani : AppCompatActivity() {
    private lateinit var binding : ActivityOyunEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOyunEkraniBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val secim = intent.getStringExtra("secim")

        if(secim == "1"){
           var sayi = Random.nextInt(1,11).toString()
            binding.textViewBaslK.text = "Aklımdan 1-10 Arası Bir Sayı Tuttum Hadi Tahmin Et"
            var kalanHak : Int = 3

            binding.textViewHak.text = kalanHak.toString()
        for(i in 1..kalanHak){
            binding.buttonTahmin.setOnClickListener {
                var tahmin = binding.editTextTahmin.text.toString()

                if(sayi != tahmin && kalanHak != 0){
                    kalanHak -= 1
                    binding.textViewHak.text = kalanHak.toString()
                    Toast.makeText(this,"Yanlış Tahmin Tekrar Dene..",Toast.LENGTH_SHORT).show()
                                    }
                else if(sayi == tahmin){
                    val intent = Intent(this@ActivityOyunEkrani,ActivitySonuc::class.java)
                    intent.putExtra("sayi",sayi)
                    startActivity(intent)
                }

            }}
        }else if(secim == "2"){
            var sayi = Random.nextInt(1,101).toString()
            binding.textViewBaslK.text = "Aklımdan 1-100 Arası Bir Sayı Tuttum Hadi Tahmin Et"
            var kalanHak : Int = 5
            binding.textViewHak.text = kalanHak.toString()
            for(i in 1..kalanHak){
            binding.buttonTahmin.setOnClickListener {
                var tahmin = binding.editTextTahmin.text.toString()

                if(sayi != tahmin && kalanHak != 0){
                    kalanHak -= 1
                    binding.textViewHak.text = kalanHak.toString()
                    Toast.makeText(this,"Yanlış Tahmin Tekrar Dene..",Toast.LENGTH_SHORT).show()
                }
                else if(sayi == tahmin){
                    val intent = Intent(this@ActivityOyunEkrani,ActivitySonuc::class.java)
                    intent.putExtra("sayi",sayi)
                    startActivity(intent)
                }
            }
        }
    }
    }
}