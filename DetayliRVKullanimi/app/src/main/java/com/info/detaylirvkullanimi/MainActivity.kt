package com.info.detaylirvkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.info.detaylirvkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var filmler: ArrayList<Filmler>
    private lateinit var adapter: RVAdapter
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        filmler = ArrayList<Filmler>()
        val f1 = Filmler(1,"Bir Zamanlar Anadoluda",100,R.drawable.birzamanlaranadoluda)
        val f2 = Filmler(2,"Django",90,R.drawable.django)
        val f3 = Filmler(3,"Inception",110,R.drawable.inception)
        val f4 = Filmler(4,"Interstellar",150,R.drawable.interstellar)
        val f5 = Filmler(5,"The Hatefull Eight",60,R.drawable.thehatefuleight)
        val f6 = Filmler(6,"The Pianist",170,R.drawable.thepianist)
        filmler.add(f1)
        filmler.add(f2)
        filmler.add(f3)
        filmler.add(f4)
        filmler.add(f5)
        filmler.add(f6)

        adapter = RVAdapter(this@MainActivity,filmler)
        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        binding.rv.adapter = adapter
    }
}