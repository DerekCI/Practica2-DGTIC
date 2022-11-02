package com.derekci.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.derekci.practica2.Model.Videojuego
import com.derekci.practica2.databinding.ActivityListaBinding
import com.derekci.practica2.databinding.ListItemBinding

lateinit var binding2: ActivityListaBinding
lateinit var binding3: ListItemBinding

class ActivityLista : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityListaBinding.inflate(layoutInflater)
        binding3 = ListItemBinding.inflate(layoutInflater)
        setContentView(binding2.root)
        setContentView(binding3.root)
        var videojuego = intent.getParcelableExtra<Videojuego>("videojuego")
        var recycler = binding2.recyclerView
        recycler.adapter = VideojuegoAdapter(listOf(
            Videojuego(videojuego?.nombre, videojuego?.generos, videojuego?.desarrollador, videojuego?.plataforma)
        ))



    }
}