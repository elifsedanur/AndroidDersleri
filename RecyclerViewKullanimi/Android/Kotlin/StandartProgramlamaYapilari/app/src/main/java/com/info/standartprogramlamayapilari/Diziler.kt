package com.info.standartprogramlamayapilari

fun main(){
    val meyveler = arrayOf(3,6)
   // println(meyveler.contentToString())
    val dizi1 = Array<Int>(4){0}
    println(dizi1.contentToString())
    val dizi2 = arrayOf<Double>(2.1,3.2)
    println(dizi2.contentToString())
    val dizi3 = arrayOf("Elif","Sedanur","Aksoy")
    println(dizi3[1])
    println(dizi3.get(0))
    dizi3[0] = "Kubra"
    println(dizi3.contentToString())
    dizi3.set(1,"Seda")
    println(dizi3.contentToString())
    println(dizi3.isEmpty())
    println(dizi3.count())
    println(dizi3.first())
    println(dizi3.last())
    println(dizi3.indexOf("Sedan"))
    println(dizi3.contains("Sedan"))
    println(dizi3.min())
    println(dizi3.max())
    println(dizi3.contentToString())
    dizi3.sort()
    println(dizi3.contentToString())
    dizi3.reverse()
    println(dizi3.contentToString())

}