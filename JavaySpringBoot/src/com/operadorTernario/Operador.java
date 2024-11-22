package com.operadorTernario;

public class Operador {
    String resultado;
    public void evaluaEdad(int edad){
        System.out.println(resultado = (edad > 18)?"Mayor de edad": "Menor de edad");
    }
}
