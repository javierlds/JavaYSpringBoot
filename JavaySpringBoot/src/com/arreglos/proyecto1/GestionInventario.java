package com.arreglos.proyecto1;

import java.util.Scanner;

/**
 * Ejercicio 1: Sistema de Gestión de Inventarios
 * Descripción:
 * Desarrolla un programa que gestione el inventario de una tienda pequeña utilizando arreglos.
 * El sistema debe permitir:
 *
 * Registrar un producto nuevo con su nombre y cantidad.
 * Actualizar la cantidad de un producto existente.
 * Eliminar un producto del inventario.
 * Mostrar el listado completo de productos con sus cantidades.
 *
 * */
public class GestionInventario {
    Producto arregloProducto[]; //arreglo de productos;
    Producto productos;
    private int numeroProductos;
    private String nombreProducto;
    private int cantidadProducto;

    public Producto[] ingresoProducto(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Indique el numero de productos a ingresar:");
        numeroProductos = scan.nextInt();
        scan.nextLine();
        arregloProducto = new Producto[numeroProductos];//se crea el tamaño del arreglo de acuerdo a lo que indique el usuario

        for(int i = 0; i < arregloProducto.length ; i ++){
            System.out.println(" Por favor ingrese el producto #" + (i+1));

            System.out.println("Nombre producto: ");
            nombreProducto = scan.nextLine();
            System.out.println("Cantidad de productos: ");
            cantidadProducto = scan.nextInt();
            scan.nextLine();
           productos = new Producto();
            productos.setProducto(nombreProducto);
            productos.setCantidad(cantidadProducto);
            arregloProducto[i] = productos; //agrego el objeto al arreglo
        }
        return arregloProducto;
    }

    public void  listasProductos(){
        int i = 0;
        for(Producto produc: arregloProducto){
            i = i + 1;
            System.out.println("**** PRODUCTO # " + i);
            System.out.println("Nombre Producto: " + produc.getProducto());
            System.out.println("Cantidad producto:" + produc.getCantidad());
        }
    }

}
