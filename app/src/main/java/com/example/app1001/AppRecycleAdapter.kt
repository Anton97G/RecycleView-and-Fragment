package com.example.app1001

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app1001.databinding.AppAdapterBinding

class AppRecycleAdapter():RecyclerView.Adapter<AppRecycleAdapter.AppViewHolder>() {


   private val adapterList = mutableListOf<Product>()

    inner class AppViewHolder(private var binding: AppAdapterBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(item:Product){

            binding.tvProductTitle.text = item.title
            binding.tvProductPrice.text = item.price.toString()

            Glide
                .with(binding.root.context)
                .load(item.image)
                .into(binding.tvProductImage)



        }
    }


    fun submitList(list: List<Product>){
        adapterList.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
       return AppViewHolder(
           AppAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
       )
    }

    override fun getItemCount(): Int {
       return adapterList.size
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        holder.onBind(adapterList[position])
    }







}