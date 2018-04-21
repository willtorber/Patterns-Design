package patterns.bussiness.pattern.decorator;

import patterns.bussiness.vehicles.Vehiculo;

public class VehiculoElectrico extends VehiculoDecorador{

	public VehiculoElectrico(Vehiculo vehiculo) {
		super(vehiculo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		getVehiculo().encender();
		System.out.println("Administrando energia necesaria, iniciando el SO...");
		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		getVehiculo().acelerar();
		System.out.println("Incrementando el voltaje necesario");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		getVehiculo().apagar();
		System.out.println("Suspendiendo la energia");
	}

}
