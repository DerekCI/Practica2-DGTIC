package com.derekci.practica2

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.derekci.practica2.database.DatabaseInteractor
import com.derekci.practica2.model.Videojuego
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    fun insert(videojuego: Videojuego, context: Context){
        viewModelScope.launch(Dispatchers.IO) {
            DatabaseInteractor.getInstance(context).videojuegoDao().insert(videojuego)

        }

    }
}