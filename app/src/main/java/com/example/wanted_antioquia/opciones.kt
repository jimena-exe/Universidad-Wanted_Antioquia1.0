package com.example.wanted_antioquia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.e.capa_denunciar

class opciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)
    }

    //botón lleva a la pag Iniciar sesión
    fun abrirInicioSesion(view: View){
        val intent = Intent(this,capa_iniciar_sesion::class.java).apply {  }

        startActivity(intent)
    }

    //boton lleva a la pag Noticias recientes

    //botón lleva a la pag Denunciar desaparecido
    fun denunciarDesaparecido(view: View){
        val intent = Intent(this,capa_denunciar::class.java).apply {  }

        startActivity(intent)
    }

    //boton lleva a la pag Buscar persona desaparecida
    //boton lleva a la pag Técnicas de rastrep
    fun irATecnicas(view: View){
        val intent = Intent(this, capa_tecnicas::class.java).apply {  }

        startActivity(intent)
    }
    //boton lleva a la pag Consejos de prevensión
    //boton lleva a la pag Información de la app
    //boton lleva a la pag Ir al perfil
}