package prueba;


import java.sql.SQLException;

public class BLL_Persona {
    
    DAL_Persona DAL = new DAL_Persona();
    
    public BLL_Persona(){}
    
    
    public boolean InsertarPersona(String nombre) throws SQLException
    {
        boolean result = false;
        if(nombre == "")
        {
            return result;
        }
        else
        {
            DAL.insertPersona(nombre);
            result = true;
        }
        return result;
    }
    
    public void DeletePersona(String nombre) throws SQLException
    {
         DAL.DeletePersona(nombre);
    }
}
