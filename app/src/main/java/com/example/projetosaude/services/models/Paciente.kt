package com.example.projetosaude.services.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "pacientes")
data class Paciente(
    @ColumnInfo @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo var nome: String,
    @ColumnInfo var cpf: String,
    @ColumnInfo var endereco: String,
    @ColumnInfo var telefone: String,
    @ColumnInfo var dataNasc: String
)