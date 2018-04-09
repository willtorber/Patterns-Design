package patterns.main;


import patterns.bussiness.motors.MotorAdapterDiesel;
import patterns.bussiness.motors.MotorDiesel;
import patterns.bussiness.motors.interfaces.IMotor;
import patterns.bussiness.pattern.factory.Factory;
import patterns.bussiness.scenarios.Escenario;
import patterns.bussiness.strategies.Estrategia;
import patterns.bussiness.strategies.EstrategiaA;
import patterns.bussiness.strategies.EstrategiaB;
import patterns.bussiness.tests.Prueba;
import patterns.bussiness.vehicles.Vehiculo;
import patterns.bussiness.vehicles.VehiculoDeportivo;

public class Application {

	public static void main(String[] args) {
		
		/*List<String> l = new ArrayList<String>(); 
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");
		
		String [] l2 = {"a", "b","c","d","e"};
		
		//InternationalOrder io = new InternationalOrder("will company", "Ninguna observación", l);
		NationalOrder io = new NationalOrder("will company", "Ninguna observación", l2);
		Iterator<String> i  = io.getIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			
		MotorDiesel motorD = new MotorDiesel("00", "tipo", 4.5f, 2, 2.3f, 4);
		MotorAdapterDiesel motorAD =  new MotorAdapterDiesel(motorD);
		Factory factor = new Factory();
		System.out.println(factor.crearVehiculo("Urbano", "Rojo", "1234", motorAD).toString());
		System.out.println(factor.crearVehiculo("Urbano", "Rojo", "4321", motorAD).toString());
		*/
		
		Vehiculo vehiculo = new VehiculoDeportivo();
		IMotor motor = new MotorDiesel( "AHK-1267", "TIPO", (float)70.5, 5 , 570, 6);
		vehiculo.setMotor(motor);
		vehiculo.getMotor();
		//Escenario
		Escenario escenario= new Escenario();
		escenario.setClima("SOLEADO");
		escenario.setTerreno("TIERRA");
		escenario.setRozamiento((float)0.33);
		escenario.setVisibilidad((float)0.66);
		Estrategia estrategia = new EstrategiaA();
		Prueba p = new Prueba(vehiculo , escenario , estrategia);
		p.realizarPrueba();
		System.out.println("*******************************************************");
		Estrategia estrategia2 = new EstrategiaB();
		p.setEstrategia(estrategia2);
		p.realizarPrueba();
	}

}
