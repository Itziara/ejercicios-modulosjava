package ejercicio8_temperatura;

public class Temperatura {
    private double valor;
    private String unidad;
    private String fecha;

    public Temperatura(double valor, String unidad, String fecha) {
        this.valor = valor;
        this.unidad = unidad;
        this.fecha = fecha;
    }

    public void convertir() {
        if (unidad.equalsIgnoreCase("C")) {
            valor = valor * 9 / 5 + 32;
            unidad = "F";
        } else {
            valor = (valor - 32) * 5 / 9;
            unidad = "C";
        }
    }

    public boolean esExtrema() {
        return unidad.equalsIgnoreCase("C") && valor > 40;
    }
}
