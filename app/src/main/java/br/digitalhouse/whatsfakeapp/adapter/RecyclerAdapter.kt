package br.digitalhouse.whatsfakeapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.digitalhouse.whatsfakeapp.R
import br.digitalhouse.whatsfakeapp.data.Topicos

class RecyclerAdapter (val context : Context, var listaDeTopicos : List<Topicos>) : RecyclerView.Adapter<RecyclerAdapter.TopicoViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicoViewHolder {
        var layoutInflater = LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false)
        return TopicoViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: TopicoViewHolder, position: Int) {
        holder.imagem.setImageResource(listaDeTopicos[position].image)
        holder.titulo.text = listaDeTopicos[position].title
        holder.mensagem.text = listaDeTopicos[position].message
    }

    override fun getItemCount(): Int {
        return listaDeTopicos.size
    }

    inner class TopicoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imagem = itemView.findViewById<ImageView>(R.id.pernalonga)
        var titulo = itemView.findViewById<TextView>(R.id.title)
        var mensagem = itemView.findViewById<TextView>(R.id.text)
    }
}