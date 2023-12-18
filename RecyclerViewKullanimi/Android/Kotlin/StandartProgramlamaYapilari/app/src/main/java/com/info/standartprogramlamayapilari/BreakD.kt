package com.info.standartprogramlamayapilari

import kotlin.random.Random

fun main(){

    /*seda@for(i in 1..10){
        for(j in 1..10){
            if(j == 4){
                break@seda
            }
            println(j)
        }
    }*/
   // var yas : Int? = null
   // println(yas!!)
    for(i in 1..5){
        val r = Random.nextInt(1,10)
        println("r: $r")
    }

}