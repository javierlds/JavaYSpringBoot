package com.poo.ejercicio1Herencia;

import java.util.Date;

public class Empleado {
    /*Atributos: Caracteristicas de la clase*/
    private String nombre;
    private String apellido;
    private String apellido2;
    private Date fechaNacimiento;
    private String mail;
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    /*Constructor*/
    public Empleado(){

    }

    public Empleado(String nombre, String apellido, String apellido2){  // Constructor de la clase
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
    }


    /*Metodos: Acciones (Verbos infinitivo)*/

    public void  mostrarEmpleado(){
        System.out.println("Nombre persona:" + nombre);
        System.out.println("Apellido persona:" + apellido);

    }

    public void saludar(){
        System.out.println("Bienvenido al sistema.");
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getSalario() {
        return salario;
    }



}
