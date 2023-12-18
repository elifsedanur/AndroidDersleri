package com.info.nesnetabanliprogramlama3

fun main(){
    val oto = Otomobil()
 val aracc = Arac2()
 aracc.hızlanma()

}
 open class Arac2(var renk:String = "kırmızı",var hız:Int = 100){
  fun hızlanma() = println("Araç hızlanıyor")
  fun yavaşlama() = println("Araç yavaşlıyor")
 }
open class tekerlekliArac(var tekerlek:Boolean = true):Arac2()
class Otomobil: tekerlekliArac()