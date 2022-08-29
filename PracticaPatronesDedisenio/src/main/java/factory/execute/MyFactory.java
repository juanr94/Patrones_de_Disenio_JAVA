package factory.execute;

import factory.impl.ConexionMysql;
import factory.impl.ConexionNull;
import factory.impl.ConexionOracle;
import factory.impl.ConexionSqlServer;
import factory.inter.IConexion;

public class MyFactory {
    public IConexion getCOnexion(String gestor){

        switch (gestor.toLowerCase()){
            case "mysql":
                return new ConexionMysql();
            case "oracle":
                return new ConexionOracle();
            case "sqlserver":
                return new ConexionSqlServer();
            default:
                return new ConexionNull();

        }
    }
}
