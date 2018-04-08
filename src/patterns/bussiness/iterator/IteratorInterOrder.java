package patterns.bussiness.iterator;

import java.util.List;

public class IteratorInterOrder implements Iterator<String> {
	
	private int pos = 0;
	private List<String> list;
		
	public IteratorInterOrder(List<String> list) {
		super();
		//this.pos = 0;
		this.list = list;
	}

	@Override
	public boolean hasNext() {		
		return (pos+1 <= list.size());
	}

	@Override
	public String next() {		
		String item = list.get(this.pos++);
		return item;
	}

}
