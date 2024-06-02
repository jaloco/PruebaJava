package main;

/**
 * Clase que representa a un empleado de una empresa.
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;
    private static int contadorEmpleados = 0;

    /**
     * Constructor de la clase Empleado.
     * 
     * @param nombre         El nombre del empleado.
     * @param apellido       El apellido del empleado.
     * @param salarioMensual El salario mensual del empleado.
     */
    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
        contadorEmpleados++; // Incrementa el contador de empleados
    }

    // Métodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    /**
     * Método estático que devuelve el número total de empleados en la empresa.
     * 
     * @return El número total de empleados.
     */
    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    /**
     * Método que calcula y devuelve el salario anual del empleado.
     * 
     * @return El salario anual del empleado.
     */
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }

    /**
     * Método que otorga un aumento de salario al empleado.
     * 
     * @param porcentaje El porcentaje de aumento del salario.
     */
    public void otorgarAumento(double porcentaje) {
        salarioMensual *= (1 + porcentaje / 100);
    }
}
