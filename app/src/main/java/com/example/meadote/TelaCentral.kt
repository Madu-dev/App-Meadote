package com.example.meadote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meadote.databinding.ActivityMainBinding
import com.example.meadote.databinding.ActivityTelaCentralBinding

class TelaCentral : AppCompatActivity() {

    private lateinit var binding: ActivityTelaCentralBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaCentralBinding.inflate(layoutInflater)
        setContentView(binding.bntAdotar)

        binding.bntAdotar.setOnClickListener {
            val intentAdotePet = Intent(this, AdotePet::class.java)
            startActivity(intentAdotePet)
        }
    }

}