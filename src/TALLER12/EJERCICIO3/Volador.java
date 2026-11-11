package TALLER12.EJERCICIO3;
// Si declaramos que una clase concreta implementa una interfaz, pero no
// proporcionamos el cuerpo de todos sus métodos abstractos:


// Interfaz
public interface Volador {
    void volar();
}

// Clase que falla en implementar el contrato
public class Avion implements Volador {
    // ERROR DE COMPILACIÓN: No se ha implementado el método abstracto volar()

    // Una interfaz es un contrato legal en el código. Toda clase concreta
    // que use la palabra clave implements se compromete a escribir la
    // definición/cuerpo { ... } de todos los métodos abstractos
    // especificados en la interfaz.
}