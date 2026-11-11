package TALLER12.EJERCICIO2;

// Archivo: MainPato.java
public class MainPato {
    public static void main(String[] args) {
        // Instanciamos el objeto Pato
        Pato miPato = new Pato("El Pato");

        // Ejecutamos ambos métodos requeridos por las interfaces
        miPato.volar();
        miPato.nadar();
    }
}