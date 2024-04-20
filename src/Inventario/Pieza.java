package Inventario;

public abstract class Pieza {
    private String titulo;
    private String autor;
    private int anioCreacion;
    private String lugarCreacion;
    protected int tiempoGaleria;
    private int tiempoMaximo;

    // Constructor que inicializa todos los atributos
    public Pieza(String titulo, String autor, int anioCreacion, String lugarCreacion, int tiempoGaleria, int tiempoMaximo) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioCreacion = anioCreacion;
        this.lugarCreacion = lugarCreacion;
        this.tiempoGaleria = tiempoGaleria;
        this.tiempoMaximo = tiempoMaximo;
    } 


	// Métodos getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getLugarCreacion() {
        return lugarCreacion;
    }

    public void setLugarCreacion(String lugarCreacion) {
        this.lugarCreacion = lugarCreacion;
    }

    public int getTiempoGaleria() {
        return tiempoGaleria;
    }

    public void setTiempoGaleria(int tiempoGaleria) {
        this.tiempoGaleria = tiempoGaleria;
    }

    public int getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }
}
