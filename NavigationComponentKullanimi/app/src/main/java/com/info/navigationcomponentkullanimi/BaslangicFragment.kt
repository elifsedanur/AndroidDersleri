package com.info.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_baslangic.view.*

class BaslangicFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
       val tasarim =inflater.inflate(R.layout.fragment_baslangic, container, false)
        tasarim.buttonBaslangic.setOnClickListener {
            val kisi = Kisiler("Elif",1)
            val gecis = BaslangicFragmentDirections.oyunEkraninaGecis(kisi,"Sedanur",20,1.58F)
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim
    }


}