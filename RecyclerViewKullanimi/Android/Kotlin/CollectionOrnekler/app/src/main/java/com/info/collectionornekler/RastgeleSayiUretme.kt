package com.info.collectionornekler

import kotlin.random.Random

fun main(){
    var sayilar = ArrayList<Int>()
    for(i in 1..10){
        var sayi = Random.nextInt(0,101)
        sayilar.add(sayi)
    }
    println(sayilar.toString())
    sayilar.sort()
    println(sayilar.toString())


}