package TALLER13.EJERCICIO3;
// Si intentas usar la palabra clave default dentro de una clase abstracta:


public abstract class Persona {

    // INTENTO DE USAR 'default' EN UNA CLASE ABSTRACTA
    public default void saludar() {  // ERROR DE COMPILACIÓN
        System.out.println("Hola");

        // Las clases abstractas siempre han tenido la capacidad nativa
        // de definir métodos concretos con cuerpo sin necesidad de usar
        // ninguna palabra clave especial. Para definir un método con
        // implementación heredable en una clase abstracta, simplemente
        // se omite la palabra clave abstract (y no se pone default).
    }
}