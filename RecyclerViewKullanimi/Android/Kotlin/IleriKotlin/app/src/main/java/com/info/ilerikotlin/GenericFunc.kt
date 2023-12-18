package com.info.ilerikotlin

fun main(){
    val list = arrayOf(1,2,3,4,5)
    val list2 = arrayOf("Kotlin","Java","Ruby")
    val list3 = arrayOf("seda",1.2,20)
  /*  printArray(list)
    printArray(list2)
    printArray(list3) */
    list3.printArrayExt()


}
fun <T> printArray(myArray:Array<T>){
    for(items in myArray) println(items)
}
fun <T> Array<T>.printArrayExt(){
    for(items in this) println(items)
}
