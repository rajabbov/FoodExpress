package com.example.foodexpress.adapter

import  android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodexpress.R
import com.example.foodexpress.databinding.CategoryTabItemLayoutBinding
import com.example.foodexpress.model.CategoryModel


interface CategoryTabAdapterCallback{
    fun onClick(item: CategoryModel)
}
class CategoryTabAdapter(val items:List<CategoryModel>,val callback: CategoryTabAdapterCallback):
RecyclerView.Adapter<CategoryTabAdapter.ItemHolder>(){

    inner class ItemHolder(val binding: CategoryTabItemLayoutBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): ItemHolder {
        return ItemHolder(
            CategoryTabItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )

    }

    override fun onBindViewHolder(holder: CategoryTabAdapter.ItemHolder, position: Int) {
        val item = items[position]

        holder.itemView.setOnClickListener {
            items.forEach {
                it.active = false
            }
            item.active=true
            notifyDataSetChanged()
            callback.onClick(item)
        }

        holder.binding.tvName.setTextColor(if (item.active) ContextCompat.getColor(holder.itemView.context, R.color.yashil)
        else  ContextCompat.getColor(holder.itemView.context, R.color.kok))



    }

    override fun getItemCount(): Int {
        return items.size

    }
}