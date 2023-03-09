package com.example.notortalamasiuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notortalamasiuygulamasi.databinding.ActivityOndoksanBinding
import com.example.notortalamasiuygulamasi.databinding.ActivityStandarthesaplaBinding

class standarthesapla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standarthesapla)
        val binding = ActivityStandarthesaplaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)

        binding.button7.setOnClickListener{
            if (binding.editTextNumber10.text.isNotEmpty()&&binding.editTextNumber11.text.isNotEmpty()&&binding.editTextNumber12.text.isNotEmpty())
            {
                var sinav =binding.editTextNumber10.text.toString().toDouble()
                var sinifortalama =binding.editTextNumber11.text.toString().toDouble()
                var standartsapma=binding.editTextNumber12.text.toString().toDouble()
                var sonuc = (((sinav-sinifortalama)/standartsapma)*10)+50.toDouble()
                binding.textView6.text=sonuc.toString()
            }
            else{
                binding.textView6.text="Sınav notunzu giriniz."
                binding.textView6.setTextColor(getColor(R.color.red))
            }

        }
    }
}