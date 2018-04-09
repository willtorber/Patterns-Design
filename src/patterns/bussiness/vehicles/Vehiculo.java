package patterns.bussiness.vehicles;

import java.util.*;

import patterns.bussiness.motors.interfaces.IMotor;

/**
 * 
 */
public class Vehiculo{

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
    
    
    public Vehiculo(String placa, String tipo, IMotor motor, String color) {
		super();
		this.placa = placa;
		this.tipo = tipo;
		this.motor = motor;
		this.color = color;
	}
    
    
    public Vehiculo() {
    	
    }
    
    
    public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public IMotor getMotor() {
		return motor;
	}


	public void setMotor(IMotor motor) {
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
    public void registrarVehiculo() {
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
    	System.out.println("Encendiendo vehiculo");
    }

    /**
     * 
     */
    public void acelerar() {
        // TODO implement here
    	System.out.println("Acelerando vehiculo");
    }

    /**
     * 
     */
    public void frenar() {
        // TODO implement here
    	System.out.println("Frenando vehiculo");
    }

    /**
     * 
     */
    public void cambiarVelocidad() {
        // TODO implement here
    	System.out.println("Cambiando velocidad del vehiculo");
    }

    /**
     * 
     */
    public void apagar() {
        // TODO implement here
    	System.out.println("Apagando vehiculo");
    }

	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", tipo=" + tipo + ", motor=" + motor + ", color=" + color + "]";
	}

}