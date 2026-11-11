package TALLER12.EJERCICIO2;

// Archivo: Pato.java
public class Pato implements Volador, Nadador {
    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " extiende sus alas y emprende el vuelo.");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " entra al agua y comienza a nadar suavemente.");
    }
}