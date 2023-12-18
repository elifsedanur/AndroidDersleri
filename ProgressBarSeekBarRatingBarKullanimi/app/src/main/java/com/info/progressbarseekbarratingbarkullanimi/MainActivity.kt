package com.info.progressbarseekbarratingbarkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonBasla.setOnClickListener {
            progressBar.visibility = View.VISIBLE
        }
        buttonDur.setOnClickListener {
            progressBar.visibility = View.INVISIBLE
        }
        slider.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textViewSonuc.text = "Sonuc $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })
        buttonGoster.setOnClickListener {
            val sliderDeger = slider.progress
            val ratingDeger = ratingBar.rating
            Log.e("Slide Bar",sliderDeger.toString())
            Log.e("Rating Bar",ratingDeger.toString())
        }

    }
}