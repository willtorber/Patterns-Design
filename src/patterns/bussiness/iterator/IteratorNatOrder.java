package patterns.bussiness.iterator;

public class IteratorNatOrder implements Iterator<String> {
	
	private int pos;
	private String[] list;
		
	public IteratorNatOrder(String[] list) {
		super();
		this.pos = 0;
		this.list = list;
	}

	@Override
	public boolean hasNext() {		
		return (this.pos+1 <= list.length);
	}

	@Override
	public String next() {
		String item = list[this.pos++];		
		return item;
	}

}
