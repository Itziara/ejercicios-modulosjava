package ejercicio1_libros;

public class Libro {
    private String id;
    private String autor;
    private boolean disponible;
    private int anioPublicacion;

    public Libro(String id, String autor, int anioPublicacion) {
        this.id = id;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void reservarLibro() {
        disponible = false;
    }

    public boolean esAptoPrestamo() {
        return (2025 - anioPublicacion) > 5;
    }
}
