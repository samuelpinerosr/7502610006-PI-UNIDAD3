package TALLER11.EJERCICIO2;

// Archivo: MainEmpleado.java (para probar el Ejercicio 2)
public class MainEmpleado {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos Pérez", 3500000, 800000);
        Empleado vendedor = new Vendedor("Ana Gómez", 1300000, 5000000, 0.05);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}