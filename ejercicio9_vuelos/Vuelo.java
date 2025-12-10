package ejercicio9_vuelos;

public class Vuelo {
    private String codigo;
    private int capacidad;
    private int reservados;

    public Vuelo(String codigo, int capacidad) {
        this.codigo = codigo;
        this.capacidad = capacidad;
    }

    public boolean reservar() {
        if (reservados < capacidad) {
            reservados++;
            return true;
        }
        return false;
    }

    public double ocupacion() {
        return reservados * 100.0 / capacidad;
    }
}
