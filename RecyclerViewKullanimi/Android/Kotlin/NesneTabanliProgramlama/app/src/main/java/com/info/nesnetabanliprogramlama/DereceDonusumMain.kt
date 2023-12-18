package com.info.nesnetabanliprogramlama

import java.util.Scanner

fun main(){
   /* val d = DereceDonusum()
    val sonuc = d.donustur(0.0)
    println("100.0 derecenin fahrenait karsılığı: $sonuc")*/
////////////////////////////////////////////////////////////
/*    // Ödev 2
    fun cevreHesap(uKenar:Int,kKenar:Int){
        val cevre = uKenar*2 + kKenar*2
        println("Dikdörtgenin çevresi : $cevre")
    }
    val girdi = Scanner(System.`in`)
    println("Dikdörtgenin kısa kenar uzunluğunu giriniz:")
    val kısaK = girdi.nextInt()
    println("Dikdörtgenin uzun kenar uzunluğunu giriniz:")
    val uzunK = girdi.nextInt()
    cevreHesap(kısaK,uzunK)*/
////////////////////////////////////////////////////////////
   /*//Ödev 3
    fun faktoriyelHesap(sayi:Int):Int{
        var sonuc = 1
        var sayi1 = sayi
        while(sayi1 >= 1){
            sonuc *= sayi1
            sayi1 -= 1
        }
    return sonuc
    }
    val girdi = Scanner(System.`in`)
    println("Faktöriyeli hesaplanacak sayıyı giriniz: ")
    val f = girdi.nextInt()
    val s = faktoriyelHesap(f)
    println("$f! : $s")  */
////////////////////////////////////////////////////////////
/*    //Ödev 4   Parametre olarak girilen kelime ve harf için harfin kelime içinde kaç
    //adet olduğunu gösteren bir metod yazınız.
    fun kacTane(kelime:String,harf:String):Int{
        var sayac = 0
       var index = 0
       for((i,h) in kelime.withIndex()){
           if(harf == kelime[i].toString()){
               sayac += 1
           }

       }
        return sayac
    }
    val girdi = Scanner(System.`in`)
    println("Kelime: ")
    val kelime = girdi.next()
    println("Harf")
    val harf = readLine()!!
    var tekrar = kacTane(kelime,harf)
 println("$harf harfi $kelime kelimesinde $tekrar tane vardır")*/
////////////////////////////////////////////////////////////
 /*  //ödev 5 Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu
    //geri gönderen metod yazınız.
    //Formül n: kenar sayısı (n-2).180
    fun icAcı(kenarSayısı:Int):Int{
        val acı = (kenarSayısı-2)*180
       return acı
    }
    println("Kenar Sayısı")
    var  kSayısı = readLine()!!
    var sonuc = icAcı(kSayısı.toInt())
    println("$kSayısı kenarlı şekilin iç açılarınının toplamı: $sonuc")
*/
 /* //ödev 6 Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen
    //değeri geri döndüren metod yazınız.
    //1 Günde 8 saat çalışılabilir.
    //Çalışma saat ücreti : 10 tl
    //Mesai saat ücreti : 20tl
    //160 saat üzeri mesai sayılır.


    fun maasHesapla(day:Int):Int{
        var maas = 0
        val toplamSaat = day*8
        if(toplamSaat > 160){
            maas = 160*10 + (toplamSaat -160)*20
            return maas
        }else{
            maas = toplamSaat * 10
            return maas
        }
    }
    println("Çalışılan gün sayısını giriniz:")
    var gun = readLine()!!
    var sonuc = maasHesapla(gun.toInt())
    println("Maaş: $sonuc") */
////////////////////////////////////////////////////////////
 /*   //ödev 7 Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren
    //metodu yazınız.
    //• 50GB 100 TL
    //• Kota aşımından sonra her 1GB 4 TL

    fun internetUcreti(kota:Int):Int{
        var gbUcret = 2
        var fiyat = 100
        if(kota > 50){
            fiyat =100 + (kota-50)*4
        }
        return fiyat
    }
    println("Kullanılan GB miktarını giriniz:")
    var gb = readLine()!!
    var sonuc = internetUcreti(gb.toInt())
    println("Kullanılan $gb gb fiyatı: $sonuc")
*/

}