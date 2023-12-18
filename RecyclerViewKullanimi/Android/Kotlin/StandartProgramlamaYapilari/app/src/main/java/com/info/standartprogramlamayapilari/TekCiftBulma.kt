package com.info.standartprogramlamayapilari

import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)
    var secim = 2
    while(secim != 1){
        println("Sayı giriniz: ")
        var sayi = girdi.nextInt()
        if(sayi % 2 == 0){
            println("$sayi çift sayıdır")
        }
        else println("$sayi tek sayidir")
        println("Çıkmak için 1 - devam etmek için diğer sayılar")
        secim = girdi.nextInt()


    }
}