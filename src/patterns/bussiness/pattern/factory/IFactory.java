package patterns.bussiness.pattern.factory;

import patterns.bussiness.motors.interfaces.IMotor;
import patterns.bussiness.vehicles.Vehiculo;

public interface IFactory {
	public Vehiculo crearVehiculo(String tipo, String color, String placa, IMotor motor);
}
