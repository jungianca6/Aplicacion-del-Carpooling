package com.example.appcarpooling

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Interfaz para definir los puntos finales de la API relacionados con las operaciones de Chofer.
 */
interface ApiService {

    /**
     * Obtiene una lista de ChoferModelos desde el servidor.
     *
     * @return Un objeto Call que representa la llamada API para obtener ChoferModelos.
     */
    @GET("/chofer")
    fun getChoferes(): Call<List<ChoferModel>>

    /**
     * Crea un nuevo ChoferModelo en el servidor.
     *
     * @param chofer El ChoferModelo que se va a crear.
     * @return Un objeto Call que representa la llamada API para crear un ChoferModelo.
     */
    @POST("/chofer")
    fun createChofer(@Body chofer: ChoferModel): Call<ChoferModel>
}