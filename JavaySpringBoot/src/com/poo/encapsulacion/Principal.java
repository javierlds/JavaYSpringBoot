package com.poo.encapsulacion;

import com.poo.ejercicioAutomovil.Automovil;

public class Principal {
    public static void main(String[] args) {
        AutomovilEncapsula auto = new AutomovilEncapsula();
        auto.setMarca("Renault");  // se asigna el valor no directo a la variable
        auto.setVelocidadMaxima(170);

        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Velocidad: " + auto.getVelocidadMaxima());
    }
}