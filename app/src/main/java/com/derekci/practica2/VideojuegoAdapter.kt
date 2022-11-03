package com.derekci.practica2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.derekci.practica2.databinding.ListItemBinding
import com.derekci.practica2.model.Videojuego

class VideojuegoAdapter(var videojuegos: List<Videojuego>): RecyclerView.Adapter<VideojuegoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val videojuego = videojuegos[position]
        holder.bind(videojuego)
    }

    override fun getItemCount(): Int {
        return videojuegos.size
    }

    class ViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root) {


        fun bind(videojuego: Videojuego) {
            binding.tvNombre.text = videojuego.nombre
            binding.tvGenero.text = videojuego.generos
            binding.tvDesarrollador.text = videojuego.desarrollador
            binding.tvPlataforma.text = videojuego.plataforma


            if(binding.tvPlataforma.text == "PC"){
                binding.cover.setImageResource(R.drawable.steam_logo)
            }else if(binding.tvPlataforma.text == "PlayStation"){
                binding.cover.setImageResource(R.drawable.ps_logo)
            }else if(binding.tvPlataforma.text == "Xbox"){
                binding.cover.setImageResource(R.drawable.xbox_logo)
            }else if(binding.tvPlataforma.text == "Nintendo Switch"){
                binding.cover.setImageResource(R.drawable.nintendo_switch_logo)
            }
        }
    }
}