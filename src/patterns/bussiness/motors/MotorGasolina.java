package patterns.bussiness.motors;

/**
 * 
 */
public class MotorGasolina extends Motor {

    /**
     * Default constructor
     */
    public MotorGasolina() {
    }
    
    public void iniciarEscape() {
        System.out.println("Inciando escape de Motor Gasolina...");
    }
    
    public void inyectarCombustible() {
        System.out.println("Inyectando Combustible...");
    }
	
    public void iniciarComprension() {
        System.out.println("Iniciando compresion...");
    }
    
	public void iniciarProcesoCombustion() {
        System.out.println("Iniciando proceso de combustion...");
    }

}