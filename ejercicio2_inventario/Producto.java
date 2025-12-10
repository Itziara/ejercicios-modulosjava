package ejercicio2_inventario;

public class Producto {
    private String referencia;
    private int stock;
    private double precio;

    public Producto(String referencia, int stock, double precio) {
        this.referencia = referencia;
        this.stock = stock;
        this.precio = precio;
    }

    public void agregarStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
        }
    }

    public double valorTotalStock() {
        return stock * precio;
    }
}
