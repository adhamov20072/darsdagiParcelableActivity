package com.aimardon.darsdagi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aimardon.darsdagi.databinding.RecyclerItemBinding

class RecyclerAdapter(val clicklistener: (Person) -> Unit) :
    ListAdapter<Person, RecyclerAdapter.MyViewHolder>(diffUtil) {
    class MyViewHolder(val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root)
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Person>() {

            override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
                return oldItem.ism == newItem.ism
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            RecyclerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.apply {
            Ism.text = item.ism
            familiya.text = item.familiya
            about.text = item.about
        }
        holder.itemView.setOnClickListener {
            clicklistener(item)
        }
    }
}