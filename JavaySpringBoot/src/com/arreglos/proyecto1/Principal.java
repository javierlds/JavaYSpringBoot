package com.arreglos.proyecto1;

public class Principal {
    public static void main(String[] args) {
        int opcionMenu;
        Producto[] arregloProductos;
        Menu menu = new Menu();
        GestionInventario gestion = new GestionInventario();
        opcionMenu = menu.menu();
        if(opcionMenu !=-1){
            switch (opcionMenu){
                case 1:
                    arregloProductos = gestion.ingresoProducto();
                    opcionMenu = menu.menu();
                    if(opcionMenu == 4) {
                        gestion.listasProductos();

                    }
                    break;
                case 4:
                    gestion.listasProductos();
                    //System.out.println(" Desea volver al menu? ");

            }
        }
    }
}
