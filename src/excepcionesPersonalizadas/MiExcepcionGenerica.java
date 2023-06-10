package excepcionesPersonalizadas;

/**
 *
 * @author Omar Cárdenas
 */
public class MiExcepcionGenerica extends Exception {
    
    private final static String MESSAGE = ""
            + "Esta es una excepcion general no sabemos la causa";
    
    public MiExcepcionGenerica(){
        super(MESSAGE);
    }
    
}
