package patterns.bussiness.pattern.observer;

public class Message implements Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("The test has finished, please check it");
	}
	
	public void doThing() {
		System.out.println("This method do thing");
	}
	
  // 	The observer
}
