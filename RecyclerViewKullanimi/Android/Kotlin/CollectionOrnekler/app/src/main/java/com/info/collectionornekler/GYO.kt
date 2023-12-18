package com.info.collectionornekler

fun main(){
    var notlar = ArrayList<ArrayList<Float>>()
    var ortalama = ArrayList<Float>()
    var durumlar = ArrayList<String>()

    notlar.add(arrayListOf(45f,37f,78f))
    notlar.add(arrayListOf(90f,85f,78f))

    for(i in 0..notlar.size-1){
        var ort = notlar.get(i).reduce { baslangic, gecerli -> baslangic + gecerli } / notlar[i].size
        ortalama.add(ort)
    }
    durumlar = ortalama.map {
        if(it < 50){
            "Kaldı"
        }else{
            "Geçti"
        }
    } as ArrayList<String>
    durumlar.forEach {
        println(it)
    }



}