package com.info.stringkullanimi

import java.util.Scanner

fun main(){
    var girdi = Scanner(System.`in`)
    println("Ters çevrilecek kelimeyi giriniz:")
    var kelime = readLine()!!
    for(i in kelime.length-1 downTo 0){
        print(kelime[i])
    }



}