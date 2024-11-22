package com.poo.ejercicioBanco;

public interface MetodoPago {
    void procesarPago(double monto);
    String obtenerDetalles(String detalle);
}
