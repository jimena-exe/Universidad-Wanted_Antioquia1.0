package com.example.wanted_antioquia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //botón lleva a la pag iniciar sesión
    fun abrirInicioSesion(view:View){
        val intent = Intent(this,capa_iniciar_sesion::class.java).apply {  }

        startActivity(intent)
    }

    //botón lleva a la pag registrarme
    fun ingresarARegistrarme(view: View){
        val intent = Intent(this,capa_registrar::class.java).apply {  }

        startActivity(intent)
    }




}
