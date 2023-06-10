package excepciones;

import excepcionesPersonalizadas.MiExcepcionGenerica;
import excepcionesPersonalizadas.MiExcepcionNumerica;

/**
 *
 * @author Omar Cárdenas
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MiExcepcionGenerica {
        
        try{
            String valorNumerico = "16ñ";
        int numero = Utilitario.convertir(valorNumerico);
        System.out.println("El numero es: " + numero);
        
        }catch(MiExcepcionNumerica e) {
            
            System.err.println(e.getMessage());
            
        }catch(MiExcepcionGenerica e) {
            
            System.err.println(e.getMessage());
        }
    }  
}
