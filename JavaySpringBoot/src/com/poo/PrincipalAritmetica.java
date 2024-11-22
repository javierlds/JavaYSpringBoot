package com.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalAritmetica {

    static String opcion;
    static int numero1;
    static int numero2;
    static String salida;
    static int indicador = 0;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aritmetica operaciones = new Aritmetica();
        opcion = operaciones.mostrarMenu();
        while(true){
            try{
                //scan.nextLine(); // para consumir el \n y se pueda digitar un nuevo valor

             /*  if(opcion.equalsIgnoreCase("5")){
                   while(true){
                       scan.nextLine();
                       System.out.println("Confirma que desea salir S/N?");
                       salida = scan.nextLine();

                       switch (salida.toUpperCase()){
                           case "S":
                               indicador = 1;
                               break;
                           case "N":
                               indicador = 0;
                              break;
                           default:
                               System.out.println("Opcion invalida");
                               continue;
                       }
                       if(indicador != 2){
                           break;
                       }
                       scan.nextLine();
                   }
               } */
              /* if(indicador ==1){
                   System.out.println("Saliendo....");
                   break;
               }
                //opcion = operaciones.mostrarMenu();

                System.out.println("Ingrese numero1:");
                numero1 = scan.nextInt();
                System.out.println("Ingrese numero2:");
                numero2 = scan.nextInt();

                System.out.println("VALOR DE OPCION:" + opcion);

                switch (opcion){
                    case "1":
                        System.out.println("El valor de la suma es:" + operaciones.sumar(numero1,numero2));
                        break;
                    case "2":
                        System.out.println("El valor de la resta es:" + operaciones.restar(numero1,numero2));
                        break;
                    case "5":
                        break;
                    default:
                        break;
                }

*/
            }catch (InputMismatchException e){
                System.out.println("Opcion invalida, debes ingresar un valor numerico");
            }
        }
    }
}
