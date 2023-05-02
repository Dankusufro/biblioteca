package biblioteca;

import java.sql.*;
import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private String horarioAtencion;
    private Connection conexion;

    public Biblioteca(String nombre, String direccion, String horarioAtencion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioAtencion = horarioAtencion;

        // Conexión a la base de datos --- no dejar la conexion aqui  ---
        String url = "jdbc:mysql://localhost:3306/biblioteca";
        String usuario = "root";
        String contrasena = "password";
        try {
            conexion = DriverManager.getConnection(url, usuario, contrasena);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarLibro(Libro libro) {
        try {
            // Inserción del libro en la tabla "libros"
            String query = "INSERT INTO libros (titulo, autor, isbn, genero, fecha_publicacion) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, libro.getTitulo());
            statement.setString(2, libro.getAutor());
            statement.setString(3, libro.getIsbn());
            statement.setString(4, libro.getGenero());
            statement.setString(5, libro.getFechaPublicacion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarLibro(String isbn) {
        try {
            // Eliminación del libro con el ISBN dado de la tabla "libros"
            String query = "DELETE FROM libros WHERE isbn = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, isbn);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Libro> buscarLibrosPorGenero(String genero) {
        ArrayList<Libro> libros = new ArrayList<>();
        try {
            // Búsqueda de los libros por el género dado en la tabla "libros"
            String query = "SELECT * FROM libros WHERE genero = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, genero);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                String isbn = resultSet.getString("isbn");
                String fechaPublicacion = resultSet.getString("fecha_publicacion");
                libros.add(new Libro(titulo, autor, isbn, genero, fechaPublicacion));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", horarioAtencion='" + horarioAtencion + '\'' +
                '}';
    }
}

