package proyecto.pkgfinal;
public class Usuario extends Persona {
    
private int numUsuario = 0;
private String Usuario = "";
private String Contraseña = "";

    public Usuario(String pNombre, String pApellido, String pFechaNac, int pCedula, String pEmail, int pnumUsuario, String pUsuario, String pContraseña) {
        super(pNombre, pApellido, pFechaNac, pCedula, pEmail);
        this.numUsuario = pnumUsuario;
        this.Usuario = pUsuario;
        this.Contraseña = pContraseña;
    }

    public int getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(int numUsuario) {
        this.numUsuario = numUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
     
}
