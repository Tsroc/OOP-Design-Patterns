package ie.gmit.sw.glitz.lit;

/**
 * Factory class which creates an LitBuilder
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public class LitBuilderFactory {
	private static LitBuilderFactory litf = new LitBuilderFactory();

	/**
	 * Class constructor
	 */
	private LitBuilderFactory() {

	}

	/**
	 * Returns single instance of <code>GzFactory</code>
	 * 
	 * @return The instance of LitBuilderFactory
	 */
	public static LitBuilderFactory getInstance() {
		return litf;
	}

	/**
	 * Returns a new LitBuilder
	 * 
	 * @return LitBuilder
	 */
	public LitBuilder newLITBuilder() {
		return new LitBuild();
	}
}
