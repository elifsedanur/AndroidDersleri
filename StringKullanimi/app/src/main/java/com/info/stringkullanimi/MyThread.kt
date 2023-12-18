package com.info.stringkullanimi

class MyThread1:Thread() {
    override fun run() {
        for(i in 100..150){
            println("Birinci thread")
            Thread.sleep(100)
        }
    }
}