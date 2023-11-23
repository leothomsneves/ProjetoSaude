package com.example.projetosaude.services.repository

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.projetosaude.services.models.Paciente

interface PacienteDAO {

    @Insert
    fun salvarPaciente(paciente: Paciente) : Long

    @Delete
    fun deletarPaciente(paciente: Paciente)

    @Update
    fun atualizarPaciente(paciente: Paciente)

    @Query("SELECT * FROM pacientes WHERE id=:id")
    fun listarPaciente(id : Int) : Paciente

    @Query("SELECT * FROM pacientes")
    fun listarPacientes() : List<Paciente>
}