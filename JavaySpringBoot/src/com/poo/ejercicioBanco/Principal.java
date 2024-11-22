package com.poo.ejercicioBanco;

import java.util.Scanner;


public class Principal {
    private static final String MENSAJE_TARJETA_CREDITO = "Pago procesado con exito mediante tarjeta de credito. \n Ultimos 4 digitos:";
    private static final String MENSAJE_PAYPAL = "Pago procesado con exito mediante Paypal valor:";
    private static final String MENSAJE_EFECTIVO = "Pago procesado con exito mediante transferencia bancaria valor:";

    public static void main(String[] args) {
        int opcionSeleccionada;
        int monto = 0;
        String digitos ;
        String detalle;

        MetodoTarjetaCredito tarjeta = new MetodoTarjetaCredito();
        Scanner opciones = new Scanner(System.in);

        System.out.println("Ingrese el monto a pagar:");
        monto = opciones.nextInt();
        System.out.println("Ingrese los ultimos 4 digitos de su tarjeta:");
        digitos = opciones.nextLine();

        if (digitos.length() <4 ) {
            System.out.println("Debe ingresar los 4 ultimos digitos de su tarjeta");
        }
        try{
            validarMonto(monto);

        }catch (MontoInvalidoException e ){
            System.out.println("Error: " + e.getMessage());
        }

        Menu menu = new Menu();
        opcionSeleccionada = menu.menuPpal();

        if (opcionSeleccionada == 1) {
            tarjeta.procesarPago(monto);
            tarjeta.obtenerDetalles(MENSAJE_TARJETA_CREDITO + digitos);
        }else if(opcionSeleccionada == 2){
            tarjeta.procesarPago(monto);
            tarjeta.obtenerDetalles(MENSAJE_PAYPAL + monto);
        }else if(opcionSeleccionada ==3){
            tarjeta.procesarPago(monto);
            tarjeta.obtenerDetalles(MENSAJE_EFECTIVO + monto);
        }
    }

    public static void validarMonto(int monto)throws MontoInvalidoException{ // throws indica que el metodo puede lanzar una excepcion
        if(monto <= 0){
            throw new MontoInvalidoException("El monto debe ser mayor que cero");
        }


    }
}
