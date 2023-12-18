package com.info.nesnetabanliprogramlama

fun main(){

   /* fun topla(){
        var toplam = 10 + 20
        println("Toplam : $toplam")
    }
    topla()
    fun topla2():Int{
        var toplam = 20+ 30
        return toplam
    }
    println("Toplam: ${topla2()}")
    fun topla3(sayi1:Int,sayi2:Int):Int{
        var toplam = sayi1 + sayi2
        return toplam
    }
    println("Toplam : ${topla3(40,36)}")*/
    fun printMessage(message:String,info:String="Seda") = "$message $info"
    println(printMessage("Hello","fatma"))
    //printMessage("Hello")
    fun topla(sayilar : DoubleArray) : Double {

        var toplam = 0.0
        for(sayi in sayilar){
            toplam += sayi
        }
        return  toplam
    }
    val  dizi : DoubleArray = doubleArrayOf(1.1,2.2,3.3,4.4,5.5,6.6,)
        println(topla(dizi))
}