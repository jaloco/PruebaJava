package main;
/**
 * Clase que representa una factura para una tienda de suministros informáticos.
 */
public class Factura {
    private String numero;
    private String descripcion;
    private int cantidad;
    private double precio;

    /**
     * Constructor de la clase Factura.
     * @param numero El número de la factura.
     * @param descripcion La descripción de la factura.
     * @param cantidad La cantidad comprada de un artículo.
     * @param precio El precio por artículo.
     */
    public Factura(String numero, String descripcion, int cantidad, double precio) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.setCantidad(cantidad); // Validar cantidad
        this.setPrecio(precio); // Validar precio
    }

    // Getters y setters

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    /**
     * Método que calcula el monto total de la factura.
     * @return El monto total de la factura.
     */
    public double getTotalFactura() {
        return cantidad * precio;
    }
}
