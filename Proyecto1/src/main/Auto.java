package main;

/**
 * Clase que representa un vehículo automóvil.
 */
public class Auto {
    private String modelo;
    private String color;
    private int ano;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private int velocidadMaxima;
    private int velocidadActual;
    private int numeroPuertas;
    private boolean tieneTechoSolar;
    private int numeroMarchas;
    private boolean transmisionAutomatica;
    private int marchaActual = 1; // Marcha actual establecida en 1 por defecto

    /**
     * Constructor de la clase Auto.
     * @param modelo El modelo del auto.
     * @param color El color del auto.
     * @param ano El año de fabricación del auto.
     * @param marca La marca del auto.
     * @param chasis El número de chasis del auto.
     * @param propietario El propietario del auto.
     * @param velocidadMaxima La velocidad máxima del auto.
     * @param velocidadActual La velocidad actual del auto.
     * @param numeroPuertas El número de puertas del auto.
     * @param tieneTechoSolar Indica si el auto tiene techo solar.
     * @param numeroMarchas El número de marchas del auto.
     * @param transmisionAutomatica Indica si el auto tiene transmisión automática.
     */
    public Auto(String modelo, String color, int ano, Marca marca, String chasis, Propietario propietario, int velocidadMaxima, int velocidadActual, int numeroPuertas, boolean tieneTechoSolar, int numeroMarchas, boolean transmisionAutomatica) {
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.numeroPuertas = numeroPuertas;
        this.tieneTechoSolar = tieneTechoSolar;
        this.numeroMarchas = numeroMarchas;
        this.transmisionAutomatica = transmisionAutomatica;    
    }

    // Getters y setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneTechoSolar() {
        return tieneTechoSolar;
    }

    public void setTieneTechoSolar(boolean tieneTechoSolar) {
        this.tieneTechoSolar = tieneTechoSolar;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isTransmisionAutomatica() {
        return transmisionAutomatica;
    }

    public void setTransmisionAutomatica(boolean transmisionAutomatica) {
        this.transmisionAutomatica = transmisionAutomatica;
    }

    // Métodos de la clase Auto

    /**
     * Acelera el auto aumentando su velocidad en 1 km/h.
     */
    public void acelerar() {
        if (velocidadActual < velocidadMaxima) {
            velocidadActual++;
            System.out.println("Acelerando... Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("Velocidad máxima alcanzada.");
        }
    }

    /**
     * Frena el auto, reduciendo su velocidad gradualmente hasta 0 km/h.
     */
    public void frenar() {
        while (velocidadActual > 0) {
            velocidadActual--;
            System.out.println("Frenando... Velocidad actual: " + velocidadActual + " km/h");
        }
        System.out.println("El auto ha frenado por completo.");
    }

    /**
     * Cambia la marcha del auto a la indicada.
     * @param nuevaMarcha La nueva marcha a la que se desea cambiar.
     */
    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 1 && nuevaMarcha <= numeroMarchas) {
            if (nuevaMarcha == -1 && velocidadActual > 0) {
                System.out.println("No se puede engranar la marcha atrás si la velocidad supera los 0 km/h");
            } else {
                System.out.println("Cambiando a la marcha " + nuevaMarcha);
                marchaActual = nuevaMarcha; 
            }
        } else {
            System.out.println("La marcha especificada no es válida para este vehículo");
        }
    }


    /**
     * Reduce la marcha del auto.
     */
    public void reducirMarcha() {
        if (velocidadActual > 0) {
            System.out.println("No se puede reducir la marcha mientras el vehículo está en movimiento.");
        } else {
            if (marchaActual > 1) {
                marchaActual--;
                System.out.println("Marcha reducida a " + marchaActual);
            } else {
                System.out.println("El vehículo ya está en la marcha más baja.");
            }
        }
    }

    /**
     * Calcula la autonomía de viaje del auto en base al consumo medio especificado.
     * @param consumoMedio El consumo medio de combustible en litros por kilómetro.
     * @return La autonomía de viaje del auto en kilómetros.
     * @throws IllegalArgumentException si el consumo medio es menor o igual a 0.
     */
    public double calcularAutonomia(double consumoMedio) {
        if (consumoMedio <= 0) {
            throw new IllegalArgumentException("El consumo medio debe ser mayor que 0.");
        }
        return 100 / consumoMedio; // Suponiendo un tanque de 100 litros de capacidad
    }

    /**
     * Muestra el volumen de combustible actual del auto.
     */
    public void mostrarVolumenCombustible() {
        System.out.println("Volumen de combustible: " + 100 + " litros"); // Suponiendo un tanque de 100 litros de capacidad
    }
}
