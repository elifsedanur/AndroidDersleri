package com.info.stringkullanimi

class MyThread2:Runnable {
    override fun run() {
        for(i in 200..259){
            println("Ikinci thread")
            Thread.sleep(100)
        }
    }
}