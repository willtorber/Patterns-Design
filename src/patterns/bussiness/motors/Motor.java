package patterns.bussiness.motors;

import java.util.*;

import patterns.bussiness.motors.interfaces.IMotor;

/**
 * 
 */
public class Motor implements IMotor {

    /**
     * Default constructor
     */
    public Motor() {
    }

    /**
     * 
     */
    private String referencia;

    /**
     * 
     */
    private String tipo;

    /**
     * 
     */
    private float capacidad_combustible;

    /**
     * 
     */
    private int numeros_pistones;

    /**
     * 
     */
    private float peso;

    /**
     * 
     */
    private int numero_cambios;


    /**
     * @return
     */
    public String getReferencia() {
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
    public float getCapacidad_combustible() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param value
     */
    public void setCapacidad_combustible(float value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getNumeros_pistones() {
        // TODO implement here
        return 0;
    }

    /**
     * @param value
     */
    public void setNumeros_pistones(int value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public float getPeso() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param value
     */
    public void setPeso(float value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getNumero_cambios() {
        // TODO implement here
        return 0;
    }

    /**
     * @param value
     */
    public void setNumero_cambios(int value) {
        // TODO implement here
    }

    /**
     * 
     */
    public void inyectarCombustible() {
        // TODO implement here
    }

    /**
     * 
     */
    public void iniciarComprension() {
        // TODO implement here
    }

    /**
     * 
     */
    public void iniciarProcesoCombustion() {
        // TODO implement here
    }

    /**
     * 
     */
    public void iniciarEscape() {
        // TODO implement here
    }

}