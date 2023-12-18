package com.info.sqlitekullanimi

import android.annotation.SuppressLint
import android.content.ContentValues

class Kisilerdao {
    fun kisiEkle(vt:VeriTabaniYardimcisi,kisi_ad:String,kisi_telno:String,kisi_yas:Int,kisi_boy:Double){
        val db = vt.writableDatabase
        val values = ContentValues()
        values.put("kisi_ad",kisi_ad)
        values.put("kisi_telno",kisi_telno)
        values.put("kisi_yas",kisi_yas)
        values.put("kisi_boy",kisi_boy)
        db.insert("kisiler",null,values)
        db.close()
    }
    @SuppressLint("Range")
    fun tumKisiler(vt: VeriTabaniYardimcisi):ArrayList<Kisiler>{
        val db = vt.writableDatabase
        val kisiler = ArrayList<Kisiler>()
        val cursor = db.rawQuery("SELECT * FROM kisiler",null)
        while (cursor.moveToNext()){
            var kisi = Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no"))
                ,cursor.getString(cursor.getColumnIndex("kisi_ad"))
                ,cursor.getString(cursor.getColumnIndex("kisi_telno"))
                ,cursor.getInt(cursor.getColumnIndex("kisi_yas"))
                ,cursor.getDouble(cursor.getColumnIndex("kisi_boy")))
            kisiler.add(kisi)
        }
        return kisiler

    }
    fun kisiGuncelle(vt:VeriTabaniYardimcisi,kisi_no:Int,kisi_ad:String,kisi_telno:String,kisi_yas:Int,kisi_boy:Double){
        val db = vt.writableDatabase
        val values = ContentValues()
        values.put("kisi_ad",kisi_ad)
        values.put("kisi_telno",kisi_telno)
        values.put("kisi_yas",kisi_yas)
        values.put("kisi_boy",kisi_boy)
        db.update("kisiler",values,"kisi_no=?", arrayOf(kisi_no.toString()))
        db.close()
    }
    fun kisiSil(vt: VeriTabaniYardimcisi,kis_no:Int){
        val db = vt.writableDatabase
        db.delete("kisiler","kisi_no=?", arrayOf(kis_no.toString()))
        db.close()
    }
    @SuppressLint("Range")
    fun arama(vt: VeriTabaniYardimcisi, keyword:String):ArrayList<Kisiler>{
        val db = vt.writableDatabase
        val kisiler = ArrayList<Kisiler>()
        val cursor = db.rawQuery("SELECT * FROM kisiler WHERE kisi_ad LIKE '%$keyword%'",null)
        while (cursor.moveToNext()){
            var kisi = Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),
                cursor.getString(cursor.getColumnIndex("kisi_ad")),
                cursor.getString(cursor.getColumnIndex("kisi_telno")),
                cursor.getInt(cursor.getColumnIndex("kisi_yas")),
                cursor.getDouble(cursor.getColumnIndex("kisi_boy"))
                )
            kisiler.add(kisi)
        }
        return kisiler
    }
    @SuppressLint("Range")
    fun rastgeleVeri(vt: VeriTabaniYardimcisi):ArrayList<Kisiler>{
        val db = vt.writableDatabase
        val kisiler = ArrayList<Kisiler>()
        val cursor = db.rawQuery("SELECT * FROM kisiler ORDER BY RANDOM() LIMIT 2 ",null)
        while (cursor.moveToNext()){
            val kisi = Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),
                cursor.getString(cursor.getColumnIndex("kisi_ad")),
                cursor.getString(cursor.getColumnIndex("kisi_telno")),
                cursor.getInt(cursor.getColumnIndex("kisi_yas")),
                cursor.getDouble(cursor.getColumnIndex("kisi_boy"))
                )
            kisiler.add(kisi)
        }
        return kisiler
    }


    fun kayitkontrol(vt: VeriTabaniYardimcisi,keyword: String):Int{
        val db = vt.writableDatabase
        var sonuc = 0
        val cursor = db.rawQuery("SELECT count(*) AS sayi FROM kisiler Where kisi_ad = '$keyword'",null)
        while (cursor.moveToNext()){
            sonuc = cursor.getInt(cursor.getColumnIndex("sayi")?:0)
        }
        return sonuc
    }
}