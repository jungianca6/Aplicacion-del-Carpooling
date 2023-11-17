package com.example.appcarpooling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Clase que representa la actividad de registro en la aplicación.
 */
class RegisterActivity : AppCompatActivity() {

    /** Instancia de Retrofit para realizar llamadas a la API. */
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:8080")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    /** Interfaz para realizar llamadas a la API. */
    private val apiService: ApiService = retrofit.create(ApiService::class.java)

    /**
     * Se llama cuando la actividad se está creando por primera vez.
     *
     * @param savedInstanceState Datos anteriores de la actividad, si los hay.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val tvGoLogin = findViewById<TextView>(R.id.tv_go_to_login)
        tvGoLogin.setOnClickListener {
            goToLogin()
        }
    }
    /**
     * Navega hacia la actividad de inicio de sesión.
     */
    private fun goToLogin(){
        val i= Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}