package com.info.collectionornekler

fun main(){
    var sayilar = mapOf<Int,String>(1 to "Bir",2 to "İki")
    //println(sayilar.get(2))
    for((key,value)in sayilar){
        println("$key -> $value")
    }

    var sehirler = mutableMapOf<Int,String>()
    sehirler.put(61,"Trabzon")
    sehirler.put(16,"Bursa")
    println(sehirler.toString())
    for((key,value)in sehirler){
        println("$key -> $value")
    }
    var renkler = HashMap<String,Int>()
    renkler.put("mavi",1)
    renkler.put("Kırmızı",2)
    renkler.put("lila",3)
    renkler.put("pembe",4)
    for((k,v)in renkler){
        println("$k $v")

    }
    println(renkler.get("mavi"))

}