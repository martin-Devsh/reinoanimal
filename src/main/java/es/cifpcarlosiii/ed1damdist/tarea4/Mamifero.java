package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa a un mamífero, heredando de la clase Animal.
 * Sirve como clase base intermedia para animales más específicos como Perro o Gato.
 * * @author Martín Fernández
 */
public class Mamifero extends Animal {

    /**
     * Constructor de la clase Mamifero.
     * Llama al constructor de la clase padre (Animal) para inicializar el nombre.
     * * @param nombre El nombre que se le asignará al mamífero.
     */
    public Mamifero(String nombre) {
        super(nombre);
    }

    /**
     * Simula la acción de reproducirse de los mamíferos.
     * Sobrescribe el método de la clase padre para indicar que la reproducción es vivípara.
     */
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    /**
     * Establece la forma en la que el mamífero se relaciona con otro animal.
     * Sobrescribe el método de la clase padre para personalizar el mensaje mostrado.
     * * @param m El objeto Animal con el que el mamífero interactúa.
     */
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.ToString());
    }
}