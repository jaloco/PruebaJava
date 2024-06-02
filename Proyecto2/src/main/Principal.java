package main;

/**
 * Clase principal para probar la clase Factura.
 */
public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de Factura
        Factura factura1 = new Factura("123", "Teclado", 2, 15.5);

        // Imprimir detalles de la factura
        System.out.println("Número de factura: " + factura1.getNumero());
        System.out.println("Descripción: " + factura1.getDescripcion());
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio: " + factura1.getPrecio());
        System.out.println("Total de la factura: " + factura1.getTotalFactura());

        // Modificar la cantidad y el precio de la factura
        factura1.setCantidad(3);
        factura1.setPrecio(20.0);

        // Imprimir detalles actualizados de la factura
        System.out.println("\nDespués de modificar cantidad y precio:");
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio: " + factura1.getPrecio());
        System.out.println("Total de la factura: " + factura1.getTotalFactura());
    }
}
