package com.arreglos;

public class Arreglos1 {

    //Declaramos un arreglo e inicializamos el arreglo
    int numeros[]= new int[3];  // valor por defecto que queda es 0
    String nombres[];
    char letras[] = {'a','b','c','d','e'};


    //Modificar los valores de una arreglo
    public void poblaArreglo(){
        System.out.println("Tamaño arreglo: " + numeros.length);
        for(int i = 0; i < numeros.length; i ++){
            numeros[i] = 10 + i ;
        }
    }

    public void mostrarArreglo(){
        for(int j= 0; j< numeros.length; j++){
            System.out.println("Ciclo: " + j + ", valor:"+ numeros[j]);

        }
    }

    public void mostrarArregloLetra(){
        for(int x=0; x < letras.length; x++){
            System.out.println("Letra:" + letras[x]);
        }
    }
}