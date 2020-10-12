package com.raissa.happyfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide();
        var isLogged = true;
        //TODO VALIDAÇÃO
        if(isLogged)
        {
            changeToMenu()
        }
        else
        {
            changeToLogin()
        }
    }

    fun changeToLogin()
    {
//        val intent = Intent(this, LoginActivity::class.java)
//
//        Handler().postDelayed(
//                {
//                    intent.change();
//                }, 2000
//        )
    }

    fun changeToMenu()
    {
        val intent = Intent(this, MenuActivity::class.java)

        Handler().postDelayed(
            {
                intent.change();
            }, 2000
        )
    }

    fun Intent.change()
    {
        startActivity(this)
        finish();
    }
}