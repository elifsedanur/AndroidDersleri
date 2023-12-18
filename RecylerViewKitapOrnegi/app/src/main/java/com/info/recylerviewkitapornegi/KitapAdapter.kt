package com.info.recylerviewkitapornegi

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class KitapAdapter(private val mcontext:Context, private val kitaplar: List<Kitaplar>, private var listener: CategoriesAdapterListener):RecyclerView.Adapter<KitapAdapter.cardViewTasarimTutucu>(){
    inner class cardViewTasarimTutucu(view:View):RecyclerView.ViewHolder(view){
        val imageViewKitap:ImageView
        val checkBox: CheckBox
        val textViewKitapIsim:TextView
        val textViewKitapFiyat:TextView
        val buttonSiparisVer:Button
        val buttonDetaylar:Button
        init {
            imageViewKitap = view.findViewById(R.id.imageViewKitap)
            checkBox = view.findViewById(R.id.checkBox)
            textViewKitapIsim = view.findViewById(R.id.textViewKitapIsim)
            textViewKitapFiyat = view.findViewById(R.id.textViewKitapFiyat)
            buttonSiparisVer = view.findViewById(R.id.buttonSiparisVer)
            buttonDetaylar = view.findViewById(R.id.buttonDetaylar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewTasarimTutucu {
        val tasarim = LayoutInflater.from(parent.context).inflate(R.layout.carview_kitap,parent,false)
        return cardViewTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return kitaplar.size
    }
    private lateinit var favoriler:ArrayList<Kitaplar>
    override fun onBindViewHolder(holder: cardViewTasarimTutucu, position: Int) {
        favoriler = ArrayList<Kitaplar>()
        val kitap = kitaplar[position]
        holder.imageViewKitap.setImageResource(kitap.kitapResim)
        holder.textViewKitapIsim.text = kitap.kitapIsim
        holder.textViewKitapFiyat.text = "${kitap.kitapFiyat} TL"
        holder.checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
          if(!buttonView.isChecked){
               buttonView.setButtonDrawable(R.drawable.favorikirmizi)
              if(kitap in favoriler){
                  favoriler.remove(kitap)
              }
           }else{
               buttonView.setButtonDrawable(R.drawable.fav)
              favoriler.add(kitap)
              listener.itemClick2(holder.checkBox, favoriler.toTypedArray())
           }
        }
        holder.buttonSiparisVer.setOnClickListener {
            Snackbar.make(holder.buttonSiparisVer,"Siparişiniz Oluşturuldu.",Snackbar.LENGTH_SHORT).show()
        }
        holder.buttonDetaylar.setOnClickListener {
            listener.itemClick(holder.buttonDetaylar,kitap)
        }
    }
    interface CategoriesAdapterListener {
        fun itemClick(holder:View,veri:Kitaplar)
        fun itemClick2(holder:View,veri: Array<Kitaplar>)
    }
}