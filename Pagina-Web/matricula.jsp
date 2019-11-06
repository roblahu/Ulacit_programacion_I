<!DOCTYPE html>
<html lang="en">
<head>
  <title>Matricula de Estudiantes</title>
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
        
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Nuevos ingresos <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="matricula.jsp">Matricular Estudiante</a></li>
          </ul>
        </li>
   
      </ul>
      <ul class="nav navbar-nav">
       
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Estudiantes Existentes <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="estudiantes.jsp">Buscar Estudiantes</a></li>
            <li><a href="horarios.jsp">Ver Horarios</a></li>
            <li><a href="pagos.jsp">Realizar Pagos</a></li>
            <li><a href="materias.jsp">Selección de Materias</a></li>
            <li><a href="profesores.jsp">Profesores</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </nav>

  <div class="container">
    <h3>Proyecto Final Programacion I</h3>
  </div>

  <center><h2 style="color: #00AEEF">Ingrese datos del Estudiante</h2></center>
  <body>

    <center>
      <div class="container">
        <div class="row">

          <div class="col-sm-12" style="background-color:#CECECE;">
            <form id="miForm" action="/validacion.jsp" method="post">
              <table>
                <tr>
                  <td>
                    Nombre
                  </td>
                  <td>
                    <input type="text" id="nombre" />
                  </td>
                  <td>
                    Primer Apellido 
                  </td>
                  <td>
                    <input type="text" id="primer_apellido" />
                  </td>
                  <td>
                    Segundo Apellido
                  </td>
                  <td>
                    <input type="text" id="segundo_apellido" />
                  </td>
                </tr>
                <tr>
                  <td>
                    Cédula
                  </td>
                  <td>
                    <input type="text" id="cedula" id="cedula"/> 
                  </td>
                </tr>
                <tr>
                  <td>
                    Fecha de Nacimiento
                  </td>
                  <td>
                    <input type="date" id="fecha_nacimiento" id="fecha_nacimiento"/> 
                  </td>
                </tr>
                <tr>
                  <td>
                    Teléfono: (506) 
                  </td>
                  <td>
                    <input type="text" id="telefono" />
                  </td>
                </tr>
                <tr>
                  <td>
                    Correo Electrónico 
                  </td>
                  <td>
                    <input type="email" id="correo" placeholder="Ingrese su correo"/> 
                  </td>
                </tr>
                <tr>
                  <td>
                    Nombre Madre
                  </td>
                  <td>
                    <input type="text" id="primer_apellido" />
                  </td>
                  <td>
                    Primer Apellido 
                  </td>
                  <td>
                    <input type="text" id="primer_apellido" />
                  </td>
                  <td>
                    Segundo Apellido
                  </td>
                  <td>
                    <input type="text" id="segundo_apellido" />
                  </td>
                </tr>
                <tr>
                  <td>
                    Nombre Padre
                  </td>
                  <td>
                    <input type="text" id="segundo_apellido" />
                  </td>
                  <td>
                    Primer Apellido 
                  </td>
                  <td>
                    <input type="text" id="primer_apellido" />
                  </td>
                  <td>
                    Segundo Apellido
                  </td>
                  <td>
                    <input type="text" id="segundo_apellido" />
                  </td>
                </tr>
                
                <tr>
                  <td>
                    <input type="submit" value="Enviar" />
                  </td>
                  <td>
                    <input type="reset" value="Borrar" />
                  </td>
                </tr>
              </table>
            </form>
          </div>

        </div>

      </center>

</body>
</html>
