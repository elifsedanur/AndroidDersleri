package com.info.nesnetabanliprogramlama3

fun main(){
   var user = User1()
    user.age = 12
   println(user.age)

}
class User1 {
    var age:Int = 0
    get() = field
    set(value){
        field = if(value >= 18)  18 else throw
        IllegalArgumentException("Yaş 18'dan büyük olmalıdır.")


    }

}