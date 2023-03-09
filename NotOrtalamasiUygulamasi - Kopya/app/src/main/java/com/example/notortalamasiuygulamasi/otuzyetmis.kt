package com.example.notortalamasiuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notortalamasiuygulamasi.databinding.ActivityOtuzyetmisBinding
import com.example.notortalamasiuygulamasi.databinding.ActivityYirmiseksenBinding

class otuzyetmis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otuzyetmis)
        val binding = ActivityOtuzyetmisBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)

        binding.button4.setOnClickListener{
            if (binding.editTextNumber4.text.isNotEmpty()&&binding.editTextNumber5.text.isNotEmpty())
            {
                var sinav1 =binding.editTextNumber4.text.toString().toInt()
                var sinav2 =binding.editTextNumber5.text.toString().toInt()
                var ortalama = ((sinav1*3/10)+(sinav2*7/10)).toDouble()
                binding.textView2.text=ortalama.toString()
            }
            else{
                binding.textView2.text="Sınav notunzu giriniz."
                binding.textView2.setTextColor(getColor(R.color.red))
            }

        }
    }
}