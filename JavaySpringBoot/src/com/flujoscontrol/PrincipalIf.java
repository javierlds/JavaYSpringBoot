package com.flujoscontrol;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrincipalIf {
    public static void main(String[] args) {
        try{
            String cadena;
            EjemploIf ejem = new EjemploIf();
            System.out.println("Ingrese una cadena:");
            Scanner scan = new Scanner(System.in);
            cadena = scan.nextLine();
            System.out.println(ejem.validaVocales(cadena));

        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}