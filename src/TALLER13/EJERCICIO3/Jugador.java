package TALLER13.EJERCICIO3;
// Si declaramos que una clase concreta implementa
// una interfaz pero omitimos la sobrescritura de sus métodos abstractos:


public interface Jugador {
    void jugar();
}

// Intentar declarar una clase concreta sin implementar el método
public class Futbolista implements Jugador {
    // ERROR DE COMPILACIÓN


    // En Java, si una clase se declara concreta (no lleva la palabra
    // reservada abstract), asume la obligación estricta de proporcionar
    // una implementación con cuerpo { ... } para absolutamente todos
    // los métodos abstractos provenientes de sus interfaces implementadas.
}