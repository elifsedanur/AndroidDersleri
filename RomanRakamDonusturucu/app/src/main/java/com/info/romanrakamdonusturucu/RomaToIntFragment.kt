package com.info.romanrakamdonusturucu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_roma_to_int.view.*

class RomaToIntFragment : Fragment() {
       override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
           val rootView = inflater.inflate(R.layout.fragment_roma_to_int, container, false)
           rootView.textViewDonusenRomaToInt.text = "0"

           rootView.buttonDonusumRomaToInt.setOnClickListener {
               var sayi = rootView.editTextSayiRomaToINt.text.toString()
               val romaToSayi = RomaToInt(sayi)
               val sonuc = romaToSayi.romaToInt()
               if(sonuc == 0){
                   Toast.makeText(activity,"Girilen Sayı Roman Rakam Kurallarına Uymamaktadır!!!",Toast.LENGTH_SHORT).show()
               }else{
                   rootView.textViewDonusenRomaToInt.text = sonuc.toString()
               }
           }
        return rootView
    }
}