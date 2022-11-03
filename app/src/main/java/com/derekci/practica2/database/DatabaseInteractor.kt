package com.derekci.practica2.database

import android.content.Context
import androidx.room.Room

object DatabaseInteractor {
    private var database: AppDatabase? = null
    @Synchronized fun getInstance(context: Context): AppDatabase{
        if(database == null){
            database = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "videojuegos_db").build()

        }
        return database!!
    }
}