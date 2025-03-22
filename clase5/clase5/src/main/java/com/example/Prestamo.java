package com.example;

// Importaciones deben ir antes de la declaración de la clase
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    // Atributos
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionPrevista;

    // Constructor con parámetros
    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucionPrevista) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionPrevista = fechaDevolucionPrevista;
    }

    // Métodos getter y setter
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucionPrevista() {
        return fechaDevolucionPrevista;
    }

    public void setFechaDevolucionPrevista(LocalDate fechaDevolucionPrevista) {
        this.fechaDevolucionPrevista = fechaDevolucionPrevista;
    }

    // Método para calcular días de retraso
    public long calcularDiasRetraso(LocalDate fechaDevolucionReal) {
        if (fechaDevolucionReal.isAfter(fechaDevolucionPrevista)) {
            return ChronoUnit.DAYS.between(fechaDevolucionPrevista, fechaDevolucionReal);
        }
        return 0;
    }

    // Método toString() corregido para evitar NullPointerException
    @Override
    public String toString() {
        String tituloLibro = (libro != null) ? libro.getTitulo() : "Desconocido";
        String nombreUsuario = (usuario != null) ? usuario.getNombre() : "Desconocido";

        return "Libro: " + tituloLibro + "\n" +
               "Usuario: " + nombreUsuario + "\n" +
               "Fecha de Préstamo: " + fechaPrestamo + "\n" +
               "Fecha de Devolución Prevista: " + fechaDevolucionPrevista;
    }
}

