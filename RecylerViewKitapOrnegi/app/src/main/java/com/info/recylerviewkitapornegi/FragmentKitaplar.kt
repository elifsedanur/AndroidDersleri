package com.info.recylerviewkitapornegi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.info.recylerviewkitapornegi.databinding.FragmentKitaplarBinding

class FragmentKitaplar : Fragment(), KitapAdapter.CategoriesAdapterListener {
    private var _binding: FragmentKitaplarBinding? = null
    private val binding get() = _binding!!
    private lateinit var kitaplar:ArrayList<Kitaplar>
    private lateinit var adapter: KitapAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentKitaplarBinding.inflate(inflater, container, false)
        val view = binding.root
        val k1 = Kitaplar("Anna Karenina","Tolstoy",50.0,R.drawable.annakarenina,"Çok akıcı bir kitap")
        val k2 = Kitaplar("Büyük Düşünmenin Büyüsü","David J. Schwartz",89.90,R.drawable.buyukdusunmeninbuyusu,"Çok akıcı bir kitap")
        val k3 = Kitaplar("Gece Yarısı Kütüphanesi","Matt Haigh",67.90,R.drawable.geceyarisikutuphanesi,"Çok akıcı bir kitap")
        val k4 = Kitaplar("Genç Boksör","Jack London",70.90,R.drawable.gencboksor,"Çok akıcı bir kitap")
        val k5 = Kitaplar("Kayıp Kelimeler Sözlüğü","Pıp Williams",52.90,R.drawable.kayipkelimelersozlugu,"Çok akıcı bir kitap")
        val k6 = Kitaplar("Kendi Özünü Bil","Kemal Sayar",92.90,R.drawable.kendiozunubil,"Çok akıcı bir kitap")
        val k7 = Kitaplar("Serenad","Zülfü Livaneli",120.0,R.drawable.serenad,"Çok akıcı bir kitap")

        kitaplar = ArrayList<Kitaplar>()
        kitaplar.add(k1)
        kitaplar.add(k7)
        kitaplar.add(k2)
        kitaplar.add(k3)
        kitaplar.add(k4)
        kitaplar.add(k5)
        kitaplar.add(k6)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)
        adapter = KitapAdapter(requireContext(),kitaplar,this)
        binding.recyclerView.adapter = adapter

        return view
    }

    override fun itemClick(holder: View,veri:Kitaplar) {
        val gecis = FragmentKitaplarDirections.actionFragmentKitaplarToFragmentDetaylar(veri)
        Navigation.findNavController(holder).navigate(gecis)
    }

    override fun itemClick2(holder: View, veri: Array<Kitaplar>) {
        val gecis = FragmentKitaplarDirections.actionFragmentKitaplarToFragmentFavoriler(veri)
        Navigation.findNavController(holder).navigate(gecis)
    }

}