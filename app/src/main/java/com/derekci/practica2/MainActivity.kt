package com.derekci.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.derekci.practica2.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val spinner = binding.spinner
        val opciones = resources.getStringArray(R.array.opciones)

        val nombre = binding.etNombre.text
        val genero = binding.etGenero.text
        val dessarrollador = binding.etDesarrollador.text
        val imagen = binding.imageView

        val boton1 = binding.btnGuardar
        val boton2 = binding.btnEnviar


        if (spinner != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    val plataforma = spinner.selectedItem.toString()
                    if(spinner.selectedItem == opciones[0]){
                        imagen.setImageResource(R.drawable.steam_logo)
                    }else if(spinner.selectedItem == opciones[1]){
                        imagen.setImageResource(R.drawable.ps_logo)
                    }else if(spinner.selectedItem == opciones[2]){
                        imagen.setImageResource(R.drawable.xbox_logo)
                    }else if(spinner.selectedItem == opciones[3]){
                        imagen.setImageResource(R.drawable.nintendo_switch_logo)
                    }
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        }


        boton1.setOnClickListener{  view ->
            validar()
        }
    }

    fun validar(): Boolean{
        var isValid = true
        with(binding){
            if(etNombre.text.toString().isBlank()){
                isValid = false
                etNombre.error = getString(R.string.errorNombre)
            }
            if(etDesarrollador.text.toString().isBlank()){
                isValid = false
                etDesarrollador.error = getString(R.string.errorDesarrollador)
            }
            if(etGenero.text.toString().isBlank()){
                isValid = false
                etGenero.error = getString(R.string.errorGenero)
            }
        }
        return isValid
    }
}