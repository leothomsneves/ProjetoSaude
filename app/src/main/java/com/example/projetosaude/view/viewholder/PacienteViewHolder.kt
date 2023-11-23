package com.example.projetosaude.view.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetosaude.R

class PacienteViewHolder (pacienteLayout : View) : RecyclerView.ViewHolder(pacienteLayout) {
    var txtDadosPaciente = pacienteLayout.findViewById<TextView>(R.id.txtDadosPaciente)
}