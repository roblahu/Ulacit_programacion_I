package proyecto.pkgfinal;
public class Persona {

private String Nombre = "";
private String Apellido = "";
private String FechaNac = "";
private int Cedula = 0;
private String Email = "";

public Persona(String pNombre, String pApellido, String pFechaNac, int pCedula, String pEmail)
{
this.Nombre = pNombre;
this.Apellido = pApellido;
this.FechaNac = pFechaNac;
this.Cedula = pCedula;
this.Email = pEmail;
}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    
}
