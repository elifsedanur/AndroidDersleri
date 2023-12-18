package com.info.nesnetabanliprogramlama3

fun main(){
    val dikdortgen = Dikdortgen(12,13)
    dikdortgen.alanHesapla()
   

}
abstract class Sekil(var uzunluk:Int , var yukseklik:Int){
    abstract fun alanHesapla()
}
class Dikdortgen(uzunluk:Int , yukseklik:Int) : Sekil(uzunluk,yukseklik){
    override fun alanHesapla() {
        println("Alan: ${uzunluk * yukseklik}")
    }
}
abstract class Kare(uzunluk:Int ,yukseklik:Int):Sekil(uzunluk,yukseklik){

}