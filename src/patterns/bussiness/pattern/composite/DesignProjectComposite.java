package patterns.bussiness.pattern.composite;

import java.util.ArrayList;

public class DesignProjectComposite extends ComponentWork {
	
	private Responsible responsible;	
	private ArrayList<ComponentWork> list;

	public DesignProjectComposite(String nombre, String descripcion, Responsible responsible) {
		super(nombre, descripcion);
		this.list = new ArrayList<>();
		this.responsible = responsible;
		// TODO Auto-generated constructor stub
	}		
	
	public void addWork(ComponentWork cw) {
		this.list.add(cw);
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
		System.out.println("Resonsable: " + this.responsible.getNombre());
		System.out.println("Descripción: " + this.getDescripcion());
		System.out.println("Duración: " + this.getDuracion());
	}

}
