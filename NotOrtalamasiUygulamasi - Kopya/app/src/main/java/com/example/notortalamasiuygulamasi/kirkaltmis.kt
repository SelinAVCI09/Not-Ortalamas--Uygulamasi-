package com.example.notortalamasiuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notortalamasiuygulamasi.databinding.ActivityKirkaltmisBinding
import com.example.notortalamasiuygulamasi.databinding.ActivityYirmiseksenBinding

class kirkaltmis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirkaltmis)
        val binding = ActivityKirkaltmisBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)

        binding.button5.setOnClickListener{
            if (binding.editTextNumber6.text.isNotEmpty()&&binding.editTextNumber7.text.isNotEmpty())
            {
                var sinav1 =binding.editTextNumber6.text.toString().toInt()
                var sinav2 =binding.editTextNumber7.text.toString().toInt()
                var ortalama = ((sinav1*4/10)+(sinav2*6/10)).toDouble()
                binding.textView4.text=ortalama.toString()
            }
            else{
                binding.textView4.text="Sınav notunzu giriniz."
                binding.textView4.setTextColor(getColor(R.color.red))
            }

        }
    }
}