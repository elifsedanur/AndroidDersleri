package com.info.collectionornekler

fun main(){
    val u1 = Urun(1,"Televizyon",3456.0)
    val u2 = Urun(2,"Telefon",1234.0)
    val u3 = Urun(3,"Bilgisayar",3456.7)

    val urunler = ArrayList<Urun>()
    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for(urun in urunler){
        println("****************")
        println("Ürün No: ${urun.urunNo}")
        println("Ürün Adı: ${urun.urunAd}")
        println("Ürün Fiyat: ${urun.urunFiyat}")
        if(urun == urunler.last()){
            println("****************")

        }
    }



}