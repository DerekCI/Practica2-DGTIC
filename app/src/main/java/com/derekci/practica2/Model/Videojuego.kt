package com.derekci.practica2.Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Videojuego(
    val nombre: String,
    val generos: String,
    val desarrollador: String,
    val plataforma: String
): Parcelable
