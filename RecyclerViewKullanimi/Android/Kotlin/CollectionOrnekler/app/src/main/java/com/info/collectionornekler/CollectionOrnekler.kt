package com.info.collectionornekler

fun main(){
    val liste = ArrayList<Int>()
    val liste2 : ArrayList<String> = ArrayList<String>()
    liste.add(1)
    liste.add(2)
    liste.add(3)

    val meyveler = ArrayList<String>()
    meyveler.add("Çilek")
    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Kivi")
   // println(meyveler.toString())
    //meyveler[3] = "Mandalina"
    //println(meyveler.toString())
    //meyveler.add(2,"Portakal")
    //println(meyveler.toString())
    for(meyve in meyveler){
        println("meyve : $meyve")
    }
    for((indeks,meyve)in meyveler.withIndex()){
        println("${indeks}. $meyve")
    }

}