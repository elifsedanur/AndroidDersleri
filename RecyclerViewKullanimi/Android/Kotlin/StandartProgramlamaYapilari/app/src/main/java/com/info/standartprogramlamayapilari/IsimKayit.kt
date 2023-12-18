package com.info.standartprogramlamayapilari

import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)
    val kayit = Array<String>(5){"0"}
    for((index,isim) in kayit.withIndex()){
        println("${index+1}. isimi giriniz")
        var kayitt = girdi.next()
        kayit[index] = kayitt
    }
    for((i,j) in kayit.withIndex()){
        println("${i+1}. isim $j")

    }



}