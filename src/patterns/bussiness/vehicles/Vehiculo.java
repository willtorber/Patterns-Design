package patterns.bussiness.vehicles;

import java.util.*;

import patterns.bussiness.motors.interfaces.IMotor;
import patterns.bussiness.tests.Prueba;

/**
 * 
 */
public class Vehiculo {

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
    private Prueba pruebas;





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
    public String getTipo() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setTipo(String value) {
        // TODO implement here
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
    public void setMotor(IMotor value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Prueba getPruebas() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setPruebas(Prueba value) {
        // TODO implement here
    }

    /**
     * @param placa 
     * @param tipo 
     * @param motor 
     * @return
     */
    public Vehiculo registrarVehiculo(String placa, String tipo, IMotor motor) {
        // TODO implement here
        return null;
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

}