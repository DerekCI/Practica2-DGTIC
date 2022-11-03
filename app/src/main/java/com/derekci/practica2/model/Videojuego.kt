package com.derekci.practica2.model


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Videojuego(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo val nombre: String,
    @ColumnInfo val generos: String,
    @ColumnInfo val desarrollador: String,
    @ColumnInfo val plataforma: String
)
