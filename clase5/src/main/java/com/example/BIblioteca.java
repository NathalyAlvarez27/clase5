package com.example;

public class Biblioteca {
    // Atributos: lista de libros, lista de usuarios, lista de préstamos
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;
 
    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }
 
    // Método para agregar un libro al inventario (con sobrecarga)
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
 
    // Método para registrar un usuario (con sobrecarga)
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
 
    // Método para realizar un préstamo
    public void prestarLibro(Usuario usuario, Libro libro) {
        Prestamo prestamo = new Prestamo(usuario, libro);
        prestamos.add(prestamo);
    }
 
    // Método para registrar una devolución
    public void devolverLibro(Usuario usuario, Libro libro) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getUsuario().equals(usuario) && prestamo.getLibro().equals(libro)) {
                prestamos.remove(prestamo);
                break;
            }
        }
    }
 
    // Método para buscar libros (con sobrecarga para diferentes criterios)
    public List<Libro> buscarLibros(String criterio) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().contains(criterio) || libro.getAutor().contains(criterio)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
 
    // Método para consultar préstamos de un usuario
    public List<Prestamo> consultarPrestamos(Usuario usuario) {
        List<Prestamo> resultado = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getUsuario().equals(usuario)) {
                resultado.add(prestamo);
            }
        }
        return resultado;
    }
 
    // Método para generar informes
    public void generarInforme() {
        // Generar informe de libros
        System.out.println("Informe libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
 
        // Generar informe de usuarios
        System.out.println("Informe usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
 
        // Generar informe de préstamos
        System.out.println("Informe préstamos:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}

