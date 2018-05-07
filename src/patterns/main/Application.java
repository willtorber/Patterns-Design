package patterns.main;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import patterns.bussiness.pattern.composite.Activity;
import patterns.bussiness.pattern.composite.ComponentWork;
import patterns.bussiness.pattern.composite.DesignProjectComposite;
import patterns.bussiness.pattern.composite.Responsible;
import patterns.bussiness.pattern.composite.Task;
import patterns.bussiness.pattern.decorator.IVehiculo;
import patterns.bussiness.pattern.decorator.VehiculoElectrico;
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
		 
		 
		 /**
		  * Creando vehiculos
		  * */
		 
		 IVehiculo vehiculo2 = new Vehiculo();
		 vehiculo2.encender();
		 vehiculo2.acelerar();
		 vehiculo2.apagar();
		 
		 
		 IVehiculo vehiculo3 = new VehiculoElectrico(new Vehiculo());
		 vehiculo3.encender();
		 vehiculo3.acelerar();
		 vehiculo3.apagar();
		 
		 
		 /**
		  * COMPOSITE - Crear y estimar duración de proyecto de diseño
		  * */
		 
		 System.out.println("** APLICACIÓN DE COMPOSITE ***");
		 
		 String nameProject = "RevolutionMotor";
		 String descriptionProject = "El motor del futuro en el presente, 100% amigable con el ambiente "
		 		+ "y con capacidad de alcanzar 1/7 de la velocidad de la LUZ";
		 String nameResponsible = "Tony Stark";
		 
		 ArrayList<ComponentWork> works = new ArrayList<>();
		 
		 Activity act1 = new Activity("Actividad 1: Consultar energía de fusión solar", "Ir a empresas que trabajen "
		 		+ "con energia de estrellas de neutrinos");
		 
		 Activity act2 = new Activity("Actividad 2: Hacer sistema de engranes", "Definir prototipo grafico del sistema de engranes");
		 
		 Task task1 = new Task("Tarea 1", "Esta es la tarea 1", 25.9d);
		 Task task2 = new Task("Tarea 2", "Esta es la tarea 2", 35.2d);
		 Task task3 = new Task("Tarea 3", "Esta es la tarea 3", 15.1d);
		 Task task4 = new Task("Tarea41", "Esta es la tarea 4", 5.12d);
		 Task taskInd = new Task("Tarea41", "Esta es la tarea 5", 13.5d);
		 
		 act1.addTask(task1);
		 act1.addTask(task2);
		 act2.addTask(task3);
		 act2.addTask(task4);
		 
		 works.add(act1);
		 works.add(act2);
		 works.add(taskInd);
		 		 
		 facade.crearEstimarProyectoDeDiseño(nameProject, descriptionProject, nameResponsible, works);
	}

}
