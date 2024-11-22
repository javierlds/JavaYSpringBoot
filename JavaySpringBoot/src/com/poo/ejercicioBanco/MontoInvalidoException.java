package com.poo.ejercicioBanco;

public class MontoInvalidoException extends Exception{  // heredo de la clase excepcion
    public MontoInvalidoException(){
        super("El monto ingresado no es valido.");
    }
    public MontoInvalidoException(String mensaje){
        super(mensaje);
    }
}
