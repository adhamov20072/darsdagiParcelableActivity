package com.aimardon.darsdagi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aimardon.darsdagi.databinding.ActivityMainBinding
import com.aimardon.darsdagi.databinding.RecyclerItemBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var recyclerAdapter: RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val odam= arrayListOf(Person("lalalal","nananana","g'alati narsalr"),Person("lalalal","nananana","g'alati narsalr"),Person("lalalal","nananana","g'alati narsalr"),Person("lalalal","nananana","g'alati narsalr"),Person("lalalal","nananana","g'alati narsalr"))
        recyclerAdapter= RecyclerAdapter {
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("person",it)
            startActivity(intent)
        }
        binding.recyclerView.adapter=recyclerAdapter
        recyclerAdapter.submitList(odam)
    }
}