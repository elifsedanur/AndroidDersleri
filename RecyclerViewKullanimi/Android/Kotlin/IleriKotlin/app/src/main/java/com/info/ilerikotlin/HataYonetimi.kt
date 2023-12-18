package com.info.ilerikotlin

import java.util.Scanner

fun main(){
   /* var str = "5a"
    var i:Int
    try {
         i = str.toInt()
    }/*catch (e:NumberFormatException)
    {
        println(e.message)
    }*/catch(e:Exception){
       // println(e.message)
        println("Hata")
    }finally{
        println("Hata Kontrolu yapıldı")
    }*/
    val girdi = Scanner(System.`in`)
    //println("Yüze bölünecek sayıyı giriniz:")
    var i : String = "0"
    var degisken:Int
    try {
        degisken = i.toInt()
        kontrol()
    }catch (e:Exception){
        degisken = -1
    }finally {
        println("Hata kontrolü yapıldı!!")
    }
    if(degisken != -1){
        try{
            var sonuc = 100 / degisken
            println("100/$degisken = $sonuc")
        }catch (e:Exception){
            println("Sıfıra Bölme Hatası")
        }
    }
    else{
        println("Geçersiz sayı girdiniz!!")
    }

}
fun kontrol(){
    throw Exception("Hata Oluştu")
}