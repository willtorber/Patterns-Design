package patterns.bussiness.motors;

/**
 * 
 */
public class MotorAdapterDiesel extends Motor {
	
	private MotorDiesel motorDiesel;

    /**
     * Default constructor
     */
    public MotorAdapterDiesel(MotorDiesel motorDiesel) {
    	this.motorDiesel = motorDiesel;
    }

    /**
     * @return
     */
    public MotorDiesel getMotorDiesel() {
        // TODO implement here
        return this.motorDiesel;
    }

    /**
     * @param value
     */
    public void setMotorDiesel(MotorDiesel motor) {
        // TODO implement here
    	this.motorDiesel = motor;
    }
    
    public void iniciarEscape() {
        System.out.println("Iniciando procesos de escape Motor Diesel ");
        this.motorDiesel.abrirValculaDeEscape();
    }

    /**
     * @return string
     */
    public void inyectarCombustible() {
    	motorDiesel.inyectarCombustible();
    }

    public void iniciarComprension() {
    	System.out.println("Iniciando compresion Motor Diesel Adapter");
    	 this.motorDiesel.abrirValculaDeEscape(); 
    	 this.motorDiesel.bajarPiston();
    }

    public void iniciarProcesoCombustion() {
    	System.out.println("Iniciando proceso de combustion Motor Diesel ");
    	this.motorDiesel.iniciarCalentamientoDeAire();
    	this.motorDiesel.subirPiston();
    }

}