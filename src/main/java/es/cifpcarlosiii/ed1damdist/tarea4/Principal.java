package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase principal ejecutable del proyecto "reino-animal".
 * Contiene el punto de entrada de la aplicación donde se instancian los objetos
 * de la jerarquía.
 * * @author Martín Fernández
 */
public class Principal {

    /**
     * Método principal que ejecuta las pruebas sobre las clases de animales.
     * Crea diferentes instancias, las almacena en un array de tipo genérico Animal y
     * recorre la estructura comprobando el tipo real de cada objeto usando instanceof.
     * * @param args Argumentos pasados por la línea de comandos (no se utilizan en este script).
     */
    public static void main(String[] args) {

/*
Esquema de clases de reino-animal
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \
          Perro          Gato
*/

        Animal animal = new Animal("Bicho");

        Mamifero mamifero = new Mamifero("Peludo");

        Perro toby = new Perro("Toby");

        Gato isidoro = new Gato("isidoro");
        isidoro.setPelos(4);

        animal = isidoro;

        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.getPelos());

        Animal array[] = new Animal[4];

        array[0] = animal;
        array[1] = mamifero;
        array[2] = toby;
        array[3] = isidoro;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}