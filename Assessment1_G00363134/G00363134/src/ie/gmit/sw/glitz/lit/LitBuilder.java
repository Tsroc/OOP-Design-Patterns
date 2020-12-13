package ie.gmit.sw.glitz.lit;

/**
 * Interface class used to build a Lit
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public interface LitBuilder {

	/**
	 * LitBuilder implementation
	 * 
	 * @param s Adds String to the builder
	 * @return Returns a LitBuilder
	 */
	LitBuilder with(String s);

	/**
	 * Returns the <code>Lit</code> when built
	 * 
	 * @return Returns the Lit class
	 */
	Lit build();

}