package ejercicio7_tareas;

public class Tarea {
    private String descripcion;
    private String prioridad;
    private boolean completada;

    public Tarea(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false;
    }

    public boolean esUrgente() {
        return prioridad.equalsIgnoreCase("Alta") && !completada;
    }

    public void completar() {
        completada = true;
    }
}
