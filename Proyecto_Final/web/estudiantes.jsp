<!DOCTYPE html


    <%@ page import="java.sql.*" %>
    <%@ page import="java.io.*" %>�

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Estudiantes</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.0/css/bulma.min.css">
<script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js"></script>
<style>
      .bg-img{
        background-image: url("https://i.ytimg.com/vi/BZDyr2OpWBU/maxresdefault.jpg");
        background-position: center; /* Center the image */
        background-repeat: no-repeat; /* Do not repeat the image */
        background-size: cover; /* Resize the background image to cover the entire container */
      }
    html,body{
      width: 100%;
      height: 100%;
      padding: 0;
      margin: 0;
    }
    .x-hero{
            height: 92.8% !important;
        }
.center{
display: flex;
justify-content:center;
align-items: center;
}
.x-white{
	color: white;
}
.x-notif{
	background-color: transparent;
}
.x-table{
    border-radius: 0.5em;
}
</style>
</head>
<body>
<nav class="navbar is-primary">
<div class="container">
<div class="navbar-brand">
<a class="navbar-item" href="index.html">Secundaria ABC</a>
<a id="navbar-burger" role="button" class="navbar-burger" aria-label="menu" aria-expanded="false">
<span aria-hidden="true"></span>
<span aria-hidden="true"></span>
<span aria-hidden="true"></span>
</a>
</div>
<div class="navbar-menu">
<div class="navbar-start">
<div class="navbar-item has-dropdown">
<a class="navbar-link">Nuevos Estudiantes</a>
<div class="navbar-dropdown custom-list">
<a class="navbar-item is-hidden" href="matricula.html">Matricula</a>
</div>
</div>
<div class="navbar-item has-dropdown">
<a class="navbar-link">Estudiantes Regulares</a>
<div class="navbar-dropdown custom-list">
<a class="navbar-item is-hidden" href="informacion.html">Informacion de estudiantes</a>
<a class="navbar-item is-hidden" href="pagos.html">Pagos</a>
</div>
</div>
</div>
</div>
</div>
</nav>
<section class="hero bg-img is-primary x-hero">
<div class="container">
    <br>
    <br>
    <br>
<div class="level center">
<div class="level-left">
<h2 class="title">Base de datos estudiantes</h2>
</div>
</div>
<%
    try {
        /* Create string of connection url within specified format with machine name, port number and database name. Here machine name id localhost and database name is student. */
        String connectionURL = "jdbc:mysql://localhost:8889/matricula?zeroDateTimeBehavior=convertToNull";

        // declare a connection by using Connection interface
        Connection connection = null;

        // declare object of Statement interface that is used for executing sql statements.
        Statement statement = null;

        // declare a resultset that uses as a table for output data from tha table.
        ResultSet rs = null;

        //�Load JBBC driver "com.mysql.jdbc.Driver"
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        /* Create a connection by using getConnection() method that takes parameters of string type connection url, user name and password to connect to database. */
        connection = DriverManager.getConnection(connectionURL, "root", "root");

        /* createStatement() is used for create statement object that is used for sending sql statements
to the specified database. */
        statement = connection.createStatement();

        // sql query to retrieve values from the secified table.
        String QueryString = "SELECT * from estudiantes";
        rs = statement.executeQuery(QueryString);
%>
<br>
<br>
<!-- ************************************************************* -->
<div class="level">
<div class="container">
    <div class="table-container x-table">
      <table class="table is-bordered is-hoverable">
        <tr>
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
        </tr>
        <%
            while (rs.next()) {
        %>
        
        <tr>
            <td><%=rs.getString(1)%></td>      
            <td><%=rs.getString(2)%></td>       
            <td><%=rs.getString(3)%></td>        
            <td><%=rs.getString(4)%></td>        
            <td><%=rs.getString(5)%></td>        
            <td><%=rs.getString(6)%></td>        
            <td><%=rs.getString(7)%></td>        
            <td><%=rs.getString(8)%></td>        
            <td><%=rs.getString(9)%></td>       
            <td><%=rs.getString(10)%></td>       
            <td><%=rs.getString(11)%></td>        
            <td><%=rs.getString(12)%></td>        
            <td><%=rs.getString(13)%></td>      
            <td><%=rs.getString(14)%></td>
    
        </tr>
    
    
    
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
      </table>
    </div>
</div>

</div>

</div>
</div>
<!-- ************************************************************* -->
</section>
</body>
<script>
(function(){
var buttons = document.getElementsByClassName('has-dropdown');
for(let i = 0; i < buttons.length;i++){
buttons[i].addEventListener('click',function(){
buttons[i].classList.toggle('is-active');
//
var b2 = buttons[i].getElementsByClassName('navbar-item'); 
for(let j = 0; j < b2.length;j++){
if(b2[j].nodeType === 1){
b2[j].classList.toggle('is-hidden');
}
}
//
});
}
//
var navbarBurger = document.getElementById('navbar-burger');
var navbarMenu = document.getElementsByClassName('navbar-menu')[0];
navbarBurger.addEventListener('click',function(e){
navbarBurger.classList.toggle('is-active');
navbarMenu.classList.toggle('is-active');
});
})();
</script>
</html>