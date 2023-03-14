package com.oceanbrasil.ocean_android_introducao_13_e_15_03_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        // Adicionamos um listener ao btEnviar
        // Sempre um toque ocorrer no botão, o conteúdo dentro das { } será executado
        btEnviar.setOnClickListener {
            tvResultado.text = "Samsung Ocean!"
        }
    }
}
