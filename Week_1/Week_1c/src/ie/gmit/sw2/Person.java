package ie.gmit.sw2;

@SuppressWarnings("preview")
public record Person(int id) {

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + "==>" + this.id());
	}
	
}
