package com.info.nesnetabanliprogramlama3

class Mudur: Personel() {
    fun iseAl(p:Personel){
        p.isealindi()
    }
    fun terfiEttirme(p: Personel){
        if(p is Isci){
            p.maasArtırma()
        }
        /*(p as Isci)
        p.maasArtırma()*/

    }
}