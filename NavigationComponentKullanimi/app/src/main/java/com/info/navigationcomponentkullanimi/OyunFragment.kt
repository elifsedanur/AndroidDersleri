package com.info.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_oyun.view.*

class OyunFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
      val tasarim = inflater.inflate(R.layout.fragment_oyun, container, false)
        val bundle: OyunFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenKisi = bundle.kisiler
        Log.e("Gelen Ad",gelenAd)
        Log.e("Gelen Yas",gelenYas.toString())
        Log.e("Gelen Boy",gelenBoy.toString())
        Log.e("Gelen Kisi İsim",gelenKisi.isim)
        Log.e("Gelen Kisi Numara",gelenKisi.numara.toString())
        tasarim.buttonOyun.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.sonucEkraninaGecis)
        }
        return tasarim
    }


}