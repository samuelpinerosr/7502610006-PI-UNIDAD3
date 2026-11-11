package TALLER13.EJERCICIO1;

// Archivo: MainFigura.java
public class MainFigura {
    public static void main(String[] args) {
        Figura miRectangulo = new Rectangulo(5.0, 4.0);
        Figura miTriangulo = new Triangulo(6.0, 3.0);

        System.out.println("Área del Rectángulo: " + miRectangulo.calcularArea());
        System.out.println("Área del Triángulo: " + miTriangulo.calcularArea());
    }
}