package TALLER11.EJERCICIO3;

public class PruebaError1 {
    public static void main(String[] args) {
        // INTENTO DE INSTANCIAR UNA CLASE ABSTRACTA
        Figura miFigura = new Figura(); // ERROR DE COMPILACIÓN

        // Java prohíbe crear objetos directos de clases
        // abstractas porque están incompletas por definición
        // (contienen o pueden contener métodos abstractos sin código).
    }
}