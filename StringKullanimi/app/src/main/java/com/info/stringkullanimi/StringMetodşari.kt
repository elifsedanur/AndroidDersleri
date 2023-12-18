package com.info.stringkullanimi

fun main(){
    val str = "merhaba"
    println(str.subSequence(0,4))
    println(str.toUpperCase())
    println(str.toLowerCase())
    if(str.contains("ha")){
        println("içerir")
    }
    var dizi = str.split("a")
    for(i in dizi){
        println(i)
    }
    var st2 = "                       Seda nur    "
    println(st2.trim())
    println(str.capitalize())
    println(str.substring(3))
    val str3 = "Merhaba"
    println(str3.replace("haba","kür"))
}