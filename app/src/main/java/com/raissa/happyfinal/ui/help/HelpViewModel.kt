package com.raissa.happyfinal.ui.help

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HelpViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Por favor se tiver algum problema entre em contato com a gente! \n Pelo telefone: (19) 98325-5521 \n E-mail: dovalleraissa@gmail.com"
    }
    val text: LiveData<String> = _text
}