package com.info.nesnetabanliprogramlama3

open class Elma : Eatable,Squeezable  {
    override fun howToEat(){
        println("Isırarak Ye")
    }

    override fun howToSqueeze() {
        println("Blendırdan Geçir")
    }
}