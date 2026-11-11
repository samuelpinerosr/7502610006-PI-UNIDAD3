package TALLER11.EJERCICIO3;

// Clase Abstracta con método concreto
public abstract class Vehiculo {

    // Método concreto con implementación por defecto
    public void conducir() {
        System.out.println("Conduciendo un vehículo genérico...");
    }
}

// Clase derivada que NO sobrescribe el método concreto
public class Moto extends Vehiculo {
    // No genera error de compilación, pero ignora la necesidad de especializar el comportamiento

    //El código sí compila, porque las clases hijas heredan los métodos concretos automáticamente.

    // Error Lógico: Si era una obligación de negocio que cada vehículo definiera cómo conduce,
    // al ponerlo como método concreto perdiste el control de obligar a las clases derivadas
    // a implementarlo. Si deseas obligar a las clases derivadas a sobrescribir un comportamiento,
    // debes declarar el método como abstract y sin cuerpo.
}
