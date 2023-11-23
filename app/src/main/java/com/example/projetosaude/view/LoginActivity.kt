package com.example.projetosaude.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import com.example.projetosaude.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val switchExample: Switch = findViewById(R.id.swtLogado)

// Define um listener para o Switch
        switchExample.setOnCheckedChangeListener { buttonView, isChecked ->
            // Lógica a ser executada quando o estado do Switch muda
            val mensagem = if (isChecked) "Switch ativado" else "Switch desativado"
            Toast.makeText(this@LoginActivity, mensagem, Toast.LENGTH_SHORT).show()
        }

    }
}