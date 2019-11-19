package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import clases.*;

public final class validacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Validación</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");


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
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Despues de obtener los datos hay que validarlos-->\n");
      out.write("\n");
      out.write("        ");
if (nombre.isEmpty() || primer_apellido.isEmpty() || segundo_apellido.isEmpty() || cedula.isEmpty() || fecha_nacimiento.isEmpty() || telefono.isEmpty() || correo.isEmpty() || nombre_madre.isEmpty() || primer_apellido_madre.isEmpty() || segundo_apellido_madre.isEmpty() || nombre_padre.isEmpty() || primer_apellido_padre.isEmpty() || segundo_apellido_padre.isEmpty()) {

                out.println("Por favor ingrese todos los datos");

        
      out.write("\n");
      out.write("        <br><a href=\"matricula.html\">Regresar al Formulario</a>\n");
      out.write("        ");
    } else {
        
      out.write("      \n");
      out.write("\n");
      out.write("        <!-- Despues de validar los datos se envian a la base de datos-->\n");
      out.write("        ");

            {

                try {

                    BLL_Estudiantes bll_estudiantes = new BLL_Estudiantes();
                    boolean result = bll_estudiantes.InsertarEstudiantes(nombre);

                } catch (Exception e) {
                    throw new IllegalStateException("Cannot connect the database!", e);
                }
            }

        
      out.write("\n");
      out.write("        <!---->\n");
      out.write("        <!-- Despues de enviar los datos a la DB se le manda al usuario la confirmacion de los datos-->\n");
      out.write("\n");
      out.write("        <h2>Datos Validados!</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
    if (nombre != null && nombre != "") {
                out.println("Bienvenido, " + nombre + " " + primer_apellido + " " + segundo_apellido);
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <h3>Datos del Estudiante</h3>\n");
      out.write("        ");

            if (cedula != null && cedula != "") {
                out.println("Cedula:  " + cedula);
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            if (fecha_nacimiento != null && fecha_nacimiento != "") {
                out.println("Fecha de Nacimiento:  " + fecha_nacimiento);
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            if (telefono != null && telefono != "") {
                out.println("Telefono:  " + telefono);
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            if (correo != null && correo != "") {
                out.println("Correo  " + correo);
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <h3>Datos de la Madre</h3>\n");
      out.write("        ");

            if (nombre_madre != null && nombre_madre != "") {
                out.println("Nombre Completo:  " + nombre_madre + " " + primer_apellido_madre + " " + segundo_apellido_madre);
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <h3>Datos del Padre</h3>\n");
      out.write("        ");

            if (nombre_padre != null && nombre_padre != "") {
                out.println("Nombre Completo:  " + nombre_padre + " " + primer_apellido_padre + " " + segundo_apellido_padre);
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <h3>Grado a Cursar</h3>\n");
      out.write("        ");

            if (grado != null && grado != "") {
                out.println(grado);
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <h3>Materias Seleccionadas</h3>\n");
      out.write("        ");

            if (espanol != null && espanol != "") {
                out.println("Español");
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            if (ciencias != null && ciencias != "") {
                out.println("Ciencias");
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            if (ingles != null && ingles != "") {
                out.println("Ingles");
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            if (matematicas != null && matematicas != "") {
                out.println("Matemáticas");
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            if (civica != null && civica != "") {
                out.println("Cívica");
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            if (estudios_sociales != null && estudios_sociales != "") {
                out.println("Estudios Sociales");
            }
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>   \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
