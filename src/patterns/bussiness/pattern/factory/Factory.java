package patterns.bussiness.pattern.factory;

import patterns.bussiness.motors.interfaces.IMotor;
import patterns.bussiness.pattern.flyweight.ColorFlyWeight;
import patterns.bussiness.vehicles.Vehiculo;
import patterns.bussiness.vehicles.VehiculoDeportivo;
import patterns.bussiness.vehicles.VehiculoUrbano;

public class Factory implements IFactory {
				
	@Override
	public Vehiculo crearVehiculo(String tipo, String name_color, String placa, IMotor motor) {		
		ColorFlyWeight colorF =  new ColorFlyWeight();
		Vehiculo vehiculo = null;
		switch (tipo) {
		case "Deportivo":				
			vehiculo = new VehiculoDeportivo(placa, tipo, motor, colorF.getColor(name_color).getColor(), true);			
		case "Urbano":
			vehiculo = new VehiculoUrbano(placa, tipo, motor, colorF.getColor(name_color).getColor(), 4.0f);			
		default:
			break;
		}		
		vehiculo.registrarVehiculo();				
		return vehiculo;
	}

}
