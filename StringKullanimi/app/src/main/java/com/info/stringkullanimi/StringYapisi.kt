package com.info.stringkullanimi

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)
    println("İsminizi Giriniz: ")
    var isim = girdi.next()
    var count = 0
    println("$isim isminde ")
   cik@while(count < isim.length){
       var sayac = 0
       for(i in isim){
           var temp = 0
           while(temp < count){
               if(isim[temp] == isim[count]){
                   count += 1
                   continue@cik
               }
               temp += 1
           }
           if(isim[count] == i){
               sayac += 1
           }
       }
       println("$sayac tane ${isim[count]} harfi vardır.")
    count +=1
   }
}