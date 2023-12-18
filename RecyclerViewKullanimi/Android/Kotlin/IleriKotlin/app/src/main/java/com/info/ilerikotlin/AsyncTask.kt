package com.info.ilerikotlin

import android.os.AsyncTask

fun main(){
    println("Async Task öncesi")
    AsyncSinif{sonuc()}.execute()
    println("Async Task sonrası")

}
fun sonuc(){
    println("Sonuç fonksiyonu")
}
class AsyncSinif(val sonucFok : ()->Unit): AsyncTask<Void,Void,Void>(){
    override fun onPreExecute() {
        super.onPreExecute()
        println("Preexecute çalıştı")
    }
    override fun doInBackground(vararg p0:Void?):Void?{
        Thread.sleep(3000)

        return null

    }
    override fun onPostExecute(result:Void?){
        super.onPostExecute(result)
        println("Postexecute çalıştı")
        sonuc()
    }
}