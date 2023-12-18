package com.info.fragmentcalismasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.ikincifragment.*
import kotlinx.android.synthetic.main.ikincifragment.view.*

class IkinciFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.ikincifragment,container,false)
        rootView.buttonYap.setOnClickListener {
            textViewYap.text = "Merhaba"
        }
        return rootView
    }
}