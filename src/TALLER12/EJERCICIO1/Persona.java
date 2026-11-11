package TALLER12.EJERCICIO1;

// Archivo: Persona.java
public class Persona implements Hablador, Trabajador {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " está conversando con un colega.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está realizando sus labores de trabajo.");
    }
}