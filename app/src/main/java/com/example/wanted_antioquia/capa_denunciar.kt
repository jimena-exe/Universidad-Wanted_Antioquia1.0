package com.e

import android.content.Intent
import android.view.View
import com.example.wanted_antioquia.R


//()xample.wanted_antioquia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.wanted_antioquia.opciones

class capa_denunciar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capa_denunciar)

        //------------Spinner municipios----------------------------------------------------
        //llamo al elemento spinner
        val spinner = findViewById<Spinner>(R.id.spn_municipios)

        //lista de elementos = municipios
        var lista = resources.getStringArray(R.array.municipios)

        //adapatador visual, para agregar cada elemento en un item del spinner
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)
        spinner.adapter = adaptador

        //mensaje diciendo que seleccionó el municipio tal
        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                p0: AdapterView<*>?,
                p1: View?,
                p2: Int,
                p3: Long)
            {
                Toast.makeText(this@capa_denunciar,lista[p2],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        //------------Spinner tipo de documento----------------------------------------------------
        val spinner_2 = findViewById<Spinner>(R.id.spn_tipo_de_doc)

        var lista_2 = resources.getStringArray(R.array.tipo_de_doc)

        val adaptador_2 = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)
        spinner_2.adapter = adaptador_2

        spinner_2.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                p0: AdapterView<*>?,
                p1: View?,
                p2: Int,
                p3: Long)
            {
                Toast.makeText(this@capa_denunciar,lista_2[p2],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        //------------Spinner genero----------------------------------------------------
        val spinner_3 = findViewById<Spinner>(R.id.spn_genero)

        var lista_3 = resources.getStringArray(R.array.genero)

        val adaptador_3 = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)
        spinner_3.adapter = adaptador_3

        spinner_3.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                p0: AdapterView<*>?,
                p1: View?,
                p2: Int,
                p3: Long)
            {
                Toast.makeText(this@capa_denunciar,lista_3[p2],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }

    //botón cancelar denuncia
    fun cancelarDenuncia(view: View){
        val intent = Intent(this,opciones::class.java).apply { }

        startActivity(intent)
    }
}
