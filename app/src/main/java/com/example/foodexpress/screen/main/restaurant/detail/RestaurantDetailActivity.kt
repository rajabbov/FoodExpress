package com.example.foodexpress.screen.main.restaurant.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.foodexpress.adapter.CategoryTabAdapter
import com.example.foodexpress.adapter.CategoryTabAdapterCallback
import com.example.foodexpress.adapter.ProductAdapter
import com.example.foodexpress.databinding.ActivityRestaurantDetailBinding
import com.example.foodexpress.model.CategoryModel
import com.example.foodexpress.model.ProductModel
import com.example.foodexpress.screen.main.restaurant.feedback.FeedbackFragment

class RestaurantDetailActivity : AppCompatActivity() {
    lateinit var binding:ActivityRestaurantDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRestaurantDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerCategories.adapter = CategoryTabAdapter(
            listOf(
                CategoryModel("","Fast Food"),
                CategoryModel("","Turkish"),
                CategoryModel("","Uzbek"),
                CategoryModel("","Meat"),
            ), object : CategoryTabAdapterCallback{
                override fun onClick(item: CategoryModel) {

                }
            }
        )

        binding.recyclerProducts.layoutManager = GridLayoutManager(this,2)

        binding.recyclerProducts.adapter  = ProductAdapter(
            listOf(
                ProductModel("",""),
                ProductModel("",""),
                ProductModel("",""),
                ProductModel("",""),
            )
        )

        binding.btnFeedback.setOnClickListener {
            val fragment = FeedbackFragment.newInstance()
            fragment.show(supportFragmentManager,fragment.tag)
        }

    }


}