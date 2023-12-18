package com.info.nesnetabanliprogramlama3

fun main(){
 val ogr = ogretmen("Aysenur",26)
    ogr.ogretme()
    println()
    val fut = futbolcu("Fatih",24)
    fut.oynama()
    println()
    val isadamı = IsAdami("Sadık",56)
    isadamı.calısma()

}
open class kişi(var isim:String,var yas:Int){
    init {
        println("Isim: $isim")
        println("Yaş: $yas")
    }
}
class ogretmen(isim:String,yas:Int):kişi(isim,yas){

    fun ogretme() = println("$isim ders veriyor")
}
class futbolcu(isim:String,yas:Int): kişi(isim,yas){
    fun oynama() = println("$isim futbol oynuyor")
}
class IsAdami(isim:String,yas:Int):kişi(isim,yas){
    fun calısma() = println("$isim çakışıyor")
}