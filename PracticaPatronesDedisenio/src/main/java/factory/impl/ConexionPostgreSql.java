package factory.impl;

import factory.inter.IConexion;

public class ConexionPostgreSql implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    public ConexionPostgreSql() {
        this.host = "localhost";
        this.puerto = "1590";
        this.usuario = "admin";
        this.contrasenia = "789";
    }

    @Override
    public void conectar() {
        System.out.println("La BD PostgreSql se ha conectado exitosamente");
    }

    @Override
    public void desconectar() {
        System.out.println("La BD PostgreSql se ha desconectado.");
    }
}
