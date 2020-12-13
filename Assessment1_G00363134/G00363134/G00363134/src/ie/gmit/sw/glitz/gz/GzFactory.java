package ie.gmit.sw.glitz.gz;

/**
 * Factory class which creates an AbstractGz class
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public class GzFactory {
	private static GzFactory gzf = new GzFactory();

	/**
	 * Class constructor
	 */
	private GzFactory() {

	}

	/**
	 * Returns single instance of <code>GzFactory</code>
	 * 
	 * @return The instance of GzFactory
	 */
	public static GzFactory getInstance() {
		return gzf;
	}

	/**
	 * Returns a class based on <code>Status</code> input
	 * 
	 * @param s The String will determine the class created
	 * @return Returns an <code>AbstractGz</code> based on <code>Status</code> input
	 */
	public AbstractGz getGz(String s) {
		return switch (s) {
		case "Slight" -> new Zeta(s);
		case "Low" -> new Zeta(s);
		case "Medium" -> new Gamma(s);
		default -> null;
		};
	}
}