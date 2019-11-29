/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.SQLException;

public class BLL_Estudiantes {

    DAL_Estudiantes DAL = new DAL_Estudiantes();

    public BLL_Estudiantes() {
    }

    public boolean InsertarEstudiante(
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
            String segundo_apellido_padre
    ) throws SQLException, ClassNotFoundException {
        boolean resultado = false;
        if (nombre == "") {
            return resultado;
        } else {
            DAL.insertEstudiante(
                    nombre, 
                    primer_apellido,
                    segundo_apellido,
                    cedula,
                    fecha_nacimiento,
                    telefono,
                    correo,
                    nombre_madre,
                    primer_apellido_madre,
                    segundo_apellido_madre,
                    nombre_padre,
                    primer_apellido_padre,
                    segundo_apellido_padre);
            resultado = true;
        }
        return resultado;
    }

    // sys config --- color - fecha
    }
    

