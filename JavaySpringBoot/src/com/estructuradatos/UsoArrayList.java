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
        System.out.println("Elementos recibidos:" + numeroUsu.length);
        Arrays.sort(numeroUsu); // ordena el arreglo
        System.out.print("Arreglo ordenado: ");
        for (int i = 0; i < numeroUsu.length; i++) {
            System.out.print(numeroUsu[i]);   // print => es para imprimir sin salto de linea, por eso imprime horizontal
            if (i < numeroUsu.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void numeroMayor(int numeroUsu[]){
        int mayor = numeroUsu[0];
        for(int i = 1; i < numeroUsu.length; i++){
            if(numeroUsu[i]>  mayor){
               mayor =numeroUsu[i];
            }
        }
        System.out.println("El numero mayor es:" + mayor);
    }

    public void numeroMayorOptimo(int numeroUsu[]){
        int mayor = Arrays.stream(numeroUsu).max().getAsInt();
        Arrays.stream(numeroUsu).forEach(System.out::println);  // Arrays.stream convierte el array en elementos tipo stream, y dentro del for each significa que ejecuta el system.out para cada elmento
        System.out.println("Numero mayor es:" + mayor);
    }

    public void recorrerArregloFmejorado(int numeroUsu[]){
        for (int valores : numeroUsu ) {
            System.out.println("valor del arreglo:" + valores);
        }

    }

    public String adicionaCliente(){

        return respuesta;
    }

    public String borrarCliente(){

        return respuesta;
    }
}