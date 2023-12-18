package com.info.recylerviewkitapornegi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.info.recylerviewkitapornegi.databinding.FragmentFavorilerBinding

class FragmentFavoriler : Fragment(){
    private lateinit var binding: FragmentFavorilerBinding
    private lateinit var adapter: KitapAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFavorilerBinding.inflate(inflater,container,false)
        val bundle:FragmentFavorilerArgs by navArgs<FragmentFavorilerArgs>()
        val favoriler = bundle.favoriler as ArrayList<Kitaplar>
      /*  binding.rvFavori.setHasFixedSize(true)
        binding.rvFavori.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        adapter = KitapAdapter(requireContext(),favoriler,this)
        binding.rvFavori.adapter = adapter
*/
        return binding.root
    }
}