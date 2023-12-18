package com.info.nesnetabanliprogramlama3

fun main(){

    /*val topkapiSarayi = Saray(19,10)
    val bogazVilla = Villa(10,true)
    println("Sarayı Pencere Sayısı: ${topkapiSarayi.pencereSayisi}\t Kule Sayısı: ${topkapiSarayi.kuleSayisi}")
    println("Villa Pencere Sayısı: ${bogazVilla.pencereSayisi}\t Garaj Var Mı: ${bogazVilla.garajVarMı}")*/
    /* var name:String? = "Sedanur"
    name?.let{
        println("Değişken null değil ve değeri $it")
    } ?: println("Değişken null ")
    val result = name?.let{
        println(it)
    }
    println(result) */
    val dev = Developer()
    /*dev.apply {
        name = "Sedanur"
        age = 20
        println(writeCode())
    }
    repeat(10,{println("Tekrar et")})
*/
    with(dev){
        name = "Sedanur"
        age = 20
        println(writeCode())
    }
 val adres = Address("new street", 123)
 val user = User("Seda",adres)
 // user.also { it.age = 10 }
    //println("Result: $result")
    println("Age: ${user.age}")


}
class Developer{
    var name:String? = null
    var age:Int? = null
    fun writeCode() = "writing code"
}
class Address(var street:String? = null,var code:Int? = null)
class User(var name:String? = null,var address:Address? = null ,var age:Int? = null)