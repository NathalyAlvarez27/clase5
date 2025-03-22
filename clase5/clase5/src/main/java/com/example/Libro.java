package com.example;

        import java.util.List;
        import java.util.ArrayList;
        import java.time.LocalDate;
        import java.time.temporal.ChronoUnit;
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

            public static class Biblioteca {
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
                    Prestamo prestamo = new Prestamo(libro, usuario, LocalDate.now(), LocalDate.now().plusDays(14));
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
        }