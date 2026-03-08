package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa a un animal genérico dentro del reino animal.
 * Sirve como clase base (padre) para otras clases más específicas.
 * * @author Martin Fernández
 */

public class Animal {

    /**
     * Nombre del animal.
     */
    private String nombre;

    /**
     * Constructor de la clase Animal.
     * * @param nombre El nombre que se le va a asignar al animal al crearlo.
     */

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Imprime por pantalla la necesidad de alimentarse.
     */

    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    /**
     * Imprime por pantalla la necesidad de descansar.
     */

    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    /**
     * Imprime por pantalla la capacidad de originar nueva vida.
     */

    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /**
     * Establece una relación con otro animal.
     * * @param a El objeto Animal con el que se va a relacionar.
     */

    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    /**
     * Devuelve una representación en texto del animal (su nombre).
     * * @return El nombre del animal en formato cadena de texto.
     */

    String ToString() {
        return this.getNombre();
    }


    /**
     * Obtiene el nombre actual del animal.
     * * @return El nombre del animal.
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del animal.
     * * @param nombre El nuevo nombre que se le asignará al animal.
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
