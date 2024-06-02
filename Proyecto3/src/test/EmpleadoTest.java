package test;

import main.Empleado;

/**
 * Clase de prueba para la clase Empleado.
 */
public class EmpleadoTest {
    public static void main(String[] args) {
        // Crear dos objetos Empleado
        Empleado empleado1 = new Empleado("Juan", "Pérez", 3000);
        Empleado empleado2 = new Empleado("María", "García", 4000);

        // Mostrar el salario mensual de cada empleado
        System.out.println("Salario mensual de " + empleado1.getNombre() + ": $" + empleado1.getSalarioMensual());
        System.out.println("Salario mensual de " + empleado2.getNombre() + ": $" + empleado2.getSalarioMensual());

        // Otorgar un aumento del 10% a cada empleado
        empleado1.otorgarAumento(10);
        empleado2.otorgarAumento(10);

        // Mostrar el salario anual actualizado de cada empleado
        System.out.println("Salario anual de " + empleado1.getNombre() + " después del aumento: $" + empleado1.calcularSalarioAnual());
        System.out.println("Salario anual de " + empleado2.getNombre() + " después del aumento: $" + empleado2.calcularSalarioAnual());

        // Mostrar el número total de empleados en la empresa
        System.out.println("Número total de empleados en la empresa: " + Empleado.getContadorEmpleados());
    }
}
