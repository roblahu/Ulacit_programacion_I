<%-- 
    Document   : validacion
    Created on : Nov 10, 2019, 10:30:35 AM
    Author     : rchavarr
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
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
<h2>Datos Obtenidos</h2>


<%
if(nombre != null && nombre != "")
{ 
out.println("Bienvenido, "+nombre + " " + primer_apellido + " " + segundo_apellido);
}
%>
<br>
<h3>Datos del Estudiante</h3>
<%
if(cedula != null && cedula != "")
{ 
out.println("Cedula:  " + cedula);
}
%>
<br>
<%
if(fecha_nacimiento != null && fecha_nacimiento != "")
{ 
out.println("Fecha de Nacimiento:  " + fecha_nacimiento);
}
%>
<br>
<%
if(telefono != null && telefono != "")
{ 
out.println("Telefono:  " + telefono);
}
%>
<br>
<%
if(correo != null && correo != "")
{ 
out.println("Correo  " + correo);
}
%>
<br>
<h3>Datos de la Madre</h3>
<%
if(nombre_madre != null && nombre_madre != "")
{ 
out.println("Nombre Completo:  " + nombre_madre + " " + primer_apellido_madre + " " + segundo_apellido_madre);
}
%>
<br>
<h3>Datos del Padre</h3>
<%
if(nombre_padre != null && nombre_padre != "")
{ 
out.println("Nombre Completo:  " + nombre_padre + " " + primer_apellido_padre + " " + segundo_apellido_padre);
}
%>
<br>
<h3>Grado a Cursar</h3>
<%
    if(grado != null && grado != "")
{ 
out.println(grado);
}
%>
<br>
<h3>Materias Seleccionadas</h3>
<%
if(espanol != null && espanol != "")
{ 
out.println("Español");
}
%>
<br>
<%
if(ciencias != null && ciencias != "")
{ 
out.println("Ciencias");
}
%>
<br>
<%
if(ingles != null && ingles != "")
{ 
out.println("Ingles");
}
%>
<br>
<%
if(matematicas != null && matematicas != "")
{ 
out.println("Matemáticas");
}
%>
<br>
<%
if(civica != null && civica != "")
{ 
out.println("Cívica");
}
%>
<br>
<%
if(estudios_sociales != null && estudios_sociales != "")
{ 
out.println("Estudios Sociales");
}
%>
<br>




<%%>
        
    </body>
</html>
