package com.info.standartprogramlamayapilari

fun main(){

    val meyveler = arrayOf<String>("Çilek","Muz","Kivi","Elma","Kiraz")
    for(meyve in meyveler){
        println("Sonuç: $meyve")
    }
    for((index,meyve) in meyveler.withIndex()){
        println("Sonuç $index. : $meyve")
    }
}