package com.estructuradatos;

import java.util.Arrays;

public class UsoArrayList {
    private String respuesta = "";
    private int numeros[];
    private int totalElementos;
    private Persona persona[]; //arreglos de personas
    public void arregloEnteros(){
        numeros = new int[3];//de tamaño 3 -- Valor por defecto para enteros es 0
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

    }

    public void ordenarArreglo(int numeroUsu[]){
        totalElementos =  numeroUsu.length;
        numeroUsu = new int[totalElementos];
        Arrays.sort(numeroUsu);
        for(int numero : numeroUsu){
            System.out.println("Arreglo ordenado:" + numero);
        }
    }

    public String adicionaCliente(){

        return respuesta;
    }

    public String borrarCliente(){

        return respuesta;
    }
}