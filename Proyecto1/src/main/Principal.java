package main;

/**
 * Clase principal que ejecuta el programa y contiene pruebas para los métodos de la clase Auto.
 */
public class Principal {
    public static void main(String[] args) {
        // Crear dirección del propietario
        Direccion direccionPropietario = new Direccion("Calle Principal", "Centro", "Ciudad Capital");
        
        // Crear propietario
        Propietario propietario = new Propietario("Juan Pérez", "1990-05-15", direccionPropietario);
        
        // Crear marca de auto
        Marca marcaAuto = new Marca("Toyota", 10, 2000, "T");
        
        // Crear auto
        Auto auto = new Auto("Corolla", "Negro", 2020, marcaAuto, "ABC123", propietario, 180, 0, 4, false, 6, true);

        // Relacionar objetos (aunque ya se relacionaron al crear el auto)
        auto.setPropietario(propietario);

        // Mostrar información del propietario
        System.out.println("Información del propietario:");
        System.out.println(propietario);

        // Mostrar información del auto
        System.out.println("\nInformación del auto:");
        System.out.println(auto);

        // Calcular autonomía y mostrar volumen de combustible
        double autonomia = auto.calcularAutonomia(10); // Suponiendo consumo medio de 10 litros por km
        System.out.println("Autonomía del vehículo: " + autonomia + " km");
        auto.mostrarVolumenCombustible();

        // Pruebas de los métodos de la clase Auto
        System.out.println("\nPruebas de los métodos de la clase Auto:");
        auto.acelerar(); // Acelerar el auto
        auto.cambiarMarcha(2); // Cambiar la marcha del auto
        auto.reducirMarcha(); // Reducir la marcha del auto
        auto.frenar(); // Frenar el auto
    }
}
