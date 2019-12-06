<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"


    <%@ page import="java.sql.*" %>
    <%@ page import="java.io.*" %> 

    <html>  
<head>
    <title>Estudiantes</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="index.html">Programacion I</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Nuevos Estudiantes<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="matricula.html">Matricular Estudiante</a></li>
                </ul>
            </li>
        </ul>
        <ul class="nav navbar-nav">    
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Estudiantes Actuales <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="estudiantes.jsp">Información de Estudiantes</a></li>
                    <li><a href="pagos.html">Realizar Pagos</a></li>
                </ul>
            </li>
        </ul>
    </div>
</nav>

<h2 align="center">Base de datos Estudiantes</h2>
<%
    
    String cedula = request.getParameter("cedula");
    try {
        /* Create string of connection url within specified format with machine name, port number and database name. Here machine name id localhost and database name is student. */
        String connectionURL = "jdbc:mysql://localhost:8889/matricula?zeroDateTimeBehavior=convertToNull";

        // declare a connection by using Connection interface
        Connection connection = null;

        // declare object of Statement interface that is used for executing sql statements.
        Statement statement = null;

        // declare a resultset that uses as a table for output data from tha table.
        ResultSet rs = null;

        // Load JBBC driver "com.mysql.jdbc.Driver"
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        /* Create a connection by using getConnection() method that takes parameters of string type connection url, user name and password to connect to database. */
        connection = DriverManager.getConnection(connectionURL, "root", "root");

        /* createStatement() is used for create statement object that is used for sending sql statements
to the specified database. */
        statement = connection.createStatement();
        // sql query to retrieve values from the secified table.
        String QueryString = "SELECT * from estudiantes where cedula='"+cedula+"' order by cedula";
        rs = statement.executeQuery(QueryString);
%>
<TABLE cellpadding="15" border="1" style="background-color: #ffffcc;" align="center">
    
    <TR>
        <th>Nombre</th>
        <th>Primer Apellido</th>
        <th>Segundo Apellido</th>
        <th>Cedula</th>
        <th>Fecha de Nacimiento</th>
        <th>Telefono</th>
        <th>Correo</th>
        <th>Nombre Madre</th>
        <th>Primer Apellido Madre</th>
        <th>Segundo Apellido Madre</th>
        <th>Nombre Padre</th>
        <th>Primer Apellido Padre</th>
        <th>Segundo Apellido Padre</th>
        <th>Grado</th>
    </TR>
    <%
        while (rs.next()) {
    %>
    
    <TR>
        <TD><%=rs.getString(1)%></TD>      
        <TD><%=rs.getString(2)%></TD>       
        <TD><%=rs.getString(3)%></TD>        
        <TD><%=rs.getString(4)%></TD>        
        <TD><%=rs.getString(5)%></TD>        
        <TD><%=rs.getString(6)%></TD>        
        <TD><%=rs.getString(7)%></TD>        
        <TD><%=rs.getString(8)%></TD>        
        <TD><%=rs.getString(9)%></TD>       
        <TD><%=rs.getString(10)%></TD>       
        <TD><%=rs.getString(11)%></TD>        
        <TD><%=rs.getString(12)%></TD>        
        <TD><%=rs.getString(13)%></TD>      
        <TD><%=rs.getString(14)%></TD>

    </TR>



    <%   }    %>
    <%
            // close all the connections.
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            throw new IllegalStateException(e);

        }
    %>


</TABLE>
</body>
</html>