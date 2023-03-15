package com.oceanbrasil.ocean_android_introducao_13_e_15_03_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buscar o botão pelo ID
        // Dentro de <>, colocamos o tipo da informação. No caso, é um Button
        // Dentro de (), colocamos o ID, acessado através de R.id.nossoId
//        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btEnviar: Button = findViewById(R.id.btEnviar)

        val tvResultado: TextView = findViewById(R.id.tvResultado)

        val etNome: EditText = findViewById(R.id.etNome)

        // Adicionamos um listener ao btEnviar
        // Sempre um toque ocorrer no botão, o conteúdo dentro das { } será executado
        btEnviar.setOnClickListener {
            if (etNome.text.isBlank()) {
                // Se for true, executa o if
                // Exibir uma mensagem de erro
                etNome.error = "Digite um nome válido!"
            } else {
                // Se for false, execute o else
                // Atualizo o TextView normalmente
                tvResultado.text = etNome.text
            }
        }
    }
}
