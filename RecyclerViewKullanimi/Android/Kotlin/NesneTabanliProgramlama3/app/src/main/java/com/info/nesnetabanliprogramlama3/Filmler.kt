package com.info.nesnetabanliprogramlama3

class Filmler(var film_id:Int,var film_ad:String,var film_yıl:Int,var kategori:Kategoriler,var yonetmen:Yonetmenler) {
    fun bilgiVer(){
        println("Film id: $film_id")
        println("Film ad: $film_ad")
        println("Film yıl: $film_yıl")
        println("Kategori: ${kategori.kategori_ad}")
        println("Yönetmen: ${yonetmen.yonetmen_ad}")
    }
}