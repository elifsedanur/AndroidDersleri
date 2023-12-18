package com.info.collectionornekler

fun main(){
    var o1 = Ogrenciler("Derya",1,"11a")
    var o2 = Ogrenciler("Fatih",2,"7c")
    var o3 = Ogrenciler("Hatice",3,"9v")
    var o4 = Ogrenciler("Kübre",3,"8A")
    val ogrenciler = HashSet<Ogrenciler>()
    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
   ogrenciler.forEach{
       println("Örencinin Adı: ${it.ad}")
       println("Örencinin Sınıfı: ${it.sinif}")
       println("Örencinin Nosu: ${it.no}")
   }



}