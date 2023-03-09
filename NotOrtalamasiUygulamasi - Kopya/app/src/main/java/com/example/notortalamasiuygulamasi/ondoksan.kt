package com.example.notortalamasiuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notortalamasiuygulamasi.databinding.ActivityOndoksanBinding
import com.example.notortalamasiuygulamasi.databinding.ActivitySecimBinding

class ondoksan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ondoksan)
        //buradan başlıyor
        val binding = ActivityOndoksanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)

        binding.buttonhesapla.setOnClickListener{
            if (binding.editTextNumber1.text.isNotEmpty()&&binding.editTextNumber2.text.isNotEmpty())
            {
                var sinav1 =binding.editTextNumber1.text.toString().toInt()
                var sinav2 =binding.editTextNumber2.text.toString().toInt()
                var ortalama = ((sinav1/10)+(sinav2*9/10)).toDouble()
                binding.sonuctext.text=ortalama.toString()
            }
            else{
                binding.sonuctext.text="Sınav notunzu giriniz."
                binding.sonuctext.setTextColor(getColor(R.color.red))
            }

    }
    }
}