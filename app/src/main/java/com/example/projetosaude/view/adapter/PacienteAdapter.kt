package com.example.projetosaude.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projetosaude.R
import com.example.projetosaude.services.models.Paciente
import com.example.projetosaude.view.viewholder.PacienteViewHolder

class PacienteAdapter(var context: Context) : RecyclerView.Adapter<PacienteViewHolder>() {

    lateinit var listaPaciente : List<Paciente>
    var onItemClick: ((Int) -> Unit)?=null
    var onItemLongClick: ((Int) -> Unit)?=null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PacienteViewHolder {
        val usuarioLayout = LayoutInflater.from(context).inflate(R.layout.paciente_layout, parent, false)
        var holder = PacienteViewHolder(usuarioLayout)
        return holder
    }

    override fun onBindViewHolder(holder: PacienteViewHolder, position: Int) {
        holder.txtDadosPaciente.text = listaPaciente[position].nome

        holder.itemView.setOnLongClickListener {
            onItemLongClick?.invoke(position)
            true
        }

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(position)
            true
        }
    }

    override fun getItemCount(): Int {
        return listaPaciente.size
    }

    fun atualizarUsuarios(lista : List<Paciente>){
        listaPaciente = lista
        notifyDataSetChanged()
    }
}