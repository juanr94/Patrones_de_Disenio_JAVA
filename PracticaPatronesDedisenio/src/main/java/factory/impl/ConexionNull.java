package factory.impl;

import factory.inter.IConexion;

public class ConexionNull implements IConexion {
    @Override
    public void conectar() {
        System.out.println("No se encontro el gestor de BD para conectar.");
    }

    @Override
    public void desconectar() {
        System.out.println("Error de desconexion: no se encontró conexión de getsor.");
    }
}
