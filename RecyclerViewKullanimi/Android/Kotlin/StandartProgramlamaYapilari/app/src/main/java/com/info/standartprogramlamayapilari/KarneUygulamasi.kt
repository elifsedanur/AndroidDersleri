package com.info.standartprogramlamayapilari

import java.util.Scanner

fun main(){
    var degisken : Int
    val girdi = Scanner(System.`in`)
    val dersAdi = Array<String>(5){""}
    val dersNotu = Array<Int>(5){0}
    for(i in 0 until dersAdi.count()){
        println("Ders Adı Giriniz: ")
        var ders = girdi.next()
        dersAdi[i] = ders
        println("Dersin Notunu Giriniz: ")
        var not = girdi.nextInt()
        dersNotu[i] = not
    }
    for(i in 0 until dersAdi.count()){
        println("${dersAdi[i]}: ${dersNotu[i]}")
    }
    var toplam = 0
    for(i in 0 until dersNotu.count()){
        toplam += dersNotu[i]
    }
    var ortalama  = toplam / dersNotu.count()
    if(ortalama > 45){
        println("Geçtiniz: $ortalama")
    }else println("Kaldınız")

}