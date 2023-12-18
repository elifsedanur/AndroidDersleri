package com.info.standartprogramlamayapilari

import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)
    println("Toplama (1) \n Çıkarma (2) \n Çarpma (3) \n Bölme (4)")
    val secim = girdi.nextInt()
    println("Birinci Sayıyı giriniz: ")
    val birinciS = girdi.nextInt()
    println("İkinci Sayıyı giriniz: ")
    val ikinciS = girdi.nextInt()
    if(secim == 1){
        val sonuc = birinciS + ikinciS
        println("Sonuc: $sonuc")
    }
    else if(secim == 2){
        val sonuc = birinciS - ikinciS
        println("Sonuc: $sonuc")
    }
    else if(secim == 3){
        val sonuc = birinciS * ikinciS
        println("Sonuc: $sonuc")

    }
    else if(secim == 4){
        if(ikinciS == 0){
            println("sayı sıfıra bölünemez !!")
        }
        else {
            val sonuc = birinciS / ikinciS
            println("Sonuc: $sonuc")}
    }
    else
        println("Hatalı seçim!!")

}