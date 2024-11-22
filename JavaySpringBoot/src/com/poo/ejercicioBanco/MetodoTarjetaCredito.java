package com.poo.ejercicioBanco;

public class MetodoTarjetaCredito implements MetodoPago{



    @Override
    public void procesarPago(double monto) {
        System.out.printf("Pago procesado con exito.");
    }


    @Override
    public String obtenerDetalles( String detalle) {
        String mensaje;
        mensaje = "Pago procesado con exito mediante " + detalle;
        return mensaje;
    }
}
