package ie.gmit.sw;

public class Person_B {
	
	private int id;
	
	public Person_B(int id) {
		this.id = id;
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + "==>" + this.id);
	}
	


}
