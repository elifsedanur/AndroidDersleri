package com.info.collectionornekler

fun main(){
    val k1 = Kisi(3,"Fatma")
    val k2 = Kisi(2,"Kübra")
    val k3 = Kisi(1,"Elif")

    val kisilerArrayList = ArrayList<Kisi>()
    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    println("Önce")
    for(k in kisilerArrayList){
        println("${k.kisiNo}-${k.kisiAd}")
    }
    val kisilerArray2 = kisilerArrayList.sortedWith(compareBy { it.kisiNo })
    println("Kişi numarasına göre sıraladıktan sonra")
    for(k in kisilerArray2){
        println("${k.kisiNo}-${k.kisiAd}")
    }
    val kisilerArray3 = kisilerArrayList.sortedWith(compareBy { it.kisiAd })
    println("Kişi adına göre sıraladıktan sonra")

    for(k in kisilerArray3){
        println("${k.kisiNo}-${k.kisiAd}")
    }
    val kisilerArray4 = kisilerArrayList.sortedWith(compareByDescending{it.kisiAd})
    println("Kişi adına göre büyükten küçüğe sıralama")
    for(k in kisilerArray4){
        println("${k.kisiNo}-${k.kisiAd}")
    }
}