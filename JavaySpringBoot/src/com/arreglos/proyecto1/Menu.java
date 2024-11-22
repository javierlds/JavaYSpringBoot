package com.arreglos.proyecto1;

import java.util.Scanner;

public class Menu {
    private int opcionMenu;

    public int menu(){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Seleccione opcion: \n " +
                    "1. Registrar producto\n" +
                    "2. Actualizar producto \n" +
                    "3. Eliminar producto \n" +
                    "4. Consultar lista de productos \n" );
            return opcionMenu = scan.nextInt();

        }catch (NumberFormatException e){
            System.out.println("Error: debe indicar una opcion correcta.");
            return -1;
        }
    }
}