package patterns.bussiness.orders;

import patterns.bussiness.iterator.IterableO;
import patterns.bussiness.iterator.Iterator;
import patterns.bussiness.iterator.IteratorNatOrder;

public class NationalOrder extends Order implements IterableO<String> {
	
	private String[] listVehicles;
	
	public NationalOrder(String company, String observations, String[] listVehicles) {
		super(company, observations);
		this.listVehicles = listVehicles;
	}

	public String[] getListVehicles() {
		return listVehicles;
	}

	@Override
	public Iterator<String> getIterator() {
		// TODO Auto-generated method stub
		return new IteratorNatOrder(this.getListVehicles());
	}


	
	

	
	

	
	

}
