package com.example.meadote

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaCentral : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_central)

        supportActionBar!!.hide()
        window.statusBarColor = Color.parseColor("#teal_200")
    }
}