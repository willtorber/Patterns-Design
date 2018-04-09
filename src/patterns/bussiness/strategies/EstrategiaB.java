package patterns.bussiness.strategies;

/**
 * 
 */
public class EstrategiaB extends Estrategia {

    /**
     * Default constructor
     */
    public EstrategiaB() {
    	
    }

	@Override
	public float getAnalisisDeSeguridad(float inidiceVisibilidad, float rozamiento) {
		return (( inidiceVisibilidad * ((float)0.57) + 1)/rozamiento);
	}

	@Override
	public float getAnalisisDeCalidad(float consumoCombustible, float resistencia, float suspension) {
		return (resistencia * 2/suspension)/consumoCombustible + 0.5f;
	}
	
}