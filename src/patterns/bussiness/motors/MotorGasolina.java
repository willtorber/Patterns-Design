package patterns.bussiness.motors;

/**
 * 
 */
public class MotorGasolina extends Motor {
    
    public MotorGasolina(String referencia, String tipo, float capacidad_combustible, int numeros_pistones, float peso,
			int numero_cambios) {
		super(referencia, tipo, capacidad_combustible, numeros_pistones, peso, numero_cambios); 
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