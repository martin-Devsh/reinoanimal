package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa a un Gato que hereda de la clase Mamifero.
 * Define las características y comportamientos de los gatos.
 * * @author Martin Fernández
 */
public class Gato extends Mamifero {

    /**
     * Número de pelos que tiene el gato.
     * Atributo encapsulado.
     */
    private int pelos;

    /**
     * Constructor de la clase Gato.
     * Llama al constructor de la clase padre (Mamifero) para asignarle un nombre.
     * * @param nombre El nombre que se le asignará al gato.
     */
    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Simula la acción de dormir del gato.
     * Sobrescribe el método de la clase padre indicando que duerme todo el día.
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /**
     * Simula el sonido que hacen los gatos.
     * Imprime por pantalla la acción de maullar.
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     * Establece la forma en la que el gato se relaciona con otro animal.
     * Sobrescribe el método de la clase padre.
     * * @param p El objeto Animal con el que el gato interactúa.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.ToString());
    }

    /**
     * Obtiene la cantidad de pelos del gato.
     * * @return El número entero de pelos que tiene el gato.
     */
    public int getPelos() {
        return pelos;
    }

    /**
     * Modifica la cantidad de pelos del gato.
     * * @param pelos El nuevo número de pelos que se le asignará al gato.
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }
}