package com.example.listadoparques.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadoparques.Parque
import com.example.listadoparques.databinding.ListaparquesBinding


public class ParqueViewHolder(view:View): RecyclerView.ViewHolder(view) {
    val binding = ListaparquesBinding.bind(view)
    fun render(parqueModel: Parque){

        binding.nombre.text= parqueModel.nombre
        binding.descripcion.text= parqueModel.descripcion
        Glide.with(binding.foto.context).load(parqueModel.imagen).into(binding.foto)
    }
}
