package com.derekci.practica2.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.derekci.practica2.model.Videojuego

@Dao
interface VideojuegoDAO {
    @Insert
    fun insert(videojuego: Videojuego)
    @Query("SELECT * FROM videojuego")
    fun getAll(): List<Videojuego>
    @Delete
    fun delete(videojuego: Videojuego)
}