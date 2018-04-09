package patterns.bussiness.vehicles;

import java.util.*;

import patterns.bussiness.motors.interfaces.IMotor;
import patterns.bussiness.tests.Prueba;

/**
 * 
 */
public class Vehiculo{

    /**
     * Default constructor
     */
    public Vehiculo() {
    }

    /**
     * 
     */
    private String placa;

    /**
     * 
     */
    private String tipo;

    /**
     * 
     */
    private IMotor motor;
    
    /**
     * 
     */
    private String color;


    /**
     * @return
     */
    public String getPlaca() {
        // TODO implement here
        return null;
    }
    
    /**
     * @return
     */
    public void setPlaca(String placa) {
        // TODO implement here
        this.placa = placa;
    }

    /**
     * @return
     */
    public String getTipo() {
        // TODO implement here
        return this.tipo;
    }

    /**
     * @param value
     */
    public void setTipo(String tipo) {
        // TODO implement here
    	this.tipo = tipo;
    }

    /**
     * @return
     */
    public IMotor getMotor() {
        // TODO implement here
        return null;
    }
    
    /**
     * @param value
     */
	public void setMotor(IMotor motor) {
        // TODO implement here
    	this.motor = motor;
    }
    
    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

    /**
     * @param placa 
     * @param tipo 
     * @param motor
     */
    public void registrarVehiculo(String placa, String tipo, IMotor motor) {
        // TODO implement here
    	this.placa = placa;
    	this.tipo = tipo;
    	this.motor = motor;
        System.out.println("Registro del vehiculo completo");
    }

    /**
     * @return
     */
    public ArrayList<Vehiculo> listarVehiculos() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean cargarVehiculos() {
        // TODO implement here
        return false;
    }

    /**
     * 
     */
    public void encender() {
        // TODO implement here
    }

    /**
     * 
     */
    public void acelerar() {
        // TODO implement here
    }

    /**
     * 
     */
    public void frenar() {
        // TODO implement here
    }

    /**
     * 
     */
    public void cambiarVelocidad() {
        // TODO implement here
    }

    /**
     * 
     */
    public void apagar() {
        // TODO implement here
    }

	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", tipo=" + tipo + ", motor=" + motor + ", color=" + color + "]";
	}

	

}