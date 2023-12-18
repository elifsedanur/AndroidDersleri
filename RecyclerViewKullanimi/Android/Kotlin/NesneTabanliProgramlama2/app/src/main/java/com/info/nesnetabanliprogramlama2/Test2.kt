package com.info.nesnetabanliprogramlama2

class Test2 {
    var isim:String
    var yas:Int
    var adres:String

    constructor(isim1:String,yas1:Int){
        this.isim = isim1
        this.yas = yas1
        this.adres = "Trabzon"
        println("Constructor sonu")
    }
    constructor(yas2:Int){
        yas = yas2
        isim = "no name"
        adres = ""
    }
}