package com.info.nesnetabanliprogramlama3

class Kisiler(var ad:String,var soyad:String,var yas:Int,var adres:Adres) {
    fun bilgiVer(){
        println("Ad: $ad")
        println("Soyad: $soyad")
        println("Yaş: $yas")
        println("İl: ${adres.il}")
        println("İlçe: ${adres.ilce}")

    }
}