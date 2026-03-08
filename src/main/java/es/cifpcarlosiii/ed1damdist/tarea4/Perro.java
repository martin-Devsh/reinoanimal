package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa a un Perro que hereda de la clase Mamifero.
 * Define las características y comportamientos de los perros.
 * * @author Martín Fernández
 */
public class Perro extends Mamifero {

    /**
     * Constructor de la clase Perro.
     * Llama al constructor de la clase padre (Mamifero) para asignarle un nombre.
     * * @param nombre El nombre que se le asignará al perro.
     */
    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * Simula la acción de dormir del perro.
     * Sobrescribe el método de la clase padre indicando que sus horas de sueño dependen de su ejercicio.
     */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    /**
     * Simula el sonido de ladrar del perro.
     * Imprime por pantalla su función como labor social de guarda.
     */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    /**
     * Simula la acción de gruñir del perro.
     * Imprime por pantalla la descripción de este sonido ronco y sostenido.
     */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /**
     * Establece la forma en la que el perro se relaciona con otro animal.
     * Sobrescribe el método de la clase padre para personalizar el mensaje mostrado.
     * * @param p El objeto Animal con el que el perro interactúa.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.ToString());
    }

}