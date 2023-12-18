package com.info.nesnetabanliprogramlama

class Matematik {

    fun topla(sayi1:Int,sayi2:Int){
        var toplam = sayi1+sayi2
        println("Toplam : $toplam")
    }
    fun cikar(sayi1:Int,sayi2:Int):String{
        var sonuc = sayi1 - sayi2
        return "Çıkarma: $sonuc"
    }
    fun carp(sayi1:Double,sayi2:Double){
        var sonuc = sayi1*sayi2
        println("Çarpım : $sonuc")
    }
    fun bol(sayi1:Int,sayi2:Int):String{
        return "Bölme sonucu: ${sayi1 / sayi2}"
    }
}