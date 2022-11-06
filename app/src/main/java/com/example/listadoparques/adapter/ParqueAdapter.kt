package com.example.listadoparques.adapter;

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.Parque;
import com.example.listadoparques.R

class ParqueAdapter(private val parqueList: kotlin.collections.List<Parque>): RecyclerView.Adapter<ParqueViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParqueViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context).inflate(R.layout.listaparques,parent,false)
        return ParqueViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: ParqueViewHolder, position: Int) {
        val item = parqueList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return parqueList.size
    }
}
