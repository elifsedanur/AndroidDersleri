package com.info.standartprogramlamayapilari

import java.util.Scanner

fun main(){
    println("Dikdörtgen Alanı(1)\nÇember Alanı(2)")
    var girdi = Scanner(System.`in`)
    var secim = girdi.next()
    if(secim == "1"){
        println("Kısa kenar giriniz: ")
        var KısaKenar = girdi.nextInt()
        println("Uzun kenar giriniz: ")
        var uzunKenar = girdi.nextInt()
        println("Dikdörtgen Alani: ${KısaKenar*uzunKenar}")
    }
    if(secim == "2"){
        println("Yarı çap giriniz: ")
        var yCap = girdi.nextDouble()
        val pi = 3.14
        println("Çember alanı : ${yCap*pi}")
    }


}