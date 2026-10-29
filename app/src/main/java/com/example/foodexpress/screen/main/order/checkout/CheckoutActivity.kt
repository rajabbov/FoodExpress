package com.example.foodexpress.screen.main.order.checkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.foodexpress.R
import com.example.foodexpress.databinding.ActivityCheckoutBinding

class CheckoutActivity : AppCompatActivity() {
    lateinit var binding:ActivityCheckoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lyPaymentCash.setOnClickListener {
            binding.lyPaymentCash.setBackgroundResource(R.drawable.shape_active)
            binding.imgPaymentCash.setColorFilter(ContextCompat.getColor(this,R.color.sariq),android.graphics.PorterDuff.Mode.SRC_IN)
            binding.tvPaymentCash.setTextColor(ContextCompat.getColor(this,R.color.sariq))

            binding.lyPaymentCard.setBackgroundResource(R.drawable.shape_inactive)
            binding.imgPaymentCard.setColorFilter(ContextCompat.getColor(this,R.color.kulrang),android.graphics.PorterDuff.Mode.SRC_IN)
            binding.tvPaymentCard.setTextColor(ContextCompat.getColor(this,R.color.white))
        }


        binding.lyPaymentCard.setOnClickListener {
            binding.lyPaymentCard.setBackgroundResource(R.drawable.shape_active)
            binding.imgPaymentCard.setColorFilter(ContextCompat.getColor(this,R.color.sariq),android.graphics.PorterDuff.Mode.SRC_IN)
            binding.tvPaymentCard.setTextColor(ContextCompat.getColor(this,R.color.sariq))

            binding.lyPaymentCash.setBackgroundResource(R.drawable.shape_inactive)
            binding.imgPaymentCash.setColorFilter(ContextCompat.getColor(this,R.color.kulrang),android.graphics.PorterDuff.Mode.SRC_IN)
            binding.tvPaymentCash.setTextColor(ContextCompat.getColor(this,R.color.white))
        }
    }
}