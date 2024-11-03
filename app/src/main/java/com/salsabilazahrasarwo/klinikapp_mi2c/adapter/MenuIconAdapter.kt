package com.salsabilazahrasarwo.klinikapp_mi2c.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.salsabilazahrasarwo.klinikapp_mi2c.R
import com.salsabilazahrasarwo.klinikapp_mi2c.model.ModelMenuIcon

class MenuIconAdapter (
    val itemMenuList : List<ModelMenuIcon>
): RecyclerView.Adapter<MenuIconAdapter.MyViewHolder>(){

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var imgMenuIcon : ImageView = itemView.findViewById(R.id.imgMenuIcon)
        var txtNamaIcon : TextView = itemView.findViewById(R.id.txtNamaIcon)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView =  LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_home, parent, false)
        return MyViewHolder(nView)
    }
    override fun getItemCount(): Int {
       return itemMenuList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentItem = itemMenuList[position]
        holder.txtNamaIcon.text = currentItem.NamaMenu
        holder.imgMenuIcon.setImageResource(currentItem.IconMenu)
    }
}