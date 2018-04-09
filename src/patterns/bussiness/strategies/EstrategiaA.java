package patterns.bussiness.strategies;

/**
 * 
 */
public class EstrategiaA extends Estrategia {
    
    public EstrategiaA() {
    	
    }

	@Override
	public float getAnalisisDeSeguridad(float inidiceVisibilidad, float rozamiento) {
		return (( inidiceVisibilidad * ((float)0.23) + 0.5f)/rozamiento);
	}

	@Override
	public float getAnalisisDeCalidad(float consumoCombustible, float resistencia, float suspension) {
		return (resistencia * consumoCombustible)/(suspension + 1/2);
	}
       
}