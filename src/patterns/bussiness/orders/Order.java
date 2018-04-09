package patterns.bussiness.orders;

import patterns.bussiness.iterator.Iterator;
import patterns.bussiness.iterator.IterableO;

public class Order implements IterableO<String> {
	
	private String company;
	private String observations;
	
	
	public Order(String company, String observations) {
		super();
		this.company = company;
		this.observations = observations;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getObservations() {
		return observations;
	}


	public void setObservations(String observations) {
		this.observations = observations;
	}

	@Override
	public Iterator<String> getIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
