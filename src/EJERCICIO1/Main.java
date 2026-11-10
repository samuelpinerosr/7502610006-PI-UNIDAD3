package EJERCICIO1;

// Archivo: Main.java (para probar el Ejercicio 1)
public class Main {
    public static void main(String[] args) {
        Figura miCirculo = new Circulo(5.0);
        Figura miRectangulo = new Rectangulo(4.0, 6.0);

        System.out.print("Círculo: ");
        miCirculo.mostrarArea(); // Llama a calcularArea() internamente

        System.out.print("Rectángulo: ");
        miRectangulo.mostrarArea(); // Llama a calcularArea() internamente
    }
}