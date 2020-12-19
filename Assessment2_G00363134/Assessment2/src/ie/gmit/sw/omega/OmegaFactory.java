package ie.gmit.sw.omega;

/**
 * Factory class which creates an Omega class
 *
 * @author Eoin Wilkie
 * @version 1.0
 */

public class OmegaFactory {
	private static OmegaFactory omf = new OmegaFactory();
	
	/**
	 * Private class constructor
	 */
	private OmegaFactory() {
		
	}
	
	/**
	 * Returns single instance of OmegaFactory 
	 * 
	 * @return The instance of OmegaFactory
	 */
	public static OmegaFactory getInstance() {
		return omf;
	}
	
	/**
	 * Returns a class based on <code>String</code> input.
	 * 
	 * @param s The String will determine the class created
	 * @param b The byte will set the class value.
	 * @return Returns an Omega based on <code>Status</code> input
	 */
	public Omega getOmega(String s, byte b) {
		return switch (s) {
			case "Gamma" -> new Gamma(b);
			case "Beta" -> new Beta(b);
			case "Eta" -> new Eta(b);
			case "Theta" -> new Theta(b);
			case "Iota" -> new Iota(b);
			case "Kappa" -> new Kappa(b);
			case "Epsilon" -> new Epsilon(b);
			case "Zeta" -> new Zeta(b);
			default -> null;
		};	
	}

	/**
	 * Overloaded method to allow int input rather than byte.
	 * Returns a class based on <code>String</code> input.
	 * 
	 * @param s The String will determine the class created
	 * @param i The int will set the class value.
	 * @return Returns an Omega based on <code>Status</code> input
	 */
	public Omega getOmega(String s, int i) {
		return switch (s) {
			case "Epsilon" -> new Epsilon(i);
			case "Zeta" -> new Zeta(i);
			default -> null;
		};	
	}

}
