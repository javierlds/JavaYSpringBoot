package com.poo.ejercicio2Herencia;

abstract class Pedido {
    private String idPedido;
    private double monto;

    //Metodo concreto compartido con todas las clases que lo herenden
    public double calcularImpuestos(){
        return monto * 0.19;
    }

    public abstract void mostrarDetalle();

    public Pedido(String idPedido, double monto){
        this.idPedido = idPedido;
        this.monto = monto;

    }
    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
