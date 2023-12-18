package com.info.sqlitekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vt = VeriTabaniYardimcisi(this@MainActivity)
        //Kisilerdao().kisiEkle(vt,"Bakan","11111",24,1.63)
        //Kisilerdao().kisiEkle(vt,"maran","22222",30,1.69)
        //Kisilerdao().kisiGuncelle(vt,2,"Suna","01234",36,1.98)
        //Kisilerdao().kisiSil(vt,2)
        val kisiler = Kisilerdao().tumKisiler(vt)
        //val kisiler = Kisilerdao().arama(vt,"e")
        val sonuc = Kisilerdao().kayitkontrol(vt,"Elif")


        //val kisiler = Kisilerdao().rastgeleVeri(vt)
        for(k in kisiler){
            Log.e("Kisi no:",(k.kisi_no).toString())
            Log.e("Kisi ad:",(k.kisi_ad).toString())
            Log.e("Kisi telno:",(k.kisi_telno).toString())
            Log.e("Kisi yas:",(k.kisi_yas).toString())
            Log.e("Kisi boy:",(k.kisi_boy).toString())
        }
        Log.e("Kisi kayit",sonuc.toString())
    }
}