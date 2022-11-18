package Libros;

import java.io.Serializable;

public class Libro implements Comparable<Libro>, Serializable {

    private String titulo, autor, genero;
    private int identificador, ejemplares , cantidad;

    public Libro() {
        this.identificador = ((int) Math.random() * 100) + 1;
    }

    public Libro(String titulo, String autor, String genero, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.identificador = (int)(Math.random() * 100) + 1;
        this.ejemplares = ejemplares;
        this.cantidad = ejemplares;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public int compareTo(Libro o) {
        if ((int) this.titulo.charAt(0) == (int) o.getTitulo().charAt(0)) {
            return 0;
        } else if ((int) this.titulo.charAt(0) < (int) o.getTitulo().charAt(0)) {
            return -1;
        } else {
            return 1;
        }
    }

}
