package com.info.nesnetabanliprogramlama3

class Nissan(renk:String,vites:String,kasaTipi:String, var model:String):Araba(renk,vites,kasaTipi) {
    fun bilgiVer(){
        println("Renk : $renk")
        println("Vites : $vites")
        println("Kasa Tipi : $kasaTipi")
        println("Model : $model")

    }
}