package com.info.collectionornekler

import java.util.Scanner

fun main(){
    val meyveler = ArrayList<String>()
    meyveler.add("Elma")
    meyveler.add("Armut")
    meyveler.add("Kiraz")
    meyveler.add("Vişne")
    meyveler.add("Karpuz")
    val girdi = Scanner(System.`in`)
    println("Aranacak meyvenin ismini giriniz: ")
    var m = girdi.next()
    for((index,eleman) in meyveler.withIndex()){
        if(eleman == m){
            println("Girdiğiniz meyve dizinin ${index}. elemanıdır.")
        }
    }

}