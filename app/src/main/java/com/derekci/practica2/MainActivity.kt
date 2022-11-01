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

        val nombre = binding.etNombre
        val genero = binding.etGenero
        val dessarrollador = binding.etDesarrollador
        val imagen = binding.imageView

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
    }
}