package factory.impl;

import factory.inter.IConexion;

public class ConexionOracle implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    public ConexionOracle() {
        this.host = "localhost";
        this.puerto = "9090";
        this.usuario = "admin";
        this.contrasenia = "456";
    }

    @Override
    public void conectar() {
        System.out.println("La BD Oracle se ha conectado exitosamente");
    }

    @Override
    public void desconectar() {
        System.out.println("La BD Oracle se ha desconectado.");
    }
}
