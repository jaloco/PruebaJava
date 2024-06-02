package main;

/**
 * Clase que representa una dirección.
 */
public class Direccion {
    private String calle;
    private String barrio;
    private String ciudad;

    /**
     * Constructor de la clase Direccion.
     * @param calle La calle de la dirección.
     * @param barrio El barrio de la dirección.
     * @param ciudad La ciudad de la dirección.
     */
    public Direccion(String calle, String barrio, String ciudad) {
        this.calle = calle;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    // Getters y setters

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", barrio='" + barrio + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
