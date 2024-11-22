package com.variables;

import java.util.Scanner;

public class PrincipalConversion {
    public static void main(String[] args) {

        int opcionMenu = 0;
        String resultadoConversion;
        String datoUsuario;
        boolean valido = false;
        Object valor;

        Scanner scan = new Scanner(System.in);

        while(!valido){
            System.out.println("Seleccione que tipo de conversion desea realizar:\n" +
                    "\n1. String a entero" +
                    "\n2. String a booelan" +
                    "\n3. String a Double" +
                    "\n4. Salir");
            Conversion conv = new Conversion();
            try{
                opcionMenu = Integer.parseInt(scan.nextLine());
                System.out.println("Ingrese un valor:");
                datoUsuario = scan.nextLine();

                valor = switch(opcionMenu){
                    case 1 -> resultadoConversion = String.valueOf(conv.conversionStrInt(datoUsuario));
                    case 2 -> resultadoConversion = String.valueOf(conv.conversionBoolean(datoUsuario)) ;
                    case 3 -> resultadoConversion = String.valueOf(conv.conversionStrDouble(datoUsuario));
                    default -> null;
                };

                valido = true;
                System.out.println("El valor convertido es: " + valor);


            }catch(NumberFormatException e){
                System.out.println("Error: debe ingresar una opcion de  menu valida");

            }
        }
    }
}
