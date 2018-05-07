package patterns.bussiness.pattern.composite;

public class Task extends ComponentWork {

	private double duration;
	
	public Task(String nombre, String descripcion, double duration) {
		super(nombre, descripcion);
		this.duration = duration;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDuracion() {
		// TODO Auto-generated method stub
		return this.duration;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		System.out.println("Descripción: " + this.getDescripcion());
		System.out.println("Duración: " + this.getDuracion());
	}

}
