package com.fundamentos;

public class ManejoMemorias {
    public static void main(String[] args) {
        //Detalle de un libro
        String tituloLibro = "El señor de los anillos";  // objetos de tipo cadena

        // El texto esta en la HEAP"
        //STACK  => variable tituloLibro

        int anioPublicacion = 1954;
        //STACK => Solo esta el valor 1954 no se crea nada en la heap

        boolean libroDisponible = true;
        System.out.println("Libro disponible:" + libroDisponible);



    }
}
