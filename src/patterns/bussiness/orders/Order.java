package patterns.bussiness.orders;

public class Order {
	
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

}
