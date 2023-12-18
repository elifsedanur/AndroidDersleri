package com.info.collectionornekler

import java.util.Scanner

fun main(){

    var isimler = ArrayList<String>()
    isimler.add("Elif")
    isimler.add("Sedanur")
    isimler.add("Ayşenur")
    isimler.add("Fatma")
    isimler.add("Fatih")
    isimler.add("Furkan")

    val girdi = Scanner(System.`in`)
    println("Aranacak ismi giriniz:")
    var isim = girdi.next()
    var flag = 0
    for(i in isimler){
        if(i == isim){
            flag = 1
            break
        }
    }
    if(flag == 1) println("$isim ismi listede vardir")
    else println("$isim ismi listede bulunamamıştır.")



}