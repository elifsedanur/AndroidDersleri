package com.info.collectionornekler

class Ogrenciler(var ad:String,var no:Int, var sinif:String) {
    fun ozellikler(){
        println("Öğrencinin Adı: $ad")
        println("Öğrencinin Sınıfı: $sinif")
        println("Öğrencinin Numarası: $no")
    }

    override fun hashCode(): Int {
        return this.no
    }

    override fun equals(other: Any?): Boolean {
        if(this.no != (other as Ogrenciler).no){
            return false
        }else{
            return true
        }
    }
}