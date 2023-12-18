package com.info.collectionornekler

fun main(){
    var liste = ArrayList<Int>()
    liste.add(1)
    liste.add(2)
    liste.add(3)
    liste.add(9)
    liste.add(4)
    liste.add(8)
    liste.add(5)
    liste.add(4)
   println("Birinci durum: ${liste.toString()}")

    for((i,l) in liste.withIndex()){
        liste.set(i,(l*2))
    }
    println("ikinci durum: ${liste.toString()}")
}