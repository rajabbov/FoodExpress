package com.example.foodexpress.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodexpress.databinding.RestaurantItemLayoutBinding
import com.example.foodexpress.model.RestaurantModel
import com.example.foodexpress.screen.main.restaurant.detail.RestaurantDetailActivity

class RestaurantAdapter(val items:List<RestaurantModel>):
   RecyclerView.Adapter<RestaurantAdapter.ItemHolder>(){

    inner class ItemHolder(val binding:RestaurantItemLayoutBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
       return ItemHolder(
           RestaurantItemLayoutBinding.inflate(LayoutInflater.from(parent.context),
           parent,false
           )
       )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context,RestaurantDetailActivity::class.java)
            intent.putExtra("id",1)
            it.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
       return items.size
    }
}