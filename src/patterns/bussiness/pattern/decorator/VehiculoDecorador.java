package patterns.bussiness.pattern.decorator;

import patterns.bussiness.vehicles.Vehiculo;

public abstract class VehiculoDecorador implements IVehiculo {
	private Vehiculo vehiculo;
	
	public VehiculoDecorador(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	protected Vehiculo getVehiculo() {
		return vehiculo;
	}
}
