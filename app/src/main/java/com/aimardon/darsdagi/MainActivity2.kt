package com.aimardon.darsdagi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aimardon.darsdagi.databinding.ActivityMain2Binding
import com.aimardon.darsdagi.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.text.text=intent.extras?.getParcelable<Person>("person")?.about

    }
}