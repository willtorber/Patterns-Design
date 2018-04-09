package patterns.bussiness.pattern.facade;

import java.util.List;

import patterns.bussiness.iterator.Iterator;
import patterns.bussiness.motors.MotorAdapterDiesel;
import patterns.bussiness.motors.MotorDiesel;
import patterns.bussiness.motors.MotorGasolina;
import patterns.bussiness.motors.interfaces.IMotor;
import patterns.bussiness.orders.InternationalOrder;
import patterns.bussiness.orders.NationalOrder;
import patterns.bussiness.orders.Order;
import patterns.bussiness.pattern.factory.Factory;
import patterns.bussiness.scenarios.Escenario;
import patterns.bussiness.strategies.Estrategia;
import patterns.bussiness.strategies.EstrategiaA;
import patterns.bussiness.strategies.EstrategiaB;
import patterns.bussiness.tests.Prueba;
import patterns.bussiness.vehicles.Vehiculo;

public final class FacadePattern {
	
	private static FacadePattern facade = new FacadePattern();
	private Prueba test;
	private Order order;
	private Factory factory;
	
	private FacadePattern() {
		this.factory = new Factory();
		System.out.println("Creando Factory");
	}
	
	public static FacadePattern getFacadeInstance() {
		if(FacadePattern.facade == null) {
			FacadePattern.facade = new FacadePattern();
		}
		return FacadePattern.facade;
	}
	
	public void recibirOrden(String company, String observations, Object vehicles) {						
		
		if(vehicles.getClass().getName() == "java.util.ArrayList") {
			InternationalOrder orderInt = new InternationalOrder(company, observations, (List<String>) vehicles); 
			this.order = orderInt;
		}else {
			NationalOrder orderNac = new NationalOrder(company, observations, (String[]) vehicles);
			this.order = orderNac;
		}
		
		Iterator<String> i  = order.getIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public Vehiculo registrarVehiculo(String tipo, String color, String placa, String tipo_Motor) {
		
		IMotor motor = null;
		
		if (tipo_Motor.equalsIgnoreCase("Diesel")) {
			MotorDiesel motorDiesel = new MotorDiesel("RF34AS3", "Diesel", 50.5f, 150, 55.6f, 7);
			MotorAdapterDiesel adapterMotor = new MotorAdapterDiesel(motorDiesel);
			motor = adapterMotor;
		}else if(tipo_Motor.equalsIgnoreCase("Gasolina")) {
			MotorGasolina motorGasolina = new MotorGasolina("Z46GF3A", "Gasolina", 45.5f, 200, 65.6f, 6);
			motor = motorGasolina;
		}		
		
		return this.factory.crearVehiculo(tipo, color, placa, motor);
	}	
	
	public void evaluarVehiculo(float visibilidad, float rozamiento, String terreno, 
			String clima, String estrategia, Vehiculo vehiculo) {		
		
		this.test = new Prueba();
		
		Escenario escenario = new Escenario();
		escenario.setClima(clima);
		escenario.setTerreno(terreno);
		escenario.setRozamiento(rozamiento);
		escenario.setVisibilidad(visibilidad);		
		
		Estrategia strategy = null;
		
		if (estrategia.equalsIgnoreCase("EstrategiaA")) {
			strategy = new EstrategiaA();
		}else {
			strategy = new EstrategiaB();
		}
		
		this.test.setEscenario(escenario);
		this.test.setEstrategia(strategy);	
		this.test.setVehiculo(vehiculo);
		
		this.test.realizarPrueba();
	}
	
}
