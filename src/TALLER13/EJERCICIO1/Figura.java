package TALLER13.EJERCICIO1;

// Archivo: Figura.java
public abstract class Figura {

    // Método abstracto (cada figura calcula su área de forma distinta)
    public abstract double calcularArea();

    // Método concreto común
    public void mostrarMensaje() {
        System.out.println("Cálculo de área finalizado.");
    }
}