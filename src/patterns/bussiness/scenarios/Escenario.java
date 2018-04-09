package patterns.bussiness.scenarios;


/**
 * 
 */
public class Escenario {

    /**
     * 
     */
    private float visibilidad;
    

    /**
     * 
     */
    private float rozamiento;
   
	/**
     * 
     */
    private String terreno;

    /**
     * 
     */
    private String clima;

    /**
     * 
     */
    private int codigo;
    
    /**
     * Default constructor
     */
    public Escenario() {
    
    }
            
	public Escenario(float visibilidad, float rozamiento, String terreno, String clima, int codigo) {
		super();
		this.visibilidad = visibilidad;
		this.rozamiento = rozamiento;
		this.terreno = terreno;
		this.clima = clima;
		this.codigo = codigo;
	}


	public float getVisibilidad() {
		return visibilidad;
	}

	public void setVisibilidad(float visibilidad) {
		this.visibilidad = visibilidad;
	}

	public float getRozamiento() {
		return rozamiento;
	}

	public void setRozamiento(float rozamiento) {
		this.rozamiento = rozamiento;
	}

	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
    
}