package com.info.standartprogramlamayapilari

import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)
    println("İsim giriniz: ")
    val isim = girdi.next()
    println("Tekrar sayısını giriniz: ")
    var tekrar = girdi.nextInt()
    /*for(i in 1..tekrar){
        println("$i. $isim")
    }*/
    var i = 0
    while(tekrar > 0){
        i++
        println("$i. $isim")
        tekrar -= 1

    }
    var (ad, yas) = Pair("Sedanur", 20)
    println("Yaş = $yas")
    println("Ad = $ad")
}