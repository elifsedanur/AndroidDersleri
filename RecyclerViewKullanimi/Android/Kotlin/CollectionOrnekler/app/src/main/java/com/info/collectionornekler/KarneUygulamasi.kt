package com.info.collectionornekler

import java.util.Scanner

fun main(){
    var girdi = Scanner(System.`in`)
    println("Girilecek ders sayısı:")
    var count = girdi.nextInt()
    var s = ArrayList<Sinif>()
    for(i in 1..count){
        println("Ders adı: ")
        var dersAd = girdi.next()
        println("Not: ")
        var not = girdi.nextInt()
        var s1 = Sinif(dersAd,not)
        s.add(s1)
    }
    var toplam = 0
    for(e in s){
        toplam += e.not
    }
    var geçme = toplam / count
    if(geçme >= 50){
        println("Tebrikler $geçme ortalama ile sınıfı geçtiniz")
    }else{
        println("Üzgünüm $geçme ortalama ile sınıfta kaldınız")
    }

}