package com.raissa.happyfinal.ui.signOut

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.raissa.happyfinal.LoginActivity
import com.raissa.happyfinal.R

class SignOutFragment : Fragment() {

    private lateinit var signOutViewModel: SignOutViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        signOutViewModel =
                ViewModelProviders.of(this).get(SignOutViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sign_out, container, false)
        val textView: TextView = root.findViewById(R.id.text_sign_out)
        signOutViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        signOut()

        return root
    }

    fun signOut()
    {
        val intent = Intent(activity, LoginActivity::class.java)

        intent.change();
    }

    fun Intent.change()
    {
        startActivity(this)
        activity?.finish();
    }
}