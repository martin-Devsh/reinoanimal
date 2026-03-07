package es.cifpcarlosiii.ed1damdist.tarea4;

public class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    String ToString() {
        return this.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
