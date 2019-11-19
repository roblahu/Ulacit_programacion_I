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

    public boolean InsertarNombre(String nombre) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (nombre == "") {
            return result;
        } else {
            DAL.insertNombre(nombre);
            result = true;
        }
        return result;
    }

    public void DeleteNombre(String nombre) throws SQLException, ClassNotFoundException {
        DAL.DeleteNombre(nombre);
    }
    
     

    public boolean InsertarPrimer_apellido(String primer_apellido) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (primer_apellido == "") {
            return result;
        } else {
            DAL.insertPrimer_apellido(primer_apellido);
            result = true;
        }
        return result;
    }

    public void DeletePrimer_apellido(String primer_apellido) throws SQLException, ClassNotFoundException {
        DAL.DeletePrimer_apellido(primer_apellido);
    }

    public boolean InsertarSegundo_apellido(String segundo_apellido) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (segundo_apellido == "") {
            return result;
        } else {
            DAL.insertSegundo_apellido(segundo_apellido);
            result = true;
        }
        return result;
    }

    public void DeleteSegundo_apellido(String segundo_apellido) throws SQLException, ClassNotFoundException {
        DAL.DeleteSegundo_apellido(segundo_apellido);
    }

    public boolean InsertarCedula(String cedula) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (cedula == "") {
            return result;
        } else {
            DAL.insertCedula(cedula);
            result = true;
        }
        return result;
    }

    public void DeleteCedula(String cedula) throws SQLException, ClassNotFoundException {
        DAL.DeleteCedula(cedula);
    }

    public boolean InsertarFecha_nacimiento(String fecha_nacimiento) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (fecha_nacimiento == "") {
            return result;
        } else {
            DAL.insertFecha_nacimiento(fecha_nacimiento);
            result = true;
        }
        return result;
    }

    public void DeleteFecha_nacimiento(String fecha_nacimiento) throws SQLException, ClassNotFoundException {
        DAL.DeleteFecha_nacimiento(fecha_nacimiento);
    }

    public boolean InsertarTelefono(String telefono) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (telefono == "") {
            return result;
        } else {
            DAL.insertTelefono(telefono);
            result = true;
        }
        return result;
    }

    public void DeleteTelefono(String telefono) throws SQLException, ClassNotFoundException {
        DAL.DeleteTelefono(telefono);
    }

    public boolean InsertarCorreo(String correo) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (correo == "") {
            return result;
        } else {
            DAL.insertCorreo(correo);
            result = true;
        }
        return result;
    }

    public void DeleteCorreo(String correo) throws SQLException, ClassNotFoundException {
        DAL.DeleteCorreo(correo);
    }

    public boolean InsertarNombre_madre(String nombre_madre) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (nombre_madre == "") {
            return result;
        } else {
            DAL.insertNombre_madre(nombre_madre);
            result = true;
        }
        return result;
    }

    public void DeleteNombre_madre(String nombre_madre) throws SQLException, ClassNotFoundException {
        DAL.DeleteNombre_madre(nombre_madre);
    }

    public boolean InsertarPrimer_apellido_madre(String primer_apellido_madre) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (primer_apellido_madre == "") {
            return result;
        } else {
            DAL.insertPrimer_apellido_madre(primer_apellido_madre);
            result = true;
        }
        return result;
    }

    public void DeletePrimer_apellido_madre(String primer_apellido_madre) throws SQLException, ClassNotFoundException {
        DAL.DeletePrimer_apellido_madre(primer_apellido_madre);
    }

    public boolean InsertarSegundo_apellido_madre(String segundo_apellido_madre) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (segundo_apellido_madre == "") {
            return result;
        } else {
            DAL.insertSegundo_apellido_madre(segundo_apellido_madre);
            result = true;
        }
        return result;
    }

    public void DeleteSegundo_apellido_madre(String segundo_apellido_madre) throws SQLException, ClassNotFoundException {
        DAL.DeleteSegundo_apellido_madre(segundo_apellido_madre);
    }

    public boolean InsertarNombre_padre(String nombre_padre) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (nombre_padre == "") {
            return result;
        } else {
            DAL.insertNombre_padre(nombre_padre);
            result = true;
        }
        return result;
    }

    public void DeleteNombre_padre(String nombre_padre) throws SQLException, ClassNotFoundException {
        DAL.DeleteNombre_padre(nombre_padre);
    }

    public boolean InsertarPrimer_apellido_padre(String primer_apellido_padre) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (primer_apellido_padre == "") {
            return result;
        } else {
            DAL.insertPrimer_apellido_padre(primer_apellido_padre);
            result = true;
        }
        return result;
    }

    public void DeletePrimer_apellido_padre(String primer_apellido_padre) throws SQLException, ClassNotFoundException {
        DAL.DeletePrimer_apellido_padre(primer_apellido_padre);
    }

    public boolean InsertarSegundo_apellido_padre(String segundo_apellido_padre) throws SQLException, ClassNotFoundException {
        boolean result = false;
        if (segundo_apellido_padre == "") {
            return result;
        } else {
            DAL.insertSegundo_apellido_padre(segundo_apellido_padre);
            result = true;
        }
        return result;
    }

    public void DeleteSegundo_apellido_padre(String segundo_apellido_padre) throws SQLException, ClassNotFoundException {
        DAL.DeleteSegundo_apellido_padre(segundo_apellido_padre);
    }
    
    
}
