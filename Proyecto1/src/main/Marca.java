package main;

/**
 * Clase que representa una marca de automóviles.
 */
public class Marca {
    private String nombre;
    private int numeroModelos;
    private int anoLanzamiento;
    private String codigoIdentificador;

    /**
     * Constructor de la clase Marca.
     * @param nombre El nombre de la marca.
     * @param numeroModelos El número de modelos de la marca.
     * @param anoLanzamiento El año de lanzamiento de la marca.
     * @param codigoIdentificador El código identificador de la marca.
     */
    public Marca(String nombre, int numeroModelos, int anoLanzamiento, String codigoIdentificador) {
        this.nombre = nombre;
        this.numeroModelos = numeroModelos;
        this.anoLanzamiento = anoLanzamiento;
        this.codigoIdentificador = codigoIdentificador;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroModelos() {
        return numeroModelos;
    }

    public void setNumeroModelos(int numeroModelos) {
        this.numeroModelos = numeroModelos;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nombre='" + nombre + '\'' +
                ", numeroModelos=" + numeroModelos +
                ", anoLanzamiento=" + anoLanzamiento +
                ", codigoIdentificador='" + codigoIdentificador + '\'' +
                '}';
    }
}
