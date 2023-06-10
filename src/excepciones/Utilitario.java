package excepciones;

import excepcionesPersonalizadas.MiExcepcionGenerica;
import excepcionesPersonalizadas.MiExcepcionNumerica;

/**
 *
 * @author Omar Cárdenas
 */
public class Utilitario {
    /**
     * Esta funcion permite convertir un texto en numero y controlar
     * los errores que se pueden presentar a partir de ello
     * 
     * @param numeroEnTexto numero a convertir
     * @return  devuelve un valor de tipo entero
     */
    public static int convertir(String numeroEnTexto) 
            throws MiExcepcionNumerica, MiExcepcionGenerica{
        try{
            return Integer.parseInt(numeroEnTexto);
        }catch(NumberFormatException s){    
            throw new MiExcepcionNumerica();
        }catch (Exception ex){
            throw new MiExcepcionGenerica();
        }finally{
            return 0;
        }
    }
}
