package com.example.wanted_antioquia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class capa_denunciar1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capa_denunciar1)

        //------------Spinner municipios----------------------------------------------------
        //llamo al elemento spinner
        val spinner = findViewById<Spinner>(R.id.spn_municipios)

        //lista de elementos = municipios
        var listaMunicipio = resources.getStringArray(R.array.municipios)

        //adapatador visual, para agregar cada elemento en un item del spinner
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,listaMunicipio)
        spinner.adapter = adaptador




        //mensaje diciendo que seleccionó el municipio tal
        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long)
            {
                Toast.makeText(this@capa_denunciar1,listaMunicipio[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        //------------Spinner tipo de documento----------------------------------------------------
        val spinnerTipoDoc = findViewById<Spinner>(R.id.spn_tipo_de_doc)

        //lista de elementos
        var listaTipoDoc = resources.getStringArray(R.array.tipo_de_doc)

        val adaptadorTipoDoc = ArrayAdapter(this,android.R.layout.simple_spinner_item,listaTipoDoc)
        spinnerTipoDoc.adapter = adaptadorTipoDoc

        spinnerTipoDoc.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent_2: AdapterView<*>?,
                pview_2: View?,
                position_2: Int,
                id_2: Long)
            {
                Toast.makeText(this@capa_denunciar1,listaTipoDoc[position_2], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent_2: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        //------------Spinner genero----------------------------------------------------
        val spinnerGenero = findViewById<Spinner>(R.id.spn_genero)

        var listaGenero = resources.getStringArray(R.array.genero)

        val adaptadorGenero = ArrayAdapter(this,android.R.layout.simple_spinner_item,listaGenero)
        spinnerGenero.adapter = adaptadorGenero

        spinnerGenero.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent_3: AdapterView<*>?,
                view_3: View?,
                position_3: Int,
                id_3: Long)
            {
                Toast.makeText(this@capa_denunciar1,listaGenero[position_3], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent_3: AdapterView<*>?) {
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
