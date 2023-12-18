package com.info.recyclerviewkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.info.recyclerviewkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var ulkelerList:ArrayList<Ulkeler>
    private lateinit var adapter:RVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val u1 = Ulkeler(1,"Türkiye")
        val u2 = Ulkeler(2,"Rusya")
        val u3 = Ulkeler(3,"Ukrayna")
        val u4 = Ulkeler(4,"Italya")
        val u5 = Ulkeler(5,"Belçika")

        ulkelerList =ArrayList<Ulkeler>()
        ulkelerList.add(u1)
        ulkelerList.add(u2)
        ulkelerList.add(u3)
        ulkelerList.add(u4)
        ulkelerList.add(u5)

        adapter = RVAdapter(this@MainActivity,ulkelerList)

        binding.rv.adapter = adapter
    }
}