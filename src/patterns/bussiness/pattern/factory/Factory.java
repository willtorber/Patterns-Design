package patterns.bussiness.pattern.factory;

import patterns.bussiness.motors.interfaces.IMotor;
import patterns.bussiness.pattern.flyweight.ColorFlyWeight;
import patterns.bussiness.vehicles.Vehiculo;
import patterns.bussiness.vehicles.VehiculoDeportivo;
import patterns.bussiness.vehicles.VehiculoUrbano;

public class Factory implements IFactory {
			
	
	@Override
	public Vehiculo crearVehiculo(String tipo, String color, String placa, IMotor motor) {
		// TODO Auto-generated method stub
		ColorFlyWeight colorF =  new ColorFlyWeight();
		Vehiculo v = null;
		switch (tipo) {
		case "Deportivo":				
			v = new VehiculoDeportivo();
			v.setColor(colorF.getColor(color).getColor());
		case "Urbano":
			v = new VehiculoUrbano();
			v.setColor(colorF.getColor(color).getColor());
		default:
			break;
		}		
		v.registrarVehiculo(placa, tipo, motor);		
		return v;
	}

}
