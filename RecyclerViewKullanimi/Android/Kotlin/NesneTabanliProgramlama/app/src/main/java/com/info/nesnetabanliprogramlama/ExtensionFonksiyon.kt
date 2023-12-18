package com.info.nesnetabanliprogramlama

fun main(){

fun Int.carp(sayi:Int):Int{

    return this*sayi
}
    val sonuc = 3.carp(4)
    println(sonuc)
    infix fun Int.topla(sayi:Int) =  this + sayi
    println(4 topla(6))

}