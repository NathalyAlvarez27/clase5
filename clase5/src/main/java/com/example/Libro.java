package com.example;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void marcarComoDisponible() {
        if (disponible) {
            this.disponible = true;
            System.out.println("El libro esta disponible.");
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }

    

    public void marcarComoPrestado() {
        if (disponible) {
            this.disponible = false;
            System.out.println("El libro prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "ISBN: " + isbn + "\n"
                + "Año de Publicación: " + anioPublicacion + "\n"
                + "Disponible: " + (disponible ? "Sí" : "No");
    }
}


