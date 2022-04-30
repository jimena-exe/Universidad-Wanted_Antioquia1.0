package com.example.wanted_antioquia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class capa_registrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capa_registrar)
    }

    //botón lleva a la pag inicial "MainActivity"
    fun cancelarResgistro(view:View){
        val intent = Intent(this,MainActivity::class.java).apply {  }

        startActivity(intent)
    }


}