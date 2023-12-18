package com.info.stringkullanimi

fun main(){
    var thread1 = MyThread1()
    var thread2 = Thread(MyThread2())
    thread1.start()
    thread2.start()
    for(i in 0..100){
        println("main thread")
        Thread.sleep(100)
    }

}