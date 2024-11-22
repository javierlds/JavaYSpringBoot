package com.arreglos.proyecto1;


public class Producto {
    private String producto;
    private int cantidad;

    //constructor de la clase
    public Producto(String producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public Producto(){

    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
