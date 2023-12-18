package com.info.ilerikotlin

fun main(){
    val box1 = Box<Int>()
    box1.add(2)
    println(box1.get())

    val third = Third<firstClass>()
    third.third()
}
class Box<T>{
    var s:T? = null
    private set

    fun add(s:T){
        this.s = s
    }
    fun get() = this.s
}
open class firstClass{
    fun first(){}
}
class secondClass:firstClass(){
    fun second(){
        println("2. class")
    }
}
class Third<T:firstClass>{
    fun third(){
        println("3. class")
    }

}
class Bir<out T>(val s : T){
    fun get():T{
        return s
    }
}
class iki<in S>{
    fun add(s:S):String{
       return  s.toString()
    }
}