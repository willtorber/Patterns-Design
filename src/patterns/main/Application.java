package patterns.main;


import java.util.ArrayList;
import java.util.List;
import patterns.bussiness.pattern.facade.FacadePattern;
import patterns.bussiness.vehicles.Vehiculo;


public class Application {

	public static void main(String[] args) {
		
		FacadePattern facade = FacadePattern.getFacadeInstance();

		/**
		 * Recibir ordenes
		 */
		List<String> listO = new ArrayList<String>(); 
		listO.add("000AAA,Urbano,Diesel,Rojo");
		listO.add("222EEE,Deportivo,Gasolino,Azul");
		listO.add("567KIL,Urbano,Diesel,Verde");
		listO.add("333CDE, Urbano, Diesel, Negro");
		listO.add("098FGT, Deportivo, Gasolina, Plateado");
		
		// Ordenes internacionales
		facade.recibirOrden("Will company", "Ninguna observación", listO);
		
		String [] listO2 = {"111GGG,Urbano,Diesel,Rojo",
				"666CC,Deportivo,Gasolino,Azul",
				"765BNM,Urbano,Diesel,Verde",
				"333CDE, Urbano, Diesel, Negro",
				"098FGT, Deportivo, Gasolina, Plateado"};
		
		
		// Ordenes nacionales		
		facade.recibirOrden("Will company", "Ninguna observación", listO2);
	
				
		/**
		 * Registrar vehiculos 
		 */
		facade.registrarVehiculo("Deportivo", "verde", "DER123", "Diesel");
		
		
		/**
		 * Evaluar Vehiculo
		 */ 
		 Vehiculo vehiculo = facade.registrarVehiculo("Deportivo", "verde", "DER123", "Diesel");		 
		 facade.evaluarVehiculo(0.66f, 0.33f, "Tierra", "Soleado", "EstrategiaA", vehiculo);
				
	}

}
