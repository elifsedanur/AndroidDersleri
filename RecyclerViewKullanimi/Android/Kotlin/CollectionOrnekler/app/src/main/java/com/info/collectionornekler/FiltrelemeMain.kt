package com.info.collectionornekler

fun main(){
    var o1 = Ogrenciler("Seda",1,"2A")
    var o2 = Ogrenciler("Hatice",2,"1B")
    var o3 = Ogrenciler("Kübra",3,"3C")
    var o4 = Ogrenciler("Deniz",4,"6C")

    val sonucListe = ArrayList<Ogrenciler>()
    sonucListe.add(o1)
    sonucListe.add(o2)
    sonucListe.add(o3)
    sonucListe.add(o4)
    val filtreliListe = sonucListe.filter { (it.sinif).contains("C") }

    for(o in filtreliListe){
        println("*****************")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci No: ${o.no}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }
}