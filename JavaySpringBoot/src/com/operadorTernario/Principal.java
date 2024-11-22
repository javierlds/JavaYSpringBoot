package com.operadorTernario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int edad;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Ingrese edad:");
            edad = scan.nextInt();
            Operador operador = new Operador();
            operador.evaluaEdad(edad);

        }catch(InputMismatchException e){
            System.out.println("Debe ingresar solo numeros!!");
            scan.next();
        }
    }
}