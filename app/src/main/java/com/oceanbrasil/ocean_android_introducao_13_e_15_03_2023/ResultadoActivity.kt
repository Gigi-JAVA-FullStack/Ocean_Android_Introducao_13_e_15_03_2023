package com.oceanbrasil.ocean_android_introducao_13_e_15_03_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Pegamos o nome que foi digitado na outra tela e enviado
        // através da Intent
        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")

        // Atualizamos o TextView `tvResultado` com o valor obtido
        val tvResultado: TextView = findViewById(R.id.tvResultado)
        tvResultado.text = nomeDigitado

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
