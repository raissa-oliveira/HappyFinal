package com.raissa.happyfinal.ui.myRep

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.raissa.happyfinal.R

class MyRepFragment : Fragment() {

    private lateinit var myRepViewModel: MyRepViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        myRepViewModel =
                ViewModelProviders.of(this).get(MyRepViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_my_rep, container, false)
        val textView: TextView = root.findViewById(R.id.text_my_rep)
        myRepViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}