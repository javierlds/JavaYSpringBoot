package com.poo.ejercicio1Herencia;

public class PrincipalEmpleado {
    public static void main(String args[]){
        System.out.println("********** Creacion clase y objetos empleado");
        Empleado empleado = new Empleado(); // reserva espacio en memoria para la empleado sin asignar valor
        empleado.setNombre("Javier");
        empleado.setApellido("Paez");
        empleado.mostrarEmpleado();

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Juan");
        empleado2.setApellido("Pacheco");
        empleado2.mostrarEmpleado();

    }
}
