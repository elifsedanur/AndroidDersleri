package com.info.ilerikotlin

import android.os.AsyncTask

fun main(){
    println("İşlem öncesi")
    //Hesapla{sonuc()}.execute()
    println("İşlem sonrası")

    fun sonuc(toplam:Long){
        println("Toplam: $toplam")
    }
}
class Hesapla(val sonucFonk:(Long)->Unit):AsyncTask<Void,Void,Long>()
{
    override fun doInBackground(vararg p0: Void?): Long {
    var toplam :Long = 0
        for(i in 1..100000000){
            toplam += i
        }
        return toplam
    }

}