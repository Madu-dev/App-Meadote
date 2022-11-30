package com.example.meadote.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meadote.R
import com.example.meadote.model.dadosPet

class AdapterDadosPet(private val context: Context, private val dados : MutableList<dadosPet>): RecyclerView.Adapter<AdapterDadosPet.DadosViewHolder>() {


    //criar as visualizações de lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DadosViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.pets_adocao, parent, false)
        val holder = DadosViewHolder(itemLista)
        return holder
    }

    //metodo responsavel p exibir as visualizações p usuario
    override fun onBindViewHolder(holder: DadosViewHolder, position: Int) {
        holder.foto.setImageResource(dados[position].foto)
        holder.nome.text = dados[position].nome
        holder.descricao.text = dados[position].descricao
    }

    //tamanho da lista que estou passando
    override fun getItemCount(): Int = dados.size

    inner class DadosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.fotoPet)
        val nome = itemView.findViewById<TextView>(R.id.nomePet)
        val descricao = itemView.findViewById<TextView>(R.id.descricaoPet)
    }

}