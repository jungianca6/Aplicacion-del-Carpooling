package com.example.appcarpooling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

/**
 * Clase principal que representa la actividad principal de la aplicación.
 */
class MainActivity : AppCompatActivity() {
    /**
     * Se llama cuando la actividad se está creando por primera vez.
     *
     * @param savedInstanceState Datos anteriores de la actividad, si los hay.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvGoRegister = findViewById<TextView>(R.id.tv_go_to_register)
        tvGoRegister.setOnClickListener {
            goToRegister()
        }
    }
    /**
     * Navega hacia la actividad de registro.
     */
    private fun goToRegister(){
        val i = Intent(this,RegisterActivity::class.java)
        startActivity(i)
    }
}