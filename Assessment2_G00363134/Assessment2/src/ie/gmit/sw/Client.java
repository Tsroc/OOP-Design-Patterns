package ie.gmit.sw;

/**
 * Client class.
 * 
 * @author Eoin Wilkie 
 * 
 */
public class Client {
	public static void main(String[] args) {
		AlphaDeltaFacade adf = new AlphaDeltaFacade();

		// Can iterate over data.
		adf.iterateData();
		// Can update the data.
		adf.viewUpdates();
		// Client knows nothing about Alpha or Delta because it uses a facade.
	}

}
