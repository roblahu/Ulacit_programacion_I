package prueba;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rchavarr
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DAL_Persona {
   
     
    private String url = "jdbc:mysql://localhost:8889/testdb?zeroDateTimeBehavior=convertToNull";
    private String username = "root";
    private String password = "root";
    private Connection connection = null;
    
     public DAL_Persona(){}
    
     public void insertPersona(String nombre) throws SQLException
    {
        connection =  DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("insert into Persona(Nombre) "
                + "values ('" + nombre + "')",0);
            
    }
     
    public void DeletePersona(String nombre) throws SQLException
    {
        connection =  DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        stmt.execute("DELETE FROM persona where Nombre = '" + nombre + "'",0);
            
    }
}
