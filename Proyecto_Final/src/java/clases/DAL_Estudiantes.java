/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAL_Estudiantes {

   

    private String url = "jdbc:mysql://localhost:8889/matricula?zeroDateTimeBehavior=convertToNull";
    private String username = "root";
    private String password = "root";
    private Connection connection = null;

    public DAL_Estudiantes() {
    }

    public void insertNombre(String nombre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(nombre) "
                + "values ('" + nombre + "')", 0);

    }

    public void DeleteNombre(String nombre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where Nombre = '" + nombre + "'", 0);

    }
    

    public void insertPrimer_apellido(String primer_apellido) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(primer_apellido) "
                + "values ('" + primer_apellido + "')", 0);

    }

    public void DeletePrimer_apellido(String primer_apellido) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where primer_apellido = '" + primer_apellido + "'", 0);

    }
    public void insertSegundo_apellido(String segundo_apellido) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(segundo_apellido) "
                + "values ('" + segundo_apellido + "')", 0);

    }

    public void DeleteSegundo_apellido(String segundo_apellido) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where segundo_apellido = '" + segundo_apellido + "'", 0);

    }
    public void insertCedula(String cedula) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(cedula) "
                + "values ('" + cedula + "')", 0);

    }

    public void DeleteCedula(String cedula) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where cedula = '" + cedula + "'", 0);

    }
    public void insertFecha_nacimiento(String fecha_nacimiento) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(fecha_nacimiento) "
                + "values ('" + fecha_nacimiento + "')", 0);

    }

    public void DeleteFecha_nacimiento(String fecha_nacimiento) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where fecha_nacimiento = '" + fecha_nacimiento + "'", 0);

    }
    public void insertTelefono(String telefono) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(telefono) "
                + "values ('" + telefono + "')", 0);

    }

    public void DeleteTelefono(String telefono) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where telefono = '" + telefono + "'", 0);

    }
    public void insertCorreo(String correo) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(correo) "
                + "values ('" + correo + "')", 0);

    }

    public void DeleteCorreo(String correo) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where correo = '" + correo + "'", 0);

    }
    public void insertNombre_madre(String nombre_madre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(nombre_madre) "
                + "values ('" + nombre_madre + "')", 0);

    }

    public void DeleteNombre_madre(String nombre_madre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where nombre_madre = '" + nombre_madre + "'", 0);

    }
    public void insertPrimer_apellido_madre(String primer_apellido_madre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(primer_apellido_madre) "
                + "values ('" + primer_apellido_madre + "')", 0);

    }

    public void DeletePrimer_apellido_madre(String primer_apellido_madre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where primer_apellido_madre = '" + primer_apellido_madre + "'", 0);

    }
    public void insertSegundo_apellido_madre(String segundo_apellido_madre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(segundo_apellido_madre) "
                + "values ('" + segundo_apellido_madre + "')", 0);

    }

    public void DeleteSegundo_apellido_madre(String segundo_apellido_madre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where segundo_apellido_madre = '" + segundo_apellido_madre + "'", 0);

    }
    public void insertNombre_padre(String nombre_padre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(nombre_padre) "
                + "values ('" + nombre_padre + "')", 0);

    }

    public void DeleteNombre_padre(String nombre_padre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where nombre_padre = '" + nombre_padre + "'", 0);

    }
    public void insertPrimer_apellido_padre(String primer_apellido_padre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(primer_apellido_padre) "
                + "values ('" + primer_apellido_padre + "')", 0);

    }

    public void DeletePrimer_apellido_padre(String primer_apellido_padre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where primer_apellido_padre = '" + primer_apellido_padre + "'", 0);

    }
    public void insertSegundo_apellido_padre(String segundo_apellido_padre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(segundo_apellido_padre) "
                + "values ('" + segundo_apellido_padre + "')", 0);

    }

    public void DeleteSegundo_apellido_padre(String segundo_apellido_padre) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where segundo_apellido_padre = '" + segundo_apellido_padre + "'", 0);

    }

}
