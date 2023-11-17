package com.example.appcarpooling;
/**
 * Clase que representa un modelo de Chofer.
 */
public class ChoferModel {

    /**
     * Constructor para crear un nuevo ChoferModel con la información proporcionada.
     *
     * @param name El nombre del chofer.
     * @param ID El identificador del chofer.
     * @param contraseña La contraseña del chofer.
     */
    public ChoferModel(String name, int ID, String contraseña) {
        this.name = name;
        this.ID = ID;
        this.contraseña = contraseña;
    }

    /**
     * Constructor sin argumentos necesario para Retrofit.
     */
    public ChoferModel() {
        // Se deja vacío
    }

    // Atributos de la clase

    /** Nombre del chofer. */
    private String name;

    /** Identificador del chofer. */
    private int ID;

    /** Contraseña del chofer. */
    private String contraseña;

    /**
     * Obtiene la contraseña del chofer.
     *
     * @return La contraseña del chofer.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del chofer.
     *
     * @param contraseña La nueva contraseña del chofer.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el nombre del chofer.
     *
     * @return El nombre del chofer.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del chofer.
     *
     * @param name El nuevo nombre del chofer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el identificador del chofer.
     *
     * @return El identificador del chofer.
     */
    public int getID() {
        return ID;
    }

    /**
     * Establece el identificador del chofer.
     *
     * @param ID El nuevo identificador del chofer.
     */
    public void setID(int ID) {
        this.ID = ID;
    }
}
