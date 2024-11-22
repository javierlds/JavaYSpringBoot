package com.poo.ejercicioBanco;

import java.util.Scanner;

public class Menu {
    public int menuPpal(){
        int menu;
        Scanner opcionMenu = new Scanner(System.in);
        try{
            System.out.printf("Seleccione un metodo de pago: \n" +
                    "1. Tarjeta de Credito \n" +
                    "2. Paypal  \n" +
                    "3. Transferencia Bancaria  \n");

        }catch (NumberFormatException e){
            System.out.printf("Erro: Debe indicar la opcion correcta." + e.getMessage());
        }

        return menu = Integer.parseInt(opcionMenu.nextLine());
    }
}
