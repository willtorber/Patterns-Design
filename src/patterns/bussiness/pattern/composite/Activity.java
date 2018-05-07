package patterns.bussiness.pattern.composite;

import java.util.ArrayList;

public class Activity extends ComponentWork {
	
	private ArrayList<Task> list;

	public Activity(String nombre, String descripcion) {
		super(nombre, descripcion);
		this.list = new ArrayList<>();
	}
	
	public void addTask(ComponentWork cw) {
		this.list.add((Task) cw);
	}

	@Override
	public double getDuracion() {
		double duration = 0d;
		for (ComponentWork cw : list) {
			duration += cw.getDuracion();
		}
		return duration;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		System.out.println("Descripción: " + this.getDescripcion());
		System.out.println("Duración: " + this.getDuracion());
	}

}
