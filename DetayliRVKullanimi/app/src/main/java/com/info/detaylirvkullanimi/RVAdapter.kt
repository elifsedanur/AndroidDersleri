package com.info.detaylirvkullanimi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.info.detaylirvkullanimi.databinding.CardFilmTasarimBinding

class RVAdapter(private val mContext:Context,private val filmler:List<Filmler>):RecyclerView.Adapter<RVAdapter.cardViewTasarimTutucu>(){
    inner class cardViewTasarimTutucu(view:View):RecyclerView.ViewHolder(view){
         var imageViewFilm:ImageView
         var textViewFilmBaslik:TextView
         var textViewFilmFiyat:TextView
         var buttonSepeteEkle:Button
         init {
             imageViewFilm = view.findViewById(R.id.imageViewFilm)
             textViewFilmBaslik = view.findViewById(R.id.textViewFilmBaslik)
             textViewFilmFiyat = view.findViewById(R.id.textViewFilmFiyat)
             buttonSepeteEkle = view.findViewById(R.id.buttonSepeteEkle)
         }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewTasarimTutucu {
        val tasarim = LayoutInflater.from(parent.context).inflate(R.layout.card_film_tasarim,parent,false)
        return cardViewTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
      return filmler.size
    }

    override fun onBindViewHolder(holder: cardViewTasarimTutucu, position: Int) {
        val film = filmler[position]
        holder.imageViewFilm.setImageResource(film.filmResim)
        holder.textViewFilmBaslik.text = film.filmAdi
        holder.textViewFilmFiyat.text = film.filmFiyat.toString()
        holder.buttonSepeteEkle.setOnClickListener{
            Toast.makeText(mContext,"${film.filmAdi} Başarıyla Sepete Eklendi",Toast.LENGTH_SHORT).show()
        }
    }
}