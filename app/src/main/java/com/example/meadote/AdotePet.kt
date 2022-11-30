package com.example.meadote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meadote.Adapter.AdapterDadosPet
import com.example.meadote.R.id.recyclerView_pets
import com.example.meadote.model.dadosPet

class AdotePet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adote_pet)

        val recyclerView_pets = findViewById<RecyclerView>(recyclerView_pets)
       recyclerView_pets.layoutManager = LinearLayoutManager(this)
       recyclerView_pets.setHasFixedSize(true)

        //configurando o adapter

        val listaPet: MutableList<dadosPet> = mutableListOf()
        val adapterDadosPet = AdapterDadosPet(this,listaPet)
        recyclerView_pets.adapter = AdapterDadosPet(this, listaPet)

        val pet01 = dadosPet(
            R.drawable.gato01,
            "Pericles",
            "Animal: Gato\n" +
                    "Raça: SRD\n" +
                    "Idade: 9 meses"
        )
        listaPet.add(pet01)

        val pet02 = dadosPet(
            R.drawable.gato02,
            "Negresco",
            "Animal: Gato\n" +
                    "Raça: SRD\n" +
                    "Idade: 12 meses"
        )
        listaPet.add(pet02)

        val pet03 = dadosPet(
            R.drawable.dog01,
            "Paulo",
            "Animal: Cachorro\n" +
                    "Raça: Vira Lata\n" +
                    "Idade: 1 ano e 6 meses"
        )
        listaPet.add(pet03)

        val pet04 = dadosPet(
            R.drawable.dog02,
            "Dorinha",
            "Animal: Cachorro\n" +
                    "Raça: Spitz Alemão\n" +
                    "Idade: 3 meses"
        )
        listaPet.add(pet04)

        val pet05 = dadosPet(
            R.drawable.coelho01,
            "Memo",
            "Animal: Coelho\n" +
                    "Raça: Toy\n" +
                    "Idade: 2 meses"
        )
        listaPet.add(pet05)

        val pet06 = dadosPet(
            R.drawable.coelho02,
            "Biscoito",
            "Animal: Coelho\n" +
                    "Raça: Toy\n" +
                    "Idade: 3 meses"
        )
        listaPet.add(pet06)

        val pet07 = dadosPet(
            R.drawable.gato01,
            "Nebuloso",
            "Animal: Coelho\n" +
                    "Raça: Leão\n" +
                    "Idade: 7 meses"
        )
        listaPet.add(pet07)
    }

}