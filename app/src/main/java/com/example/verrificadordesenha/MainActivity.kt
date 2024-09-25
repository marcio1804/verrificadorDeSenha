package com.example.verrificadordesenha

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val senhaCorreta = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextSenha: EditText = findViewById(R.id.editTextSenha)
        val buttonVerificar: Button = findViewById(R.id.buttonVerificar)
        val textViewResultado: TextView = findViewById(R.id.textViewResultado)

        buttonVerificar.setOnClickListener {
            val senhaInserida = editTextSenha.text.toString() // Capturando a senha inserida

            if (senhaInserida == senhaCorreta) {
                textViewResultado.text = "Senha correta"
            } else {
                textViewResultado.text = "Senha incorreta"
            }
        }
    }
}
