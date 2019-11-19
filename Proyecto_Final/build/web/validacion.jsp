<%-- 
    Document   : validacion
    Created on : Nov 18, 2019, 6:14:22 PM
    Author     : rchavarr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.*" %>
<%@ page import="clases.*"%>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validación</title>
    </head>
    <body>


        <%

    //Datos Estudiante
            String nombre = request.getParameter("nombre");
            String primer_apellido = request.getParameter("primer_apellido");
            String segundo_apellido = request.getParameter("segundo_apellido");
            String cedula = request.getParameter("cedula");
            String fecha_nacimiento = request.getParameter("fecha_nacimiento");
            String telefono = request.getParameter("telefono");
            String correo = request.getParameter("correo");
    //Datos Madre
            String nombre_madre = request.getParameter("nombre_madre");
            String primer_apellido_madre = request.getParameter("primer_apellido_madre");
            String segundo_apellido_madre = request.getParameter("segundo_apellido_madre");
    //Datos Padre
            String nombre_padre = request.getParameter("nombre_padre");
            String primer_apellido_padre = request.getParameter("primer_apellido_padre");
            String segundo_apellido_padre = request.getParameter("segundo_apellido_padre");
    //Datos Grados
            String grado = request.getParameter("grado");
            String primer_grado = request.getParameter("primer_grado");
            String segundo_grado = request.getParameter("segundo_grado");
            String tercer_grado = request.getParameter("tercer_grado");
            String cuarto_grado = request.getParameter("cuarto_grado");
            String quinto_grado = request.getParameter("quinto_grado");
            String sexto_grado = request.getParameter("sexto_grado");
    //Datos materias
            String espanol = request.getParameter("espanol");
            String ciencias = request.getParameter("ciencias");
            String ingles = request.getParameter("ingles");
            String matematicas = request.getParameter("matematicas");
            String civica = request.getParameter("civica");
            String estudios_sociales = request.getParameter("estudios_sociales");
        %>


        <!-- Despues de obtener los datos hay que validarlos-->

        <%if (nombre.isEmpty() || primer_apellido.isEmpty() || segundo_apellido.isEmpty() || cedula.isEmpty() || fecha_nacimiento.isEmpty() || telefono.isEmpty() || correo.isEmpty() || nombre_madre.isEmpty() || primer_apellido_madre.isEmpty() || segundo_apellido_madre.isEmpty() || nombre_padre.isEmpty() || primer_apellido_padre.isEmpty() || segundo_apellido_padre.isEmpty()) {

                out.println("Por favor ingrese todos los datos");

        %>
        <br><a href="matricula.html">Regresar al Formulario</a>
        <%    } else {
        %>      

        <!-- Despues de validar los datos se envian a la base de datos-->
        <%
            {

                try {

                    BLL_Estudiantes bll_estudiantes = new BLL_Estudiantes();
                    boolean result = bll_estudiantes.InsertarNombre(nombre);
                  

                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }

        %>
        <!---->
        <!-- Despues de enviar los datos a la DB se le manda al usuario la confirmacion de los datos-->

        <h2>Datos Validados!</h2>


        <%    if (nombre != null && nombre != "") {
                out.println("Bienvenido, " + nombre + " " + primer_apellido + " " + segundo_apellido);
            }
        %>
        <br>
        <h3>Datos del Estudiante</h3>
        <%
            if (cedula != null && cedula != "") {
                out.println("Cedula:  " + cedula);
            }
        %>
        <br>
        <%
            if (fecha_nacimiento != null && fecha_nacimiento != "") {
                out.println("Fecha de Nacimiento:  " + fecha_nacimiento);
            }
        %>
        <br>
        <%
            if (telefono != null && telefono != "") {
                out.println("Telefono:  " + telefono);
            }
        %>
        <br>
        <%
            if (correo != null && correo != "") {
                out.println("Correo  " + correo);
            }
        %>
        <br>
        <h3>Datos de la Madre</h3>
        <%
            if (nombre_madre != null && nombre_madre != "") {
                out.println("Nombre Completo:  " + nombre_madre + " " + primer_apellido_madre + " " + segundo_apellido_madre);
            }
        %>
        <br>
        <h3>Datos del Padre</h3>
        <%
            if (nombre_padre != null && nombre_padre != "") {
                out.println("Nombre Completo:  " + nombre_padre + " " + primer_apellido_padre + " " + segundo_apellido_padre);
            }
        %>
        <br>
        <h3>Grado a Cursar</h3>
        <%
            if (grado != null && grado != "") {
                out.println(grado);
            }
        %>
        <br>
        <h3>Materias Seleccionadas</h3>
        <%
            if (espanol != null && espanol != "") {
                out.println("Español");
            }
        %>
        <br>
        <%
            if (ciencias != null && ciencias != "") {
                out.println("Ciencias");
            }
        %>
        <br>
        <%
            if (ingles != null && ingles != "") {
                out.println("Ingles");
            }
        %>
        <br>
        <%
            if (matematicas != null && matematicas != "") {
                out.println("Matemáticas");
            }
        %>
        <br>
        <%
            if (civica != null && civica != "") {
                out.println("Cívica");
            }
        %>
        <br>
        <%
            if (estudios_sociales != null && estudios_sociales != "") {
                out.println("Estudios Sociales");
            }
        %>
        <br>
        <%
            }
        %>

    </body>
</html>   
