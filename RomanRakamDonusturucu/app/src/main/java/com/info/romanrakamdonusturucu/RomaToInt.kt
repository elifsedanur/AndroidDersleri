package com.info.romanrakamdonusturucu

class RomaToInt(val romanRakami:String) {
    fun donusum(c:Char):Int{
        when(c){
            'I'-> return 1
            'V'-> return 5
            'X'-> return 10
            'L'-> return 50
            'C'-> return 100
            'D'-> return 500
            'M'-> return 1000
            else -> return 0
        }
    }
    fun kurallar():Boolean{
        var tekrar:Int = 0
        for(i in 0 until romanRakami.length - 1){
            // V,D,L tekrarlanamaz
            if(romanRakami[i] == 'V' || romanRakami[i] == 'L' || romanRakami[i] == 'D'){
                if(romanRakami[i] == romanRakami[i+1])       return false
            }
        }
        for(i in 0 until romanRakami.length - 1){
            if(donusum(romanRakami[i]) < donusum(romanRakami[i+1])){
                // Cıkarılacak sayılar 10'un kuvvetleri olabilir
                if(romanRakami[i] == 'V' || romanRakami[i] == 'L' || romanRakami[i] == 'D') return false
                // Cıkan sayı kendinden 10 kat büyük rakamdan çikarilamaz
                if((donusum(romanRakami[i+1]) / donusum(romanRakami[i])) > 10 ) return false
            }
        }
        for(i in 0 until romanRakami.length - 2){
           // if(romanRakami[i] == romanRakami[i+1] && romanRakami[i+2] > romanRakami[i+1]) return false
            //Sol tarafa yazılarak çıkarılacak sayı en fazla 1 tane olabilir
            if (donusum(romanRakami[i] )<= donusum(romanRakami[i+1]) && donusum(romanRakami[i+2]) > donusum(romanRakami[i+1])) return false
        }
        // En fazla 3 kez sayi tekrarlanabilir
        for(i in 0 until romanRakami.length - 3){
            if(romanRakami[i] == romanRakami[i+1] && romanRakami[i+1] == romanRakami[i+2] && romanRakami[i +2] == romanRakami[i+3]) return false
        }
        return true
    }
    fun romaToInt():Int{
        val degerler = ArrayList<Int>()
        var toplam = 0
        if (kurallar()){
            for (i in romanRakami){
                if(donusum(i) != 0){
                    degerler.add(donusum(i))
                }
                else return 0
            }
            for(i in 0 until degerler.size - 1){
                if(degerler[i] < degerler[i+1]){
                    degerler[i] *= -1
                }
            }
            for(i in 0 until degerler.size){
                toplam += degerler[i]
            }
            return toplam
        }
        return 0
    }
}