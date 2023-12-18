package com.info.collectionornekler

import java.util.Scanner

fun main(){
    var girdi = Scanner(System.`in`)
    var personeller = ArrayList<Personel>()
    println("Aşağıdaki personel bilgilerini giriniz:")
    for(i in 1..5){
        println("${i}. personele ait")
        println("Ad: ")
        var ad = girdi.next()
        println("İl: ")
        var il = girdi.next()
        println("İlçe: ")
        var ilce = girdi.next()
        var adrs = Adres(il,ilce)
        var p1 = Personel(ad,adrs)
        personeller.add(p1)
    }
    for(i in personeller){
        println("******************")
        println("Personelin Adı: ${i.isim}")
        println("Personelin Yaşadığı il: ${i.adres.il}")
        println("Personelin Yaşadığı ilçe: ${i.adres.ilce}")
    }


}