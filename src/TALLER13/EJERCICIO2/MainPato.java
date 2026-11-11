package TALLER13.EJERCICIO2;

// Archivo: MainPato.java
public class MainPato {
    public static void main(String[] args) {
        Pato miPato = new Pato("Pato Donald");

        // Invocación de los métodos de las interfaces implementadas
        miPato.volar();
        miPato.nadar();
    }
}