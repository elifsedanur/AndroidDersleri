package com.info.romanrakamdonusturucu
import kotlin.math.pow
class RomanRakaminaDonusum(var sayi:Int) {
    val romanRakamDizi = ArrayList<Char>()
    fun romanRakamlari(basamak:Int):Char{
        when(basamak){
            1 -> return 'I'
            5 -> return 'V'
            10 -> return 'X'
            50 -> return 'L'
            100 -> return 'C'
            500 -> return 'D'
            1000 -> return 'M'
            else -> return '1'
        }
    }
    fun donusturucu(deger:Int,basamak: Int){
        var temp: Double = 10.0.pow(basamak)
        if(deger == 4){
            romanRakamDizi.add(romanRakamlari(5*temp.toInt()))
            romanRakamDizi.add(romanRakamlari(1*temp.toInt()))
        }
        else if (deger == 5){
            romanRakamDizi.add(romanRakamlari(5*temp.toInt()))
        }
        else if(deger in 6..8){
            for(i in 1..deger-5){
                romanRakamDizi.add(romanRakamlari(1*temp.toInt()))
            }
            romanRakamDizi.add(romanRakamlari(5*temp.toInt()))
        }else if(deger == 9){
            romanRakamDizi.add(romanRakamlari(10*temp.toInt()))
            romanRakamDizi.add(romanRakamlari(1*temp.toInt()))
        }
        else{
            for(i in 1..deger){
                romanRakamDizi.add(romanRakamlari(1*temp.toInt()))
            }
        }
    }
    fun donusum():String{
        var temp = sayi
        var stringDeger: String = ""
        var basamakDegerleri = ArrayList<Int>()
        while (temp > 0){
            basamakDegerleri.add(temp % 10)
            temp /= 10
        }
        for((index,deger) in basamakDegerleri.withIndex()){
            donusturucu(deger,index)
        }
        for(i in romanRakamDizi.size - 1 downTo 0 ){
            stringDeger += romanRakamDizi[i]
        }
        return stringDeger
    }
}