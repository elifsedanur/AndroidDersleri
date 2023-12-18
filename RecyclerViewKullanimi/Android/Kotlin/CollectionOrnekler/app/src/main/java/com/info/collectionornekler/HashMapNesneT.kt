package com.info.collectionornekler

fun main(){
    var o1 = Ogrenciler("Derya",1,"11a")
    var o2 = Ogrenciler("Fatih",2,"7c")
    var o3 = Ogrenciler("Hatice",3,"9v")
    var o4 = Ogrenciler("Kübre",4,"8A")
    val ogrenciler = HashMap<Int,Ogrenciler>()
    ogrenciler.put(o1.no,o1)
    ogrenciler.put(o2.no,o2)
    ogrenciler.put(o3.no,o3)
    ogrenciler.put(o4.no,o4)

    for((k,v) in ogrenciler){
        println("Öğrenci No: $k")
        println("Öğrenci Ad: ${v.ad}")
        println("Öğrenci Sınıf: ${v.sinif}")
    }

    var map1= mapOf(77 to "Halil Özel",55 to "Emre Mercan", 44 to "Serkan Karınca")

    //println("Key bilgisi 55 olan veri :"+map1.get(55))
    var filtreli = map1.filter {
        it.key > 50
    }
    println(filtreli.toString())
    map1.forEach{
        println("${it.key} ${it.value}")
    }



}