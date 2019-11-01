package proyecto.pkgfinal;

import java.util.*;

public class ProyectoFinal {

    public static void main(String[] args) {
        Scanner matricula = new Scanner(System.in);
        // Variables Alumno
        String nombre;
        String apellido;
        String cedula;
        String padre;
        String madre;
        String fechanac;
        
        //Variables Navegacion
        int entradaMenu = 0;
        int navMenu = 0;
        int navMateria = 0;
        int selMateria = 0;
        String inputCedula;
        
        System.out.println("Bienvenido al Sistema de la Escuela Los Patitos");
        System.out.println("---------------------------------");
        System.out.println("Seleccione del siguiente menu:");
        System.out.println("1 - Matrícula de nuevo estudiante");
        System.out.println("2 - Selección de materias estudiantes existentes");
        System.out.println("3 - Ver horario");
        System.out.println("4 - Realizar pagos");
        entradaMenu = matricula.nextInt();
        
        switch (entradaMenu) {
        case 1: 
            System.out.println("----------------Matrícula de Alumnos Nuevos----------------");
            System.out.println("A continuacion ingrese los datos del Alumno");
            System.out.println("Nombre: ");
            nombre = matricula.nextLine();
            System.out.println("Apellido: ");
            apellido = matricula.nextLine();
            System.out.println("Cédula: ");
            cedula = matricula.nextLine();
            System.out.println("Fecha de nacimiento: ");
            fechanac = matricula.nextLine();
            System.out.println("Nombre completo del padre: ");
            padre = matricula.nextLine();
            System.out.println("Nombre completo de la madre: ");
            madre = matricula.nextLine();
            System.out.println("---- "+nombre+" ha sido matriculado exitosamente! ----");
            System.out.println("    Digite 0 para salir");
            System.out.println("    Digite 1 para volver al menu principal");
            navMenu = matricula.nextInt();
            // Agregar navegacion de vuelta al menu con IF y valor de navMenu???
        break;
        
        case 2:
            System.out.println("----------------Selección de Materias----------------");
            System.out.println("A continuacion ingrese los datos del Alumno");
            System.out.println("Cédula: ");
            inputCedula = matricula.nextLine();
            // IF inputCedula == algun valor de cedula then continuar???
            
            //Despues de verificar:
            System.out.println("- Seleccione 1 si es una materia obligatoria");
            System.out.println("- Seleccione 2 si es una materia electiva");
            navMateria = matricula.nextInt();
            if (navMateria == 1) {
                System.out.println("Las opciones de materias obligatorias son:");
                System.out.println("10101 - Biología");
                System.out.println("10201 - Física");
                System.out.println("10301 - Química");
                System.out.println("Ingrese el código de la materia a elegir:");
                selMateria = matricula.nextInt();
                // agregar opcion de navegacion para volver al menu principal
            }
            if (navMateria == 2) {
                System.out.println("Las opciones de materias electivas son:");
                System.out.println("30101 - Artes");
                System.out.println("30201 - Bailes");
                System.out.println("30301 - Música");
                System.out.println("Ingrese el código de la materia a elegir:");
                selMateria = matricula.nextInt();
                // agregar opcion de navegacion para v  nolver al menu principal
            }
            else {
                System.out.println("Opción inválida");
                // devolver a las dos opciones del IF
            }
        break;
        
        case 3:
            System.out.println("El horario es:");
        break;
        
        case 4:
            System.out.println("Es hora de pagar");
        break;
    }
        
    }
    
}
