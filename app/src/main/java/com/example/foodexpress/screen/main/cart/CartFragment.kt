package com.example.foodexpress.screen.main.cart

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.foodexpress.adapter.CartProductAdapter
import com.example.foodexpress.databinding.FragmentCartBinding
import com.example.foodexpress.model.ProductModel
import com.example.foodexpress.screen.main.order.checkout.CheckoutActivity

class CartFragment : Fragment() {

    lateinit var binding:FragmentCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentCartBinding.inflate(inflater)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            CartFragment()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler.layoutManager=GridLayoutManager(requireActivity(),2)
        binding.recycler.adapter=CartProductAdapter(
            listOf(
                ProductModel("",""),
                ProductModel("",""),
                ProductModel("",""),
                ProductModel("",""),
                ProductModel("",""),
                ProductModel("",""),
                ProductModel("",""),
                ProductModel("",""),
                ProductModel("",""),
                ProductModel("",""),
            )
        )

        binding.btnCheckout.setOnClickListener {
            startActivity(Intent(requireActivity(),CheckoutActivity::class.java))
        }
    }

    }