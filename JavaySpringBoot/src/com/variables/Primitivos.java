package com.variables;
// valor por defecto de los primitivos es 0 para enteros


public class Primitivos {
    byte numeroByte = 127;
    float valorFloat = 1.0f; // la f indica que tome el valor como un float // almacenar un numero muy grande

    public void valoreFloat(){
        System.out.println("Float en bytes:" + Float.BYTES);
        System.out.println("Float en bites:" + Float.SIZE);
        System.out.println("Maximo valor para float: " + Float.MAX_VALUE);
        System.out.println("Minimo valor para float:" + Float.MIN_VALUE);
    }

    public void valorDouble(){
        System.out.println("Double en bytes:" + Double.BYTES);
        System.out.println("Double en bites:" + Double.SIZE);
        System.out.println("Maximo valor para Double: " + Double.MAX_VALUE);
        System.out.println("Minimo valor para Double:" + Double.MIN_VALUE);
    }

    public void usoChar(){
        char caracter = 'a';
        char caracterB = 'b';
        char arroba = '\u0040'; // con Caracteres unicode
        System.out.println("Uso char:" + arroba );
     }
}