package com.info.tablayoutkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.info.tablayoutkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    private val fragmentListesi = ArrayList<Fragment>()
    private val fragmnetBaslik = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentListesi.add(FragmentBirinci())
        fragmentListesi.add(FragmnetIkinci())
        fragmentListesi.add(FragmentUcüncü())
        fragmnetBaslik.add("Bir")
        fragmnetBaslik.add("İki")
        fragmnetBaslik.add("Üç")

        val adapter = myViewPagerAdapter(this)
        binding.viwepager2.adapter = adapter
        TabLayoutMediator(binding.tabLayout,binding.viwepager2){tab, position ->
            tab.setText(fragmnetBaslik[position])
        }.attach()
        binding.tabLayout.getTabAt(0)!!.setIcon(R.drawable.baseline_add_circle_24)
    }
    inner class myViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity){
        override fun getItemCount(): Int {
            return fragmentListesi.size
        }

        override fun createFragment(position: Int): Fragment {
            return fragmentListesi[position]
        }

    }
}