package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Auto;
import main.Direccion;
import main.Marca;
import main.Propietario;

public class AutoTest {

    @Test
    public void testAcelerar() {
        Auto auto = new Auto("Modelo", "Color", 2020, new Marca("Marca", 5, 2020, "M"),
                             "Chasis", new Propietario("Nombre", "1990-01-01", 
                             new Direccion("Calle", "Barrio", "Ciudad")), 
                             200, 0, 4, false, 6, true);
        auto.acelerar();
        assertEquals(1, auto.getVelocidadActual());
    }

    @Test
    public void testFrenar() {
        Auto auto = new Auto("Modelo", "Color", 2020, new Marca("Marca", 5, 2020, "M"),
                             "Chasis", new Propietario("Nombre", "1990-01-01", 
                             new Direccion("Calle", "Barrio", "Ciudad")), 
                             200, 100, 4, false, 6, true);
        auto.frenar();
        assertEquals(0, auto.getVelocidadActual());
    }

    @Test
    public void testCalcularAutonomia() {
        Auto auto = new Auto("Modelo", "Color", 2020, new Marca("Marca", 5, 2020, "M"),
                             "Chasis", new Propietario("Nombre", "1990-01-01", 
                             new Direccion("Calle", "Barrio", "Ciudad")), 
                             200, 0, 4, false, 6, true);
        double autonomia = auto.calcularAutonomia(10); // Suponiendo consumo medio de 10 litros por km
        assertEquals(200, autonomia);
    }

    @Test
    public void testMostrarVolumenCombustible() {
        Auto auto = new Auto("Modelo", "Color", 2020, new Marca("Marca", 5, 2020, "M"),
                             "Chasis", new Propietario("Nombre", "1990-01-01", 
                             new Direccion("Calle", "Barrio", "Ciudad")), 
                             200, 0, 4, false, 6, true);
        auto.mostrarVolumenCombustible();
    }

    @Test
    public void testCambiarMarcha() {
        Auto auto = new Auto("Modelo", "Color", 2020, new Marca("Marca", 5, 2020, "M"),
                             "Chasis", new Propietario("Nombre", "1990-01-01", 
                             new Direccion("Calle", "Barrio", "Ciudad")), 
                             200, 0, 4, false, 6, true);
        auto.cambiarMarcha(3);
        assertEquals(3, auto.getNumeroMarchas());
    }

    @Test
    public void testReducirMarcha() {
        Auto auto = new Auto("Modelo", "Color", 2020, new Marca("Marca", 5, 2020, "M"),
                             "Chasis", new Propietario("Nombre", "1990-01-01", 
                             new Direccion("Calle", "Barrio", "Ciudad")), 
                             200, 0, 4, false, 6, true);
        auto.reducirMarcha();
        assertEquals(5, auto.getNumeroMarchas()); // Siempre y cuando el vehículo no esté detenido.
    }


}
