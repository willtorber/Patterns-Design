package patterns.bussiness.strategies;

/**
 * 
 */
public abstract class Estrategia {

    public Estrategia() {
    
    }

    public abstract float getAnalisisDeSeguridad(float inidiceVisibilidad , float rozamiento);
	
	public abstract float getAnalisisDeCalidad(float consumoCombustible , float resistencia , float suspension);	

}