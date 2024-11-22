package com.fundamentos;

import com.variables.Primitivos;

import javax.swing.*;

public class Principal {
    public static void main (String args[]){
        Primitivos prm  = new Primitivos();
       // System.out.println(prm.valorFloat);
        prm.valoreFloat();

        prm.valorDouble(); // double es mas grande que float
        prm.usoChar();

        int numero= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero"));
        numero += 8000;
        String mensaje;
        mensaje = "El valor con iva es:" + numero;
        JOptionPane.showMessageDialog(null,numero);
    }

}
