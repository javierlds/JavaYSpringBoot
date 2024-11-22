package com.flujoscontrol;

public class UsoSwitch {
    int num = 0;
    public void diaSemana(int dia){
        try{
         /*   switch (dia)
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:*/


        }catch(Exception e){

        }

    }

    public void tipoCuenta(int tipo){
        switch (tipo){
            case 1:
                System.out.println("Cuenta de ahorros");
                break;
            case 2:
                System.out.println("Cuenta corriente");
                break;  //se rompe con sentencia switch
            case 3:
                System.out.println("No es un tipo de cuenta");
            default:
                System.out.println("No existe");
        }

    }

    public void evaluaOpcion(String opc){

        switch (num){
            case 1:
                System.out.println("Ingreso a opcion 1");
                break;
            case 2:
                System.out.println("Ingreso a opcion 2");
                break;
            default:
                System.out.println("No entro correctamente");
        }
    }

    /*
    * A partir de Java 12, se introdujo una versión mejorada del switch que soporta expresiones y permite devolver valores. Aunque sigue siendo un switch,
    * es más expresivo y menos propenso a errores como olvidarse de usar break.
    * */
   /* public String segundaFormaSwitch(int opcion){
        String input = "accion";
        String resultado = switch (opcion){
            case 1 -> "Ejecutando accion 1";
            default -> "Accion no encontrada";
        };
        return resultado;
    }*/
}
