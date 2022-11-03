package com.derekci.practica2.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.derekci.practica2.model.Videojuego

@Database(entities = [Videojuego::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun videojuegoDao(): VideojuegoDAO
}