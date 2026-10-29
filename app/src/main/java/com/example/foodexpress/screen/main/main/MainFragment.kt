package com.example.foodexpress.screen.main.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodexpress.adapter.CategoryAdapter
import com.example.foodexpress.adapter.RestaurantAdapter
import com.example.foodexpress.adapter.SlideAdapter
import com.example.foodexpress.databinding.FragmentMainBinding
import com.example.foodexpress.model.CategoryModel
import com.example.foodexpress.model.RestaurantModel
import com.example.foodexpress.model.SlideModel


class MainFragment : Fragment() {
   lateinit var binding:FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance()= MainFragment()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerSlides.layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerSlides.adapter = SlideAdapter(listOf(
            SlideModel("","",""),
            SlideModel("","",""),
            SlideModel("","",""),
            SlideModel("","",""),
        ))

        binding.recyclerCategories.layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerCategories.adapter = CategoryAdapter(listOf(
            CategoryModel("",""),
            CategoryModel("",""),
            CategoryModel("",""),
            CategoryModel("",""),
            CategoryModel("",""),
            CategoryModel("",""),

        ))

        binding.recyclerMcDonaldsRestaurants.layoutManager=GridLayoutManager(requireActivity(),2)
        binding.recyclerMcDonaldsRestaurants.adapter=RestaurantAdapter(listOf(
            RestaurantModel("",""),
            RestaurantModel("",""),
            RestaurantModel("",""),
            RestaurantModel("",""),
        ))

    }
}