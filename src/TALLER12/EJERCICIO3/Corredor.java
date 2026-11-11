package TALLER12.EJERCICIO3;

//Ejemplo donde el código sí compila,
// pero viola los principios de diseño orientado a objetos:


public interface Corredor {
    void correr();
}

// Mala práctica de diseño:
public class Arbol implements Corredor {
    @Override
    public void correr() {
        // Un árbol no corre; el método carece de sentido conceptual
        System.out.println("Los árboles no pueden correr.");


        //ES MALA PRÁCTICA PORQUE:

        // Las interfaces deben representar capacidades reales
        // ("puede-hacer") del objeto. Asignar capacidades
        // ficticias o absurdas genera código confuso y propenso
        // a errores de diseño.

        // Forzar a un objeto a implementar comportamientos que
        // no necesita ni comprende ensucia la estructura del
        // programa y genera implementaciones vacías o absurdas.

        // El polimorfismo busca que se pueda confiar en que
        // cualquier clase Corredor ejecutará la acción de
        // correr adecuadamente. Si un Arbol responde que no
        // puede correr, se rompe la expectativa semántica de la
        // interfaz.
    }
}