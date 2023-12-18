package com.info.collectionornekler

fun main(){
    var meyveler = setOf<String>("Elma","Çilek","Üzüm","dfhj")
    println(meyveler.toString())
    val sehirler = mutableSetOf<String>("Trabzon","Kayseri")
    sehirler.add("Konya")
    sehirler.add("Konya1")
    sehirler.add("Konya2")
    println(sehirler.toString())
    var sayilar = HashSet<Int>()
    sayilar.add(1)
    sayilar.add(9)
    sayilar.add(5)
    println(sayilar.toString())
    sayilar.remove(4)
    println(sayilar.toString())


}