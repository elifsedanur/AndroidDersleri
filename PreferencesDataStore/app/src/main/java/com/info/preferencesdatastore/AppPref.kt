package com.info.preferencesdatastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

class AppPref(var context:Context) {
    val Context.ds :DataStore<Preferences> by preferencesDataStore("Bilgiler")
    companion object{
        val AD_KEY = stringPreferencesKey("AD")
        val YAS_KEY = intPreferencesKey("YAS")
        val BOY_KEY = doublePreferencesKey("BOY")
        val BEKAR_KEY = booleanPreferencesKey("BEKAR")
        val ARKADAS_LISTESI_KEY = stringSetPreferencesKey("ARKADASLAR")
    }
    suspend fun kayitAd(ad:String){
        context.ds.edit {
            it[AD_KEY] = ad
        }
    }
    suspend fun kayitBoy(boy:Double){
        context.ds.edit {
            it[BOY_KEY] = boy
        }
    } suspend fun kayitYas(yas:Int){
        context.ds.edit {
            it[YAS_KEY] = yas
        }
    }
    suspend fun kayitBekar(bekar:Boolean){
        context.ds.edit {
            it[BEKAR_KEY] = bekar
        }
    } suspend fun kayitArkadasListesi(arkadaslar:Set<String>){
        context.ds.edit {
            it[ARKADAS_LISTESI_KEY] = arkadaslar
        }
    }
    suspend fun okuAd():String{
        val ad = context.ds.data.first()
        return ad[AD_KEY] ?: "İsim yok"
    }
    suspend fun okuYas():Int{
        val yas = context.ds.data.first()
        return yas[YAS_KEY] ?: 0
    }
    suspend fun okuBoy():Double{
        val boy = context.ds.data.first()
        return boy[BOY_KEY] ?: 0.0
    }
    suspend fun okuBekar():Boolean{
        var bekar = context.ds.data.first()
        return bekar[BEKAR_KEY] ?: false
    }
    suspend fun okuArkadasListesi():Set<String>?{
        val ArkadasListesi = context.ds.data.first()
        return ArkadasListesi[ARKADAS_LISTESI_KEY]
    }
    suspend fun silYas(){
        context.ds.edit {
            it.remove(YAS_KEY)
        }
    }
    suspend fun silAd(){
        context.ds.edit {
            it.remove(AD_KEY)
        }
    }
}