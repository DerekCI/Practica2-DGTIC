package com.derekci.practica2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.derekci.practica2.Model.Videojuego

class VideojuegoAdapter(val videojuegos: List<Videojuego>): RecyclerView.Adapter<VideojuegoAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val videojuego = videojuegos[position]
        holder.bind(videojuego)
    }

    override fun getItemCount(): Int {
        return videojuegos.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val nombre = binding3.tvNombre
        private val genero = binding3.tvGenero
        private val desarrollador = binding3.tvDesarrollador
        private val plataforma = binding3.tvPlataforma
        private val cover = binding3.cover

        fun bind(videojuego: Videojuego) {
            nombre.text = videojuego.nombre
            genero.text = videojuego.generos
            desarrollador.text = videojuego.desarrollador
            plataforma.text = videojuego.plataforma
            if(plataforma.text == "PC"){
                cover.setImageResource(R.drawable.steam_logo)
            }else if(plataforma.text == "PlayStation"){
                cover.setImageResource(R.drawable.ps_logo)
            }else if(plataforma.text == "Xbox"){
                cover.setImageResource(R.drawable.xbox_logo)
            }else if(plataforma.text == "Nintendo Switch"){
                cover.setImageResource(R.drawable.nintendo_switch_logo)
            }
        }
    }
}