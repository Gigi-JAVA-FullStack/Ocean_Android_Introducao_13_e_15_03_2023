package com.oceanbrasil.ocean_android_introducao_13_e_15_03_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Buscar o btVoltar pelo ID
        val btVoltar: Button = findViewById(R.id.btVoltar)

        // Adicionar um listener para o btVoltar
        btVoltar.setOnClickListener {
            // Finalizamos a tela atual, uma vez que a MainActivity
            // ainda está aberta e disponível na pilha de Activities
            finish()
        }
    }
}
