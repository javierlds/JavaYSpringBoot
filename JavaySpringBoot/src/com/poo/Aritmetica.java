package com.poo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Aritmetica {
    private int operando1;
    private int operando2;
    int suma;
    int resta;

    //Constructor es el que se ejecuta primero
    public Aritmetica(){
        System.out.println("Creando primero el constructor");
    }

    public Aritmetica(int num1, int num2){
        this.operando1 = num1;
        this.operando2 = num2;
    }

    String opcion;

    public int sumar(int oper1, int oper2){
        suma= oper1 + oper2 ;
        return suma;
    }
    public int  restar(int oper1, int oper2){
        resta= oper1 - oper2 ;
        return resta;
    }

    public void dividir(){

    }

    public String mostrarMenu(){
        // Creando el marco principal
        JFrame frame = new JFrame("MENU PRINCIPAL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        //Creando la barra de menu
        JMenuBar menuBar = new JMenuBar();

        //Creando menu principal
        JMenu menu = new JMenu("Opciones");

        // Creando los elementos del menu
        JMenuItem opcion1 = new JMenuItem("Suma");
        JMenuItem opcion2 = new JMenuItem("Resta");
        JMenuItem opcion3 = new JMenuItem("Division");
        JMenuItem opcion4 = new JMenuItem("Multiplicacion");
        JMenuItem opcion5 = new JMenuItem("Salir");

        // Añadir los elementos al menu
        menu.add(opcion1);
        menu.add(opcion2);
        menu.add(opcion3);
        menu.add(opcion4);
        menu.add(opcion5);

        // Añadir el menu a la barra de mnu
        menuBar.add(menu);

        //Establecer la barra de menu en el marco
        frame.setJMenuBar(menuBar);

        //Añadir Action Listener para la ocion 1
        opcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNumero1 = JOptionPane.showInputDialog("Introduce numero1:");
                String inputNumero2 = JOptionPane.showInputDialog("Introduce numero2:");
                try{
                    int num1 = Integer.parseInt(inputNumero1);
                    int num2 = Integer.parseInt(inputNumero2);

                }catch (Exception o){
                    System.out.println("Error:" + o.getMessage());

                }

            }
        });

        //Mostra el marco
        frame.setVisible(true);

        opcion = "1";


        
        return opcion;
    }


    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }
    public int getOperando(){
        return operando1;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }
    public int getOperando2(){
        return operando2;
    }
}
