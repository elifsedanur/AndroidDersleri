package com.info.romanrakamdonusturucu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_roman_rakamina_donusum.view.*

class RomanRakaminaDonusumFragment : Fragment() {
       override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            val rootview = inflater.inflate(R.layout.fragment_roman_rakamina_donusum, container, false)
           rootview.textViewDonusen.text = "0"
           rootview.buttonDonusum.setOnClickListener {
               val deger = rootview.editTextSayi.text.toString()
               val  sayi = try {
                   deger.toInt()
               } catch (e:java.lang.Exception)
               {-1}
               if(sayi == -1){
                   rootview.textViewDonusen.text = "0"
                   Toast.makeText(activity,"Yanlış Sayı Girişi",Toast.LENGTH_SHORT).show()
               }
               else{
                   val romanDonusum = RomanRakaminaDonusum(sayi)
                   val romanRakam = romanDonusum.donusum()
                   rootview.textViewDonusen.text = romanRakam
               }
           }
           return rootview
    }

}