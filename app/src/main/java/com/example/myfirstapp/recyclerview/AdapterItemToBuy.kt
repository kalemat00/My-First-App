package com.example.myfirstapp.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.myfirstapp.R

class ItemToBuyViewHolder(view: View): RecyclerView.ViewHolder(view){
    val itemToBuyByID: TextView
    init {
        itemToBuyByID = view.findViewById(R.id.list_item_text)
    }
}

class AdapterItemToBuy(val toBuyList: List<ItemToBuy>):
    RecyclerView.Adapter<ItemToBuyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemToBuyViewHolder {
        val itemToBuyView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_layout, parent, false)
        return ItemToBuyViewHolder(itemToBuyView)
    }

    override fun getItemCount(): Int {
        return toBuyList.size
    }

    override fun onBindViewHolder(holder: ItemToBuyViewHolder, position: Int) {
        holder.itemToBuyByID.text = toBuyList[position].name
    }
}