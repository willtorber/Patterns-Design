package patterns.bussiness.pattern.composite;

public abstract class ComponentWork {
	
	public String nombre;
	public String descripcion;
	
	public ComponentWork(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	abstract public double getDuracion();
	abstract public void getInformation();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
