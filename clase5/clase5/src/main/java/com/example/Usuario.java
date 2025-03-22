package com.example;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    private List prestamos;

    public Usuario() {
        this.prestamos = new ArrayList<>();
    }

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.prestamos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Libro> getPrestamos() {
        return prestamos;
    }

    public void agregarPrestamo(Libro libro) {
        if (libro.isDisponible()) {
            prestamos.add(libro);
            libro.marcarComoPrestado();
            System.out.println("Se agrego el prestamo");
        } else {
            System.out.println("Libro prestado.");
        }
    }

    
    public void eliminarPrestamo(Libro libro) {
        if (prestamos.contains(libro)) {
            prestamos.remove(libro);
            libro.marcarComoDisponible();
            System.out.println("Préstamo .");
        } else {
            System.out.println("El libro no está en la lista de préstamos.");
        }
    }

    
    @Override
    public String toString() {
        return "ID: " + id + "\n " +
               "Nombre: " + nombre + "\n" +
               "Email: " + email + "\n" +
               "Préstamos actuales: " + prestamos.size();
                
        
    }
}




