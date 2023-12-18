package com.info.nesnetabanliprogramlama

fun main(){
    val metro = Otobus(100,"Trabzon","Ordu",39)
    println("Kapasite : ${metro.kapasite}")
    println("Nereden : ${metro.nereden}")
    println("Nereye : ${metro.nereye}")
    println("Mevcut Yolcu : ${metro.mevcutYolcu}")
    /*metro.kapasite = 50
    metro.nereden = "Rize"
    metro.nereye = "Sivas"
    metro.mevcutYolcu = 20
    metro.bilgiAl()*/
    metro.yolcuAl(9)
    metro.yolcuIndir(4)


}