package com.info.collectionornekler

fun main(){
    val TumSayilar = ArrayList<Int>()
    TumSayilar.add(1)
    TumSayilar.add(2)
    TumSayilar.add(3)
    TumSayilar.add(4)
    TumSayilar.add(5)
    TumSayilar.add(6)
    TumSayilar.add(7)
    TumSayilar.add(8)
    TumSayilar.add(9)
    val ciftSayılar = ArrayList<Int>()
    val tekSayılar = ArrayList<Int>()
    for(s in TumSayilar){
        if(s % 2 == 0){
            ciftSayılar.add(s)
        }else{
            tekSayılar.add(s)
        }
    }
    println("Tüm sayılar: ${TumSayilar.toString()}")
    println("Çift Olanlar: ${ciftSayılar.toString()}")
    println("Tek Olanlar: ${tekSayılar.toString()}")


}