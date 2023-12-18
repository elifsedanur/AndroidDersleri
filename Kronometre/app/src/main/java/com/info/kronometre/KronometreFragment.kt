package com.info.kronometre

import android.app.UiModeManager.MODE_NIGHT_NO
import android.app.UiModeManager.MODE_NIGHT_YES
import android.graphics.Color
import android.os.Bundle
import android.os.SystemClock
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import com.info.kronometre.databinding.FragmentKronometreBinding

class KronometreFragment : Fragment() {
    private var _binding: FragmentKronometreBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentKronometreBinding.inflate(inflater, container, false)
        val view = binding.root
       binding.switchDarkMode.setOnCheckedChangeListener { buttonView, isChecked ->
           if (isChecked){
               AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
           }else{
               AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
           }

       }
        var duranZaman:Long = 0
        binding.buttonStart.setOnClickListener {
            binding.kronometre.base = SystemClock.elapsedRealtime() + duranZaman
            binding.kronometre.start()
            binding.imageView.setImageResource(R.drawable.yellow)
            binding.buttonStart.visibility = View.INVISIBLE
            binding.buttonStop.visibility = View.VISIBLE
        }
        binding.buttonStop.setOnClickListener {
            duranZaman = binding.kronometre.base - SystemClock.elapsedRealtime()
            binding.kronometre.stop()
            binding.imageView.setImageResource(R.drawable.green)
            binding.buttonStart.visibility = View.VISIBLE
            binding.buttonStop.visibility = View.INVISIBLE
        }
        binding.buttonReset.setOnClickListener {
            binding.kronometre.base = SystemClock.elapsedRealtime()
            binding.kronometre.stop()
            duranZaman = 0
            binding.imageView.setImageResource(R.drawable.green)
            binding.buttonStart.visibility = View.VISIBLE
            binding.buttonStop.visibility = View.INVISIBLE
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}