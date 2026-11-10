package EJERCICIO1;

// Archivo: Figura.java
public abstract class Figura {

    // Método abstracto que deberán implementar las clases hijas
    public abstract double calcularArea();

    // Método concreto que hace uso del método abstracto
    public void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
}