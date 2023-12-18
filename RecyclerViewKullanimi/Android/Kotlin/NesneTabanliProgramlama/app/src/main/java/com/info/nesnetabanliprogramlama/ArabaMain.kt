package com.info.nesnetabanliprogramlama

fun main(){

    val bmw = Araba("Mavi",20,true)
    bmw.bilgiVer()
    bmw.renk = "Haki"
    bmw.hız = 39
    bmw.calısıyorMu = false
    println("\n")
    bmw.bilgiVer()
    lateinit var nesne:Araba
    nesne.renk = "kırmızı"
    nesne.hız = 89
    nesne.calısıyorMu = true
    nesne.bilgiVer()
}