package com.info.recylerviewkitapornegi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.info.recylerviewkitapornegi.databinding.FragmentDetaylarBinding

class FragmentDetaylar : Fragment() {
    private lateinit var binding: FragmentDetaylarBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentDetaylarBinding.inflate(inflater, container, false)
        val bundle:FragmentDetaylarArgs by navArgs<FragmentDetaylarArgs>()
        val kitap = bundle.detaylar
        binding.imageView.setImageResource(kitap.kitapResim)
        binding.textViewIsim.text = "Kitap İsim: ${kitap.kitapIsim}"
        binding.textViewYazar.text = "Kitap Yazar: ${kitap.kitapYazar}"
        binding.textViewFiyat.text = "Fiyat: ${kitap.kitapFiyat}"
        binding.textViewYorum.text = kitap.kitapHakkında
        return binding.root
    }
}