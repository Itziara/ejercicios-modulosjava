package ejercicio6_empleados;

public class Empleado {
    private String clave;
    private double salario;
    private double impuesto;

    public Empleado(String clave, double salario, double impuesto) {
        this.clave = clave;
        this.salario = salario;
        this.impuesto = impuesto;
    }

    public double salarioNeto() {
        return salario - (salario * impuesto / 100);
    }

    public void aumentar(double porcentaje) {
        salario += salario * porcentaje / 100;
    }
}
