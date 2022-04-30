package com.example.wanted_antioquia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class capa_iniciar_sesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capa_iniciar_sesion)

        }

    //botón lleva a la pag inicial "MainActivity"
    fun cancelarInicioSesion(view:View){
        val intent = Intent(this,MainActivity::class.java).apply {  }

        startActivity(intent)
    }
    }
