package ejercicio10_texto;

public class Texto {
    private String texto;
    private String id;
    private int max;

    public Texto(String texto, String id, int max) {
        this.texto = texto;
        this.id = id;
        this.max = max;
    }

    public String agregarPrefijo(String prefijo) {
        return prefijo + texto;
    }

    public int contarEspacios() {
        int c = 0;
        for (char ch : texto.toCharArray()) {
            if (ch == ' ') c++;
        }
        return c;
    }
}
