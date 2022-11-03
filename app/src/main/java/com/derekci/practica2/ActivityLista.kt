package com.derekci.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import com.derekci.practica2.database.DatabaseInteractor
import com.derekci.practica2.model.Videojuego
import com.derekci.practica2.databinding.ActivityListaBinding
import com.derekci.practica2.databinding.ListItemBinding

lateinit var binding2: ActivityListaBinding

class ActivityLista : AppCompatActivity() {
    private val viewModel:ListaViewModel = ListaViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityListaBinding.inflate(layoutInflater)
        setContentView(binding2.root)


        binding2.recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        viewModel.videojuegoLiveData.observe(this) {
            //(recycler.adapter as? VideojuegoAdapter)?.videojuegos = it
            //recycler.invalidate()
            binding2.recyclerView.adapter = VideojuegoAdapter(it)
        }
        viewModel.getAll(this)

    }
}