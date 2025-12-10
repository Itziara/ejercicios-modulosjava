package ejercicio3_geometria;

public class Rectangulo {
    private double base;
    private double altura;
    private String etiqueta;

    public Rectangulo(double base, double altura, String etiqueta) {
        this.base = base;
        this.altura = altura;
        this.etiqueta = etiqueta;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
}
