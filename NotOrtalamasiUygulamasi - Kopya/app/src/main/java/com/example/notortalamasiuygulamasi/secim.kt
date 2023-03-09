package com.example.notortalamasiuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notortalamasiuygulamasi.databinding.ActivityMainBinding
import com.example.notortalamasiuygulamasi.databinding.ActivitySecimBinding

class secim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secim)
        val binding = ActivitySecimBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val view =binding.root
        setContentView(view)
        //yüzde on yüzde doksan
        binding.button2.setOnClickListener{
            intent= Intent(applicationContext,ondoksan::class.java)
            startActivity(intent)}
        //yüzde yirmi yüzde seksen
        binding.buttonyirmi.setOnClickListener{
            intent= Intent(applicationContext,yirmiseksen::class.java)
            startActivity(intent)}
        //yüzde otuz yüzde yetmiş
        binding.button10.setOnClickListener{
            intent= Intent(applicationContext,otuzyetmis::class.java)
            startActivity(intent)}
        //yüzde kırk yüzde altmış
        binding.button40.setOnClickListener{
            intent= Intent(applicationContext,kirkaltmis::class.java)
            startActivity(intent)}
        //yüzde elli yüzde elli
        binding.button50.setOnClickListener{
            intent= Intent(applicationContext,ellielli::class.java)
            startActivity(intent)}

    }
    }


