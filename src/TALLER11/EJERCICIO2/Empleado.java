package TALLER11.EJERCICIO2;

// Archivo: Empleado.java
public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto
    public abstract double calcularSalario();

    // Método concreto que muestra la información y calcula el salario final
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario Total Calculado: $" + calcularSalario());
        System.out.println("-----------------------------------");
    }
}
