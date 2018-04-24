package patterns.bussiness.tests;

import patterns.bussiness.pattern.observer.Message;
import patterns.bussiness.pattern.observer.Subject;
import patterns.bussiness.scenarios.Escenario;
import patterns.bussiness.strategies.Estrategia;
import patterns.bussiness.vehicles.Vehiculo;

/**
 * 
 */
public class Prueba implements Subject {

    private Vehiculo vehiculo;

    private Escenario escenario;

    private float resistencia;

    public float consumo_combustible;

    private float suspension;

    private Estrategia estrategia;
    
    //private ArrayList<Observer> observers;
    
    private Message message;
    

    public Prueba(Vehiculo vehiculo , Escenario escenario ,Estrategia estrategia) {
    	this.vehiculo = vehiculo;
    	this.escenario = escenario;
    	this.estrategia = estrategia;
    	this.consumo_combustible = 0;
    	this.resistencia = 0;
    	this.suspension = 0;
    	
    	//observers = new ArrayList<Observer>();
    }
    
    public Prueba() {
    	
    }
    
    public void realizarPrueba() {
    	System.out.println("*** Inicio de la Prueba ***");
    	this.vehiculo.encender();
    	this.vehiculo.acelerar();
    	for (int i = 0; i < this.vehiculo.getMotor().getNumero_cambios(); i++) {
    		this.vehiculo.cambiarVelocidad();
    		this.calcularConsumoCombustile(i);
    		this.calcularSuspencion(i);
    		this.calcularResistencia(i);
		}
    	System.out.println(this.estrategia.getAnalisisDeSeguridad(escenario.getVisibilidad(), this.escenario.getRozamiento()));
    	System.out.println(this.estrategia.getAnalisisDeCalidad(this.consumo_combustible, this.resistencia, this.suspension));    	
    	this.vehiculo.apagar();
    	System.out.println("*** Fin de la Prueba ***");
    	this.notifyTo();
    }

    public void registrarPruebas() {
        System.out.println("Pruebas registradas con exito");
    }

    private float calcularConsumoCombustile(int base) {
    	this.consumo_combustible = (this.consumo_combustible*base) + (this.vehiculo.getMotor().getCapacidad_combustible()* (float)0.02)
    								/this.escenario.getRozamiento()/(base+1);
    	System.out.println("Consumo combustible estado "+(base+1)+": "+this.consumo_combustible);
        return this.consumo_combustible;
    }
    
    private float calcularResistencia(int base) {
        this.resistencia = (this.resistencia*base) + (this.vehiculo.getMotor().getPeso() * (1/this.escenario.getRozamiento()))
        					/(base+1);
        System.out.println("Resistencia estado "+(base+1)+": "+this.resistencia);
        return this.resistencia;
    }
    
    public float calcularSuspencion(int base) {
    	this.suspension = (this.suspension*base) + (1/this.escenario.getRozamiento()) + this.vehiculo.getMotor().getPeso()
    						/(base+1); 
    	System.out.println("Suspension estado "+(base+1)+": "+this.suspension);
        return this.suspension;
    }

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Escenario getEscenario() {
		return escenario;
	}

	public void setEscenario(Escenario escenario) {
		this.escenario = escenario;
	}

	public float getResistencia() {
		return resistencia;
	}

	public void setResistencia(float resistencia) {
		this.resistencia = resistencia;
	}

	public float getConsumo_combustible() {
		return consumo_combustible;
	}

	public void setConsumo_combustible(float consumo_combustible) {
		this.consumo_combustible = consumo_combustible;
	}

	public float getSuspension() {
		return suspension;
	}

	public void setSuspension(float suspension) {
		this.suspension = suspension;
	}

	public Estrategia getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	// observer pattern
	@Override
	public void notifyTo() {
		// TODO Auto-generated method stub
		message = new Message();
		message.update();
		
		/*
		for(Observer o: observers) {
			o.update();
		}
		*/	
		
	}        
	
	/*
	public void linkObservers(Observer o) {
		observers.add(o);
	}
	*/

}

