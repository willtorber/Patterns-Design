package patterns.bussiness.motors;

/**
 * 
 */
public class MotorDiesel extends Motor {
	
    public MotorDiesel(String referencia, String tipo, float capacidad_combustible, int numeros_pistones, float peso,
			int numero_cambios) {
		super(referencia, tipo, capacidad_combustible, numeros_pistones, peso, numero_cambios);
		// TODO Auto-generated constructor stub
	}

	/**
     * 
     */
    protected void abrirValvulaDeAdminision() {
        // TODO implement here
    	System.out.println("Abriendo valvulas de Admision Motor Diesel...");
    }

    /**
     * 
     */
    protected void bajarPiston() {
        // TODO implement here
    	System.out.println("Bajando pistones en Motor Diesel...");
    }

    /**
     * 
     */
    protected void iniciarCalentamientoDeAire() {
        // TODO implement here
    	System.out.println("Iniciando calentamiento Motor Diesel");
    	
    }

    /**
     * 
     */
    protected void subirPiston() {
        // TODO implement here
    	System.out.println("Subiendo pistones en Motor Diesel...");
    }

    /**
     * 
     */
    public void inyectarCombustible() {
        // TODO implement here
    	System.out.println("Inyectando combustible a Motor Diesel...");
    }

    /**
     * 
     */
    protected void abrirValculaDeEscape() {
        // TODO implement here
    	System.out.println("Abriendo valvula de escapeen en Motor Diesel...");
    }

}