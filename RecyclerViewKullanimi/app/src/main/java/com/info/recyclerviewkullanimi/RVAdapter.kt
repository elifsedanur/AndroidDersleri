package com.info.recyclerviewkullanimi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(private val mContext:Context,private val ulkeler:List<Ulkeler>)
    :RecyclerView.Adapter<RVAdapter.CardViewTasarimi>() {

    // Tasarım üzerindeki görsel nesneleri temsil eden sınıf
    inner class CardViewTasarimi(view:View):RecyclerView.ViewHolder(view){
        var satirCardView:CardView
        var satirYazi:TextView
        var noktaResim:ImageView

        init {
            satirCardView = view.findViewById(R.id.satirCard)
            satirYazi = view.findViewById(R.id.satirText)
            noktaResim = view.findViewById(R.id.satirImage)
        }
    }

    // CardView tasarimini ister
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewTasarimi {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.cardview_layout,parent,false)
        return CardViewTasarimi(tasarim)
    }

    // Kaç tane veri gösterilecek
    override fun getItemCount(): Int {
       return ulkeler.size
    }

    // Veriyi hangi görsel nesneye aktaracağımızı belirlediğimiz yer
    // Döngü gibi verileri sirayla verir
    override fun onBindViewHolder(holder: CardViewTasarimi, position: Int) {
        val ulke = ulkeler[position]
        holder.satirYazi.text = ulke.ulkeAdi
        holder.satirCardView.setOnClickListener{
            Toast.makeText(mContext,"Seçtiğiniz Ülke: ${ulke.ulkeAdi}",Toast.LENGTH_SHORT).show()
        }
        holder.noktaResim.setOnClickListener {
            val popUp = PopupMenu(mContext,holder.noktaResim)
            popUp.menuInflater.inflate(R.menu.popup_menu,popUp.menu)
            popUp.setOnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.action_delete -> {
                        Toast.makeText(mContext,"Sil Seçildi",Toast.LENGTH_SHORT).show()
                         true
                    }
                    R.id.action_duzenle -> {
                        Toast.makeText(mContext,"Düzenle Seçildi",Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
            popUp.show()

        }
    }
}