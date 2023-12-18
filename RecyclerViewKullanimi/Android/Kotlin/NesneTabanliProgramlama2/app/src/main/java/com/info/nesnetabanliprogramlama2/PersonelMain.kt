package com.info.nesnetabanliprogramlama2

fun main(){

    val personelListesi = arrayListOf<Personel>()
    var p1 = Personel("Elif","Sedanur","Aksoy","64778","87767")
    personelListesi.add(p1)
    p1 = Personel("Ayşenur",null,"Aksoy","7384","8498")
    personelListesi.add(p1)
    for(i in personelListesi){
        i.bilgiVer()
    }

}