package com.example.notortalamasiuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notortalamasiuygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val view =binding.root
        setContentView(view)

        binding.button.setOnClickListener{
            intent= Intent(applicationContext,secim::class.java)
            startActivity(intent)}

        binding.btnstandart.setOnClickListener{
            intent= Intent(applicationContext,standarthesapla::class.java)
            startActivity(intent)}

    }
}