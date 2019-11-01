package proyecto.pkgfinal;
public class Validador {
    
public Validador(){}

public boolean AtributosCorrectos(String pContraseña, String pEmail)
{
    boolean resultado = true;

        

        if(pContraseña.equals(""))

        {

            resultado = false;

        }

        

        if(!pEmail.contains("@"))

        {

            resultado = false;

        }

       return resultado;
       
}
}
