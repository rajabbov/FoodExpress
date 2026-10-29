package com.example.foodexpress.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.foodexpress.databinding.ProductItemLayoutBinding
import com.example.foodexpress.model.ProductModel

class ProductAdapter(val items:List<ProductModel>):
RecyclerView.Adapter<ProductAdapter.ItemHolder>(){

    inner class ItemHolder(val binding:ProductItemLayoutBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
  return ItemHolder(
      ProductItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
  )
    }

    override fun onBindViewHolder(holder: ProductAdapter.ItemHolder, position: Int) {
        val item = items[position]

    }

    override fun getItemCount(): Int {
        return items.size

    }
}