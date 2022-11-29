package com.example.meadote
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.meadote.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        window.statusBarColor = Color.parseColor("#FFFFFF")

        binding.bntEntrar.setOnClickListener {

            val email = binding.editEmail.text.toString()
            val senha = binding.editSenha.text.toString()

            when {
                email.isEmpty() -> {
                    binding.editEmail.error = "Preencha o campo E-mail!"
                }
                senha.isEmpty() -> {
                    binding.editSenha.error = "Digite a senha"
                }
                !email.contains("@gmail.com") -> {
                    val snackbar = Snackbar.make(it, "E-mail inválido!", Snackbar.LENGTH_SHORT)
                    snackbar.show()
                }
                senha.length <= 5 -> {
                    val snackbar = Snackbar.make(it, "A senha precisa ter pelo menos 6 caracteres!", Snackbar.LENGTH_SHORT)
                    snackbar.show()
                }
                else -> {
                    //login do usuário
                    login(it)
                }
            }
        }
    }
    private fun login(view: View){
        val progressBar = binding.progressBar
        progressBar.visibility = View.VISIBLE

        binding.bntEntrar.isEnabled = false
        binding.bntEntrar.setTextColor(Color.parseColor("#FFFFFF"))

        Handler(Looper.getMainLooper()).postDelayed({
            TelaCentral()
            val snackbar = Snackbar.make(view, "Login efetuado com sucesso!", Snackbar.LENGTH_SHORT)
            snackbar.show()
        }, 3000)
    }

    private fun TelaCentral(){
        val intent = Intent(this, TelaCentral::class.java)
        finish()
    }
    
}