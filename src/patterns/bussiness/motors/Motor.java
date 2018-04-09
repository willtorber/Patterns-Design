package patterns.bussiness.motors;

import patterns.bussiness.motors.interfaces.IMotor;

/**
 * 
 */
public class Motor implements IMotor {

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

                
    public Motor(String referencia, String tipo, float capacidad_combustible, int numeros_pistones, float peso,
			int numero_cambios) {
		super();
		this.referencia = referencia;
		this.tipo = tipo;
		this.capacidad_combustible = capacidad_combustible;
		this.numeros_pistones = numeros_pistones;
		this.peso = peso;
		this.numero_cambios = numero_cambios;
	}
    
    public Motor() {

	}       

	public String getReferencia() {
		return referencia;
	}

	public String getTipo() {
		return tipo;
	}

	public float getCapacidad_combustible() {
		return capacidad_combustible;
	}

	public int getNumeros_pistones() {
		return numeros_pistones;
	}

	public float getPeso() {
		return peso;
	}

	public int getNumero_cambios() {
		return numero_cambios;
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