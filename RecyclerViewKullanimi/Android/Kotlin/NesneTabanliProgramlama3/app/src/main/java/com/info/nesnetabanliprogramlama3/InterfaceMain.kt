package com.info.nesnetabanliprogramlama3

fun main(){
    val tavuk = Tavuk()
    val elma = Elma()
    val aslan = Aslan()
    val amasyaElmasi:Elma = AmasyaElmasi()
    val dizi = arrayOf(tavuk,elma,aslan,amasyaElmasi)
    for(d in dizi){
        if(d is Eatable){
            d.howToEat()
        }
        if(d is Squeezable){
            d.howToSqueeze()
        }
    }

}