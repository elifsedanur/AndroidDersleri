package com.info.nesnetabanliprogramlama2

class Personel {
    var isim:String
    var ikinciIsim:String?
    var soyad:String
    var kimlikNo:String
    var sicilNo:String

    constructor(ad:String, ikinciAd:String?, Soyad:String, KimlikNo:String, SicilNo:String){
        this.isim = ad
        this.ikinciIsim = ikinciAd
        this.soyad = Soyad
        this.kimlikNo = KimlikNo
        this.sicilNo = SicilNo
    }

    fun bilgiVer(){
        println("İsim: $isim")
        if(ikinciIsim != null){
            println("İkinci İsim: ${ikinciIsim!!}")
        }
        println("Soyad: ${soyad}\nKimlik No: ${kimlikNo}\nSicil No: ${sicilNo}\n")

    }
}