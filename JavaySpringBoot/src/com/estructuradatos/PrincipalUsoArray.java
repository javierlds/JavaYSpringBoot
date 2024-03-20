package com.estructuradatos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalUsoArray {
    public static void main(String args[]){
        boolean entradaValida = false;
        int tamanoArreglo;
        int numerosUsuario[];
        int numero;
        int opcion;
        UsoArrayList usor = new UsoArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese tamaño del arreglo");
        tamanoArreglo = scan.nextInt();
        numerosUsuario = new int[tamanoArreglo];

        while(!entradaValida){
            try{

                System.out.println("Llene el arreglo....");
                for(int i = 1; i <= tamanoArreglo; i++){
                    System.out.println("Ingrese numero:" + i);
                    numero = scan.nextInt();
                    numerosUsuario[i] = numero;
                }

                entradaValida = true;
            }catch(InputMismatchException e){
                System.out.println("Valor invalido, por favor ingrese un numero");
                scan.next();
            }
        }
        System.out.println("tamaño del arreglo:" + numerosUsuario.length);
        System.out.println("Seleccione una de las siguientes opciones");
        System.out.println("1. Ordenar arreglo");
        System.out.println("2. Numero mayor del arreglo");
        System.out.println("3. Numero menor del arreglo");
        System.out.println("4. Numeros pares arreglo");
        System.out.println("5. Numeros impares arreglo");
        opcion = scan.nextInt();
        if(opcion == 1){
            usor.ordenarArreglo(numerosUsuario);
        }
    }
}