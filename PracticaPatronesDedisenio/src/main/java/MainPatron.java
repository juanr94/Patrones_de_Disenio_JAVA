import facade.myFacade.CheckFacade;
import factory.execute.MyFactory;
import sigleton.Sigleton;

public class MainPatron {
    public static  void  main(String [] args) {
        /**
         * Ejecutando patron sigleton.
         */
//        Sigleton mySigleton = Sigleton.miIntanciaUnica();
//        Sigleton mySigleton1 = Sigleton.miIntanciaUnica();
//        Sigleton mySigleton2 = Sigleton.miIntanciaUnica();
//        Sigleton mySigleton3 = Sigleton.miIntanciaUnica();
//
//        mySigleton3.setNombre("Juan");
//        System.out.println(mySigleton.toString());

        /**
         * Insatncia de la clase fachada
         */
        /*CheckFacade checkFacade = new CheckFacade();
        checkFacade.buscar("14/07/2022","18/07/2022","Lima","Quito");

        CheckFacade checkFacade2 = new CheckFacade();
        checkFacade2.buscar("16/07/2022","19/07/2022","Lima","Chiu");*/

        /**
         * Insrtancia de clase Factory.
         */

        MyFactory myFactory = new MyFactory();

        myFactory.getCOnexion("MySql").conectar();
        myFactory.getCOnexion("Sqlserver").conectar();
        myFactory.getCOnexion("Oracle").conectar();

    }
}
