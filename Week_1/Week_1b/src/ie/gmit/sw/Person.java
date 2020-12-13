package ie.gmit.sw;

public class Person {
	
	private int id;
	
	public Person(int id) {
		this.id = id;
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + "==>" + this.id);
	}
	


}
