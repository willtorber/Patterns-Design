package patterns.bussiness.motors.interfaces;

import java.util.*;

/**
 * 
 */
public interface IMotor {


    /**
     * 
     */
    public void inyectarCombustible();

    /**
     * 
     */
    public void iniciarComprension();

    /**
     * 
     */
    public void iniciarProcesoCombustion();

    /**
     * 
     */
    public void iniciarEscape();

}