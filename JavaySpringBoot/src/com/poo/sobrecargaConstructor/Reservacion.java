package com.poo.sobrecargaConstructor;

import java.time.LocalDate;

public class Reservacion {
    private String numeroReserva;
    private String nombreCliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double montoTotal;
    private boolean estaPagado;

    //Constructo principal
    public Reservacion(String numeroReserva, String nombreCliente, LocalDate fechaInicio,
                       LocalDate fechaFin, double montoTotal){
        this.numeroReserva = numeroReserva;
        this.nombreCliente = nombreCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoTotal = montoTotal;

    }
    public Reservacion(String numeroReserva, String nombreCliente, LocalDate fechaInicio){
        this.numeroReserva = numeroReserva;
        this.nombreCliente = nombreCliente;
        this.fechaInicio = fechaInicio;
    }
// de esta forma se puede reutilizar los constructores
    public Reservacion(String numeroReserva, String nombreCliente, LocalDate fechaInicio, double monto){
        this(numeroReserva,nombreCliente,fechaInicio);
        this.montoTotal = monto;
    }

}
