package com.info.standartprogramlamayapilari

fun main(){
    for(i in 3..6 step 2){
        println(i)
    }
    var a= 10
    var b= 20
    var artis = 3
    for (i in b downTo a step artis)
    { println("i : $i")}
    for (c in 2 until 8 )
    {println(" c : $c")}

}