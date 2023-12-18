package com.info.nesnetabanliprogramlama

class Otobus(var kapasite:Int, var nereden:String, var nereye:String, var mevcutYolcu:Int) {

    fun bilgiAl(){
        println("Kapasite : ${kapasite}")
        println("Nereden : ${nereden}")
        println("Nereye : ${nereye}")
        println("Mevcut Yolcu : ${mevcutYolcu}")
    }
    fun yolcuAl(yolcu:Int){
        if(yolcu + mevcutYolcu > kapasite){
            println("Bu kadar kişi için yeterli alan yok!!")
        }
        else{
            mevcutYolcu += yolcu
            println("Alınan Yolcu Sayısı : $yolcu \t Mecvut yolcu sayısı : $mevcutYolcu")
        }
    }
    fun yolcuIndir(yolcu:Int){
        if(mevcutYolcu < yolcu){
            println("Araçta $mevcutYolcu yolcu var. Daha fazla kişi inemez")
        }else{
            mevcutYolcu -= yolcu
            println("Indirilen Yolcu Sayısı : $yolcu \t Mecvut yolcu sayısı : $mevcutYolcu")
        }
    }
}