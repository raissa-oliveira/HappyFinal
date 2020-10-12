package com.raissa.happyfinal.ui.ads

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.raissa.happyfinal.R

class AdsFragment : Fragment() {

    private lateinit var adsViewModel: AdsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        adsViewModel =
                ViewModelProviders.of(this).get(AdsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_ads, container, false)
        val textView: TextView = root.findViewById(R.id.text_ads)
        adsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}