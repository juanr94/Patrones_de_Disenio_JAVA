package factory.impl;

import factory.inter.IConexion;

public class ConexionMysql implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    public ConexionMysql() {
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasenia = "123";
    }

    @Override
    public void conectar() {
        System.out.println("La BD Mysql se ha conectado exitosamente");
    }

    @Override
    public void desconectar() {
        System.out.println("La BD Mysql se ha desconectado.");
    }
}
