package com.poo.ejercicioAutomovil;

public class Automovil {

    String fabricante;
    String linea;
    String modelo;
    String color;
    double cilindraje;
    int capacidadTanque = 0;

    public String verDetalle(){
        return "Fabricante :" + this.fabricante +
                "\n Linea: " + this.linea +
                "\n Modelo: " + this.modelo +
                "\n Color: " + this.color +
                "\n Cilindraje: " + this.cilindraje;
    }

    public String acelerar(int km){
        return "El auto "+ this.fabricante + " acelerando a " + km + "kilometros";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando ";
    }

    public float calcularConsumoGasolina(int km, float porcentajeGasolina){
        return km/(capacidadTanque*porcentajeGasolina);

    }
    public float calcularConsumoGasolina(int km, int porcentajeGasolina){
        return km/(capacidadTanque* (porcentajeGasolina)/100f); // para la precision de float

    }

}
