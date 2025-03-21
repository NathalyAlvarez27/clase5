package com.example;

public class Prestamo {
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

    // Método toString() para mostrar información del préstamo
    @Override
    public String toString() {
        return "Libro: " + libro.getTitulo() + "\n" +
               "Usuario: " + usuario.getNombre() + "\n" +
               "Fecha de Préstamo: " + fechaPrestamo + "\n" +
               "Fecha de Devolución Prevista: " + fechaDevolucionPrevista;
    }
}


}
