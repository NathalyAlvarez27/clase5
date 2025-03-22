package com.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro("Sapiens: De animales a dioses", "Yuval Noah Harari", "978-3-15-177880-0", 2001);
        Libro libro2 = new Libro("Yo antes de ti", "Yo antes de ti", "978-0-466-266723-2",2012 );

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear usuarios
        Usuario usuario1 = new Usuario("Nathaly Alvarez", "01");
        Usuario usuario2 = new Usuario("Susana Saldarriaga", "02");


        // Registrar usuarios en la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Realizar un préstamo
        LocalDate fechaPrestamo = LocalDate.now();
        LocalDate fechaDevolucionPrevista = fechaPrestamo.plusDays(14); // Devolución en 14 días
        Prestamo prestamo1 = new Prestamo(libro1, usuario1, fechaPrestamo, fechaDevolucionPrevista);

        // Agregar préstamo a la biblioteca
        biblioteca.prestarLibro(usuario1, libro1);

        // Imprimir información del préstamo
        System.out.println("Información del préstamo ");
        System.out.println(prestamo1);

        // Devolución del libro
        biblioteca.devolverLibro(usuario1, libro1);
        System.out.println("El libro ha sido devuelto.");

        // Generar informe de la biblioteca
        System.out.println(" Informe de la Biblioteca ");
        biblioteca.generarInforme();
    }
}
