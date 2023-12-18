package com.info.standartprogramlamayapilari

import java.util.Scanner

fun main(){
   /* val gun = 1

    when(gun){
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3-> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle bir gün yok")

    }*/
    println("Toplama (1)\nÇıkarma (2)\nÇarpma (3)\nBölme (4)")
    val girdi = Scanner(System.`in`)
    println("Seçiminiz: ")
    val sec = girdi.nextInt()
    println("Birinci Sayı: ")
    val sayi1 = girdi.nextInt()
    println("İkinci Sayı: ")
    val sayi2 = girdi.nextInt()

    when(sec){
        1-> {println("Sonuç : ${sayi1+sayi2}")}
        2-> {println("Sonuç : ${sayi1-sayi2}")}
        3-> {println("Sonuç : ${sayi1*sayi2}")}
        4-> {println("Sonuç : ${sayi1/sayi2}")}
        else-> println("Hatalı seçim")
    }
}