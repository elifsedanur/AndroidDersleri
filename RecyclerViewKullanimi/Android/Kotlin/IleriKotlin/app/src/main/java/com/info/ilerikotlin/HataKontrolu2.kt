package com.info.ilerikotlin

fun main(){
    var k = kisi("Seda","Aksoy")
    try{
        k.yasEkle(-1)
    }catch(e:Exception){
        println(e.message)
    }



}
class kisi{
    var isim : String
    var soyisim : String
    var yas :Int? = null
    get
    private set
    constructor(ad:String, soyad:String){
        isim = ad
        soyisim = soyad
    }
    fun yasEkle(age:Int){
        if(age >= 0 && age <= 120){
            yas = age
        }else{
            throw Exception("Yas 0 ile 120 arasında olabilir")
        }

    }
}