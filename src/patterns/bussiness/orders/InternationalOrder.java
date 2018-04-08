package patterns.bussiness.orders;


import java.util.List;

import patterns.bussiness.iterator.IterableO;
import patterns.bussiness.iterator.Iterator;
import patterns.bussiness.iterator.IteratorInterOrder;

public class InternationalOrder extends Order implements IterableO<String> {
	
	private List<String> listVehicles;
	
	public InternationalOrder(String company, String observations, List<String> listVehicles) {
		super(company, observations);
		this.listVehicles = listVehicles;
	}

	public List<String> getListVehicles() {
		return listVehicles;
	}

	@Override
	public Iterator<String> getIterator() {
		// TODO Auto-generated method stub
		return new IteratorInterOrder(this.getListVehicles());
	}



}
