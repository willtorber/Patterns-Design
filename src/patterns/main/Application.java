package patterns.main;

import java.util.*;

import patterns.bussiness.iterator.Iterator;
import patterns.bussiness.orders.InternationalOrder;
import patterns.bussiness.orders.NationalOrder;

public class Application {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>(); 
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
		
	}

}
