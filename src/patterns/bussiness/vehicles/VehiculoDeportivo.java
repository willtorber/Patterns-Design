package patterns.bussiness.vehicles;

import patterns.bussiness.motors.interfaces.IMotor;

/**
 * 
 */
public class VehiculoDeportivo extends Vehiculo{


    /**
     * 
     */
    private boolean sadf;
	
    
    /**
     * Default constructor
     */
    public VehiculoDeportivo() {
    
    }
        
    public VehiculoDeportivo(String placa, String tipo, IMotor motor, String color, boolean sadf) {
		super(placa, tipo, motor, color);
		this.sadf = sadf;
	}    

	/**
     * @return
     */
    public boolean getSadf() {
        // TODO implement here
        return this.sadf;
    }

    /**
     * @param value
     */
    public void setSadf(boolean value) {        
    	this.sadf = value;
    }

}