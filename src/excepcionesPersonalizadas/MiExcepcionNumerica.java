package excepcionesPersonalizadas;

/**
 *
 * @author Omar Cárdenas
 */
public class MiExcepcionNumerica extends Exception{
    
    private final static String Mensaje = ""
            + "Error de conversion numerica, "
            + "Ingresa un texto que contenga un numero ";

    public MiExcepcionNumerica() {
        super(Mensaje);
    }
    
    
}
