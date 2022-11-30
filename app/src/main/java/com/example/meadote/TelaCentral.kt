package com.example.meadote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.meadote.databinding.ActivityMainBinding
import com.example.meadote.databinding.ActivityTelaCentralBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class TelaCentral : AppCompatActivity() {

    private lateinit var binding: ActivityTelaCentralBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaCentralBinding.inflate(layoutInflater)
        setContentView(binding.bntAdotar)

        binding.bntAdotar.setOnClickListener {
            val intentAdotePet = Intent(this, AdotePet::class.java)
            startActivity(intentAdotePet)
        }

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        setupWithNavController(bottomNavigationView, navController)
    }

}