package com.info.nesnetabanliprogramlama2

class Test3(var isim:String,var yas:Int,var adres: String) {
    constructor(isim1:String,yas1:Int):this(isim1,yas1,"Trabzon"){
        println("Constructor çalıştı")
    }
}