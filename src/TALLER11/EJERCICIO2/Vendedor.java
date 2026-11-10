package TALLER11.EJERCICIO2;

// Archivo: Vendedor.java
public class Vendedor extends Empleado {
    private double ventasRealizadas;
    private double porcentajeComision; // Ejemplo: 0.10 para 10%

    public Vendedor(String nombre, double salarioBase, double ventasRealizadas, double porcentajeComision) {
        super(nombre, salarioBase);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventasRealizadas * porcentajeComision);
    }
}
