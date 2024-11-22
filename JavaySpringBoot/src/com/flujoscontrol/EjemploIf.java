package com.flujoscontrol;

public class EjemploIf {
    private final String cadena = "arma";
    private final String cadena2 = "pistola";
    private String mensaje;

    public String validaVocales(String paramCadena){

        if (paramCadena.equals(cadena)){  // EQUALS NO DISTINGUE ENTRE MAYUSCULAS Y MINUSCULAS
            mensaje = "es igual a arma";

        }else if(paramCadena.equals(cadena)|| paramCadena.equals("cadena2")){
            mensaje = "es igual a pistola";
        }
        else {
            mensaje = "no es igual";
        }
        return mensaje;
    }
}