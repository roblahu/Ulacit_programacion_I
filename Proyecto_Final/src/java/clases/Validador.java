/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;
import java.util.regex.*;
import java.lang.String;

/**
 *
 * @author rchavarr
 */
public class Validador {
    public Validador(){
        //
    }
    public boolean AtributosCorrectos(String pEmail){/*,String pContrasena){*/
        boolean resultado = true;
        /*
        if(pContrasena.isEmpty()|| pContrasena.length() < 4)
        {
            resultado = false;
        }*/
        
        if(!pEmail.contains("@"))
        {
            resultado = false;
        }
        return resultado;
        //
    }
    public boolean EsJoven(String pFecha){
        String[] fecha = pFecha.split("-");
        boolean resultado = false;
        String[] FechaDeHoy = {"2019","11","19"};
        if(fecha.length == 3 ){
            int nacimiento = Integer.parseInt(FechaDeHoy[0]);
            int hoy = Integer.parseInt(fecha[0]);
            if(Math.abs(hoy - nacimiento) < 18 && Math.abs(hoy - nacimiento) > 12){
                resultado = true;
            }
        }
        //
        return resultado;
    }
    public boolean EsCedula(String pCedula){
        boolean resultado = false;
        //boolean lengthTrue = pCedula.length() > 6;
        Pattern regex = Pattern.compile("[0-9a-zA-Z]{8,10}");
        Matcher matcher = regex.matcher(pCedula);
        //if(matcher.find() && lengthTrue){
        if(matcher.find()){
            resultado = true;
        }
        return resultado;
//        return Pattern.matches("[0-9]", pCedula) && pCedula.length() > 6;  
    }
    public boolean EsTelefono(String pTelefono){
        boolean resultado = false;
       // boolean lengthTrue = pTelefono.length() == 8;
        Pattern regex = Pattern.compile("[0-9]{8}");
        Matcher matcher = regex.matcher(pTelefono);
        if(matcher.find()){
            resultado = true;
        }
        return resultado;
        
//        return Pattern.matches("[0-9]{8}", pNumero);
    }
}