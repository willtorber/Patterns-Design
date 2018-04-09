package patterns.bussiness.vehicles;

import patterns.bussiness.motors.interfaces.IMotor;

/**
 * 
 */
public class VehiculoUrbano extends Vehiculo {

	/**
     * 
     */
    private float capacidad_maletero;
	
	/**
     * Default constructor
     */
    public VehiculoUrbano() {
    
    }
    
    
    public VehiculoUrbano(String placa, String tipo, IMotor motor, String color, float capacidad_maletero) {
		super(placa, tipo, motor, color);
		this.capacidad_maletero = capacidad_maletero;
	}
    
    /**
     * @return
     */
    public float getCapacidad_maletero() {
        // TODO implement here
        return this.capacidad_maletero;
    }

    /**
     * @param value
     */
    public void setCapacidad_maletero(float value) {
        // TODO implement here
    	this.capacidad_maletero = value;
    }

}