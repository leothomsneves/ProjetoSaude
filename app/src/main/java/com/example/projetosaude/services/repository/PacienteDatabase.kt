package com.example.projetosaude.services.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.projetosaude.services.models.Paciente


@Database(entities = [Paciente::class], version = 1)
abstract class PacienteDatabase : RoomDatabase() {
    abstract fun getDAO() : PacienteDAO

    companion object{
        private lateinit var INSTANCE: PacienteDatabase

        fun getInstance(context: Context) : PacienteDatabase{
            if (!Companion::INSTANCE.isInitialized){
                INSTANCE=Room.databaseBuilder(context,PacienteDatabase::class.java,"paciente_db")
                    .allowMainThreadQueries().build()
            }
            return  INSTANCE
        }
    }
}