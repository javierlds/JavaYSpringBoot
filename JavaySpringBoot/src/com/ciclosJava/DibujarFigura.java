package com.ciclosJava;

public class DibujarFigura {
    String asterisco = "*";
    String espacioBlanco = " ";

    public void triangulo(int filas){
        for(int fila= 1; fila <= filas; fila++){
            System.out.println(espacioBlanco.repeat(filas-filas)+ asterisco.repeat(2 * fila -1));

        }



    }
/*
    public void cuadrado(){

    }

    public void rectangulo{

    }*/
}
