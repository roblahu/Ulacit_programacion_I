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
        //Class.forName("com.mysql.jdbc.Driver");  
    }

    public void insertEstudiante(
            String nombre,
            String primer_apellido,
            String segundo_apellido,
            String cedula,
            String fecha_nacimiento,
            String telefono,
            String correo,
            String nombre_madre,
            String primer_apellido_madre,
            String segundo_apellido_madre,
            String nombre_padre,
            String primer_apellido_padre,
            String segundo_apellido_padre,
            String grado
            
        ) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Estudiantes(nombre, primer_apellido,segundo_apellido,"
                + "cedula,fecha_nacimiento,telefono,correo,nombre_madre,"
                + "primer_apellido_madre,segundo_apellido_madre,nombre_padre,"
                + "primer_apellido_padre,segundo_apellido_padre, grado) "
                + "values ('"
                + nombre
                + "','"
                + primer_apellido
                + "','"
                + segundo_apellido
                + "','"
                + cedula
                + "','"
                + fecha_nacimiento
                + "','"
                + telefono
                + "','"
                + correo
                + "','"
                + nombre_madre
                + "','"
                + primer_apellido_madre
                + "','"
                + segundo_apellido_madre
                + "','"
                + nombre_padre
                + "','"
                + primer_apellido_padre
                + "','"
                + segundo_apellido_padre
                + "','"
                + grado
                + "')",
                0);

    }

    public void DeleteEstudiante(String cedula) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM Estudiantes where cedula = '" + cedula + "'", 0);

    }

}
