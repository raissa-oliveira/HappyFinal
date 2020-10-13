package com.raissa.happyfinal.ui.signOut

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignOutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is sign out Fragment"
    }
    val text: LiveData<String> = _text
}