package com.example.recylcview.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recylcview.R
import kotlinx.android.synthetic.main.row.view.*

class adapter():RecyclerView.Adapter<adapter.RowHolder>() {
    val ÖgrenciBilgileri:Array<String> = arrayOf("Adı","Soyadı","Numarası","Eposta")//Geçerli Bir Dizi tanımladık.
    class RowHolder(view:View):RecyclerView.ViewHolder(view){
        fun Bind(ögrenciBilgileri:Array<String>,position: Int){
            itemView.textView.text = ögrenciBilgileri[position]//
            println("İnfo : ${ögrenciBilgileri[position]}")
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return RowHolder(view)
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.Bind(ÖgrenciBilgileri,position)
    }

    override fun getItemCount(): Int {
        return ÖgrenciBilgileri.size
    }

}