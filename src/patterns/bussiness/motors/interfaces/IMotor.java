package patterns.bussiness.motors.interfaces;

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
    
    
    public String getReferencia();

	
    public String getTipo();

	
    public float getCapacidad_combustible();

	
    public int getNumeros_pistones();

	
    public float getPeso();

	
    public int getNumero_cambios();

}