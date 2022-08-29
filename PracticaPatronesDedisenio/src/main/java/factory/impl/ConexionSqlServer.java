package factory.impl;

import factory.inter.IConexion;

public class ConexionSqlServer implements IConexion {
    @Override
    public void conectar() {
        System.out.println("La BD SQL Server se ha conectado exitosamente");
    }

    @Override
    public void desconectar() {
        System.out.println("La BD SQL Server se ha desconectado.");
    }
}
