package com.info.nesnetabanliprogramlama2

fun main(){
fun hangiGun(day:Gun) {
    when (day) {
        Gun.pazartesi -> println("Pazartesi")
        Gun.salı -> println("Salı")
        Gun.carsamba -> println("Çarşamba")
        Gun.perşembe -> println("Perşembe")
        Gun.cuma -> println("Cuma")
        Gun.cumartesi -> println("Cumartesi")
        Gun.pazar -> println("Pazar")
    }
}

    hangiGun(Gun.carsamba)
}