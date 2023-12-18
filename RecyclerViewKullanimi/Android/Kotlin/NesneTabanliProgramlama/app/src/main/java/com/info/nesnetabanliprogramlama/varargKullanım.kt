package com.info.nesnetabanliprogramlama

fun main(){

    fun topla(vararg sayilar:Int):Int{

        var sonuc = 0
        for(sayi in sayilar){
            sonuc += sayi
        }
        return sonuc
    }
    println(topla(1,2,3,4,5))

}