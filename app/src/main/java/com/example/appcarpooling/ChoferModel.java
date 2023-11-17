package com.example.appcarpooling;


public class ChoferModel {

    public ChoferModel(String name, int ID, String contraseña) {
        this.name = name;
        this.ID = ID;
        this.contraseña = contraseña;
    }

    // Constructor sin argumentos necesario para Retrofit
    public ChoferModel() {
        // Se deja vacío
    }
    private String name;
    private int ID;
    private String contraseña;

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

