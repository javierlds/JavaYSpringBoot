package com.conexionBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionBD {
    private String url;
    private String user;
    private String password;
    private String baseDatos;
    public static ConexionBD instace; //para identificar la unica conexion


    public void conexionBD(){
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRes = null;
        baseDatos = "CLIENTES";
        user = "postgres";
        password = "javier";
        url = "jdbc:postgresql://localhost:5433/CLIENTES";

        try{
            myConn = DriverManager.getConnection(url ,user,password);
            System.out.println("Conexion exitosa");
            myStmt = myConn.createStatement();
            myRes = myStmt.executeQuery("SELECT * FROM public.\"CLIENTE\""); // Asi especifico la conexion a postgres
            while (myRes.next()){
                System.out.println(myRes.getString("NOMBRE1"));
            }

        }catch (Exception e){
            System.out.println("Error de conexion:" + e.getMessage());
        }

    }




    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
}
