package com.fundamentos;

public class Conversion {

    private String numStr;
    private int num = 0;

    public int convertiraInt(String numeroStr){

        try{
            numeroStr = numeroStr;
            num = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            System.out.println("Error: el valor ingresado no es un numero valido.");
            num = 0;
        }
        return num;
    }


    public String getNumStr() {
        return numStr;
    }

    public void setNumStr(String numStr) {
        this.numStr = numStr;
    }
}
