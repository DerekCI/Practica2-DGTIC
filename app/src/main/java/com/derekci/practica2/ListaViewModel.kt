package com.derekci.practica2

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.derekci.practica2.database.DatabaseInteractor
import com.derekci.practica2.model.Videojuego
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListaViewModel: ViewModel() {
    private var _videojuegoLiveData = MutableLiveData<List<Videojuego>>()

    val videojuegoLiveData: LiveData<List<Videojuego>> get() = _videojuegoLiveData

    fun getAll(context: Context){
        viewModelScope.launch(Dispatchers.IO) {
            val videojuegos = DatabaseInteractor.getInstance(context).videojuegoDao().getAll()
            _videojuegoLiveData.postValue(videojuegos)
        }
    }
}