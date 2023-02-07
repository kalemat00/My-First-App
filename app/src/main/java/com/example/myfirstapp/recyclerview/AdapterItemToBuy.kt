package com.example.myfirstapp.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.R

class ItemToBuyViewHolder(view: View): RecyclerView.ViewHolder(view){
    val itemToBuyText: TextView
    val itemToBuyImage: ImageView
    init {
        itemToBuyText = view.findViewById(R.id.list_item_text)
        itemToBuyImage = view.findViewById(R.id.list_item_image)
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
        holder.itemToBuyText.text = toBuyList[position].name
        holder.itemToBuyImage.setImageResource(toBuyList[position].drawable)
    }
}