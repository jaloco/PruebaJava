package main;

/**
 * Clase que representa un propietario de un vehículo.
 */
public class Propietario {
    private String nombre;
    private String fechaNacimiento;
    private Direccion direccion;

    /**
     * Constructor de la clase Propietario.
     * @param nombre El nombre del propietario.
     * @param fechaNacimiento La fecha de nacimiento del propietario.
     * @param direccion La dirección del propietario.
     * @throws IllegalArgumentException Si la dirección es nula.
     */
    public Propietario(String nombre, String fechaNacimiento, Direccion direccion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        if (direccion != null) {
            this.direccion = direccion;
        } else {
            throw new IllegalArgumentException("La dirección no puede estar vacía");
        }
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
