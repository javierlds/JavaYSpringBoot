package com.variables;

public class Conversion {


    //  ***************************** CONVERSIONES  STRING A PRIMITIVOS  ******************************
    public int conversionStrInt(String parametro){
        try{
            return Integer.parseInt(parametro);

        }catch(NumberFormatException e){
            System.out.println("Error: El valor ingresado no es un numero valido.");
            return 0;
        }
    }

    public double conversionStrDouble(String parametro){
        try{
            return Double.parseDouble(parametro);
        }catch(NumberFormatException e){
            System.out.println("Error: El valor ingresado no es un numero valido.");
            return 0.0;
        }
    }

    public boolean conversionBoolean(String parametro){
        if(parametro.equalsIgnoreCase("true")||parametro.equalsIgnoreCase("false")){
            return  Boolean.parseBoolean(parametro);  // Utiliza internamente equalsIgnoreCase que ignora minusculas o mayusculas
        }else{
            System.out.println("Error: El valor ingresado no es un boolean valido");
            return false;
        }
    }

    //  ***************************** AHORA CONVERSIONES PRIMITIVOS A STRING ******************************
    public String conversionIntString(Object parametro){ // Object toma cualquier tipo de datos primitivo sin necesidad de hacer un metodo por cada uno
        return  String.valueOf(parametro);

    }
}