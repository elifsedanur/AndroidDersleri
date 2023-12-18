package com.info.preferencesdatastoresayacuygulamasi

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import kotlinx.coroutines.flow.first


class AppPref(val context:Context) {
    val Context.ds : DataStore<Preferences> by preferencesDataStore("Sayac Uygulamasi")
    companion object{
        val SAYAC_KEY = intPreferencesKey("SAYAC")
    }
    suspend fun kayitsayac(sayi:Int){
        context.ds.edit {
            it[SAYAC_KEY] = sayi
        }
    }
    suspend fun okusayac():Int{
        val sayac = context.ds.data.first()
        return  sayac[SAYAC_KEY] ?: 0
    }
    suspend fun silsayac(){
        context.ds.edit {
            it.remove(SAYAC_KEY)
        }
    }
}