package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Factura;

/**
 * Clase de prueba para la clase Factura.
 */
class FacturaTest {

    @Test
    public void testGetTotalFactura() {
        // Crear una instancia de Factura
        Factura factura = new Factura("123", "Teclado", 2, 15.5);
        System.out.println("Datos de entrada - Número: " + factura.getNumero() + ", Descripción: " + factura.getDescripcion() + ", Cantidad: " + factura.getCantidad() + ", Precio: " + factura.getPrecio());

        // Calcular el total de la factura
        double totalEsperado = 2 * 15.5;
        double totalFactura = factura.getTotalFactura();
        System.out.println("Total esperado: " + totalEsperado + ", Total de la factura: " + totalFactura);

        // Verificar si el total de la factura es correcto
        assertEquals(totalEsperado, totalFactura, 0.01);
    }

    @Test
    public void testSetCantidadNegativa() {
        // Crear una instancia de Factura con cantidad negativa
        Factura factura = new Factura("123", "Teclado", -2, 15.5);
        System.out.println("Datos de entrada - Número: " + factura.getNumero() + ", Descripción: " + factura.getDescripcion() + ", Cantidad: " + factura.getCantidad() + ", Precio: " + factura.getPrecio());

        // Verificar si la cantidad se estableció correctamente como 0
        assertEquals(0, factura.getCantidad());
    }

    @Test
    public void testSetPrecioNegativo() {
        // Crear una instancia de Factura con precio negativo
        Factura factura = new Factura("123", "Teclado", 2, -15.5);
        System.out.println("Datos de entrada - Número: " + factura.getNumero() + ", Descripción: " + factura.getDescripcion() + ", Cantidad: " + factura.getCantidad() + ", Precio: " + factura.getPrecio());

        // Verificar si el precio se estableció correctamente como 0.0
        assertEquals(0.0, factura.getPrecio(), 0.01);
    }
}
