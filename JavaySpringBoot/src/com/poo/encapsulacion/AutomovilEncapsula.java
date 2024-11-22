package com.poo.encapsulacion;

/*
Consiste en ocultar los detalles internos de una clase, permitiendo el acceso a través de métodos públicos llamados getters y setters.
Esto protege los datos y asegura un control sobre ellos
*/

public class AutomovilEncapsula {
    private String marca;
    private int velocidadMaxima;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
