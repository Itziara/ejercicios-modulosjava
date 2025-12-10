package ejercicio5_vehiculos;

import java.time.Year;

public class Automovil {
    private String marca;
    private int anio;
    private int velocidadMax;

    public Automovil(String marca, int anio, int velocidadMax) {
        this.marca = marca;
        this.anio = anio;
        this.velocidadMax = velocidadMax;
    }

    public String encender() {
        return anio >= 2000 ? "Vehículo encendido" : "Vehículo muy antiguo";
    }

    public int antiguedad() {
        return Year.now().getValue() - anio;
    }
}
