package sigleton;

/**
 * El patron singletOn como su nombre lo indica (en ingles), es una Unica instancia de la clase...este patrOn es util
 * cualdo tenemos una clase que no serA intanciada muchas veces o mas bien solo se intancia una vez.
 *
 */
public class Sigleton {
    /**
     * Variable de clase singleton.
     */
    private static Sigleton mySigleton = null;

    /**
     * Variable que almacena nombre.
     */
    private String nombre;

    /**
     * Constructor del pArametro, es privado para evitar instarciar muchas veces.
     */
    private Sigleton() { }

    /**
     *
     * @return retorna un objeto de la misma clase, pues, lo que se nececita es una instancia unica de la clase,
     * la validaciOn indica que si el objeto sigue null que haga una instancia, de lo contrario que muestre la
     * instancia realizada en memoria.
     *
     */
    public static Sigleton miIntanciaUnica(){
        if(mySigleton == null) {
           return mySigleton = new Sigleton();
        }
        return mySigleton;
    }

    /**
     *
     * @return nombre insertado del mEtodo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre recibe el nombre pormedio de un parAmetro.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Sigleton{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
