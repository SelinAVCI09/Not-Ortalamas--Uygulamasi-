package com.example.notortalamasiuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notortalamasiuygulamasi.databinding.ActivityOndoksanBinding
import com.example.notortalamasiuygulamasi.databinding.ActivityYirmiseksenBinding

class yirmiseksen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yirmiseksen)
        val binding = ActivityYirmiseksenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)

        binding.button3.setOnClickListener{
            if (binding.editTextNumber.text.isNotEmpty()&&binding.editTextNumber3.text.isNotEmpty())
            {
                var sinav1 =binding.editTextNumber.text.toString().toInt()
                var sinav2 =binding.editTextNumber3.text.toString().toInt()
                var ortalama = ((sinav1*2/10)+(sinav2*8/10)).toDouble()
                binding.sonuc.text=ortalama.toString()
            }
            else{
                binding.sonuc.text="Sınav notunzu giriniz."
                binding.sonuc.setTextColor(getColor(R.color.red))
            }

        }
    }
}