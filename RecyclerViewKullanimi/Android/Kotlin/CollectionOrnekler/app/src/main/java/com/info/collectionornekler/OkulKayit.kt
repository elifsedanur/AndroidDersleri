package com.info.collectionornekler

import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)
    val ogrenciler = ArrayList<Ogrenciler>()
    var flag = 1
    var no = 0
    while(true){
        println("Öğrenci kaydetmek istiyorsanız 1 e çıkmak istiyorsanız 0 a basın")
        flag = girdi.nextInt()
        if(flag == 1){
            println("Kayıt edilecek öğrencinin ismini giriniz:")
            var isim = girdi.next()
            println("Kayıt edilecek öğrencinin sınıfını giriniz:")
            var sinif = girdi.next()
            no += 1
            var o1 = Ogrenciler(isim,no ,sinif)
            ogrenciler.add(o1)
        }else{
            println("Kayıtlı Öğrenciler: ")
            for(o in ogrenciler){
                o.ozellikler()
            }
            break
        }
    }

}