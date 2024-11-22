package com.poo.ejercicioAutomovil;

public class PrincipalAutomovil {
    public static void main(String[] args) {
        Automovil renaultMegane = new Automovil();
        renaultMegane.fabricante = "Renault";
        renaultMegane.capacidadTanque = 60;
        renaultMegane.cilindraje = 1600;
        renaultMegane.color = "Gris Oscuro";
        renaultMegane.linea = "Sedane";
        renaultMegane.modelo = "2008";
        System.out.println(renaultMegane.verDetalle());
        //Sobrecarga de metodos, mismo nombre de metodo diferente firma
        System.out.println(renaultMegane.calcularConsumoGasolina(200,0.5f));
        System.out.println(renaultMegane.calcularConsumoGasolina(200,50));


    }
}
