package com.example;
public class Biblioteca {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-3-16-148410-0", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", "978-0-452-28423-4", 1949);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-0-15-601219-5", 1943);

        // Mostrar información de los libros
        System.out.println(libro1);
        System.out.println();
        System.out.println(libro2);
        System.out.println();
        System.out.println(libro3);

        // Crear un usuario
        Usuario usuario = new Usuario(1, "Juan Pérez", "juanperez@example.com");
        System.out.println();
        System.out.println(usuario);

        // Agregar préstamos
        usuario.agregarPrestamo(libro1); // Éxito
        usuario.agregarPrestamo(libro1); // Ya está prestado
        usuario.agregarPrestamo(libro2); // Éxito

        System.out.println();
        System.out.println(usuario);

        // Devolver un libro
        usuario.eliminarPrestamo(libro1); // Éxito
        usuario.eliminarPrestamo(libro3); // No está en la lista

        System.out.println();
        System.out.println(usuario);
    }
}



