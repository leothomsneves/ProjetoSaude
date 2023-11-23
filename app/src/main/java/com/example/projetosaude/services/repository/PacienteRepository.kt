package com.example.projetosaude.services.repository

import android.content.Context
import com.example.projetosaude.services.models.Paciente

class PacienteRepository (var context : Context) {

    private val database = PacienteDatabase.getInstance(context)
    private var DAO = database.getDAO()

    fun salvarPaciente(paciente: Paciente) : Boolean{
        return DAO.salvarPaciente(paciente) > 0
    }

    fun deletarPaciente(paciente: Paciente){
        DAO.deletarPaciente(paciente)
    }

    fun atualizarPaciente(paciente: Paciente){
        DAO.atualizarPaciente(paciente)
    }

    fun listarPaciente(id : Int) : Paciente{
        return DAO.listarPaciente(id)
    }

    fun listarPacientes() : List<Paciente>{
        return DAO.listarPacientes()
    }
}