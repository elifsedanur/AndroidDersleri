package com.info.nesnetabanliprogramlama3

fun main(){

    var k1 = Kategoriler(1,"Dram")
    var k2 = Kategoriler(2,"Korku")
    var y1 = Yonetmenler(1,"Nuri Bilge Ceylan")
    var y2 = Yonetmenler(2,"Murat Hakkı")

    var f1 = Filmler(1,"Film1",2002,k1,y1)
    var f2 = Filmler(2,"Film2",1999,k2,y2)
    f1.bilgiVer()
    f2.bilgiVer()

}