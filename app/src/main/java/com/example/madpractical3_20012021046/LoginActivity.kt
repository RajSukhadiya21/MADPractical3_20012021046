package com.example.madpractical3_20012021046

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madpractical3_20012021046.databinding.ActivityLoginBinding
import com.example.madpractical3_20012021046.databinding.ActivityMainBinding
import com.example.madpractical3_20012021046.databinding.ActivityRegistrationBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

    }
}