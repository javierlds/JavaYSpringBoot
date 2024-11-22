package com.poo.ejercicioBanco;

public class MetodoPayPal implements MetodoPago{

    @Override //Esto indica que sobreescribo el metodo declarado en la interfaz
    public void procesarPago(double monto) {

    }

    @Override
    public String obtenerDetalles(String detalle) {
        return null;
    }
}
