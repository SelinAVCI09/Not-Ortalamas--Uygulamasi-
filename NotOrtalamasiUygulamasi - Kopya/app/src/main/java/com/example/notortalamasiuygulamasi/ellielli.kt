package com.example.notortalamasiuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notortalamasiuygulamasi.databinding.ActivityEllielliBinding
import com.example.notortalamasiuygulamasi.databinding.ActivityKirkaltmisBinding

class ellielli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ellielli)
        val binding = ActivityEllielliBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)

        binding.button6.setOnClickListener{
            if (binding.editTextNumber8.text.isNotEmpty()&&binding.editTextNumber9.text.isNotEmpty())
            {
                var sinav1 =binding.editTextNumber8.text.toString().toInt()
                var sinav2 =binding.editTextNumber9.text.toString().toInt()
                var ortalama = ((sinav1*5/10)+(sinav2*5/10)).toDouble()
                binding.textView5.text=ortalama.toString()
            }
            else{
                binding.textView5.text="Sınav notunzu giriniz."
                binding.textView5.setTextColor(getColor(R.color.red))
            }

        }
    }
}