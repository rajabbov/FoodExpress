package com.example.foodexpress.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodexpress.databinding.CategoryItemLayoutBinding
import com.example.foodexpress.model.CategoryModel

class CategoryAdapter(val items:List<CategoryModel>):
RecyclerView.Adapter<CategoryAdapter.ItemHolder>(){

    inner class ItemHolder(val binding: CategoryItemLayoutBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ItemHolder {
       return ItemHolder(
           CategoryItemLayoutBinding.inflate(
               LayoutInflater.from(parent.context),
               parent,false
           )
       )
    }

    override fun onBindViewHolder(holder: CategoryAdapter.ItemHolder, position: Int) {
        val item = items[position]
    }

    override fun getItemCount(): Int {
      return items.size
    }
}