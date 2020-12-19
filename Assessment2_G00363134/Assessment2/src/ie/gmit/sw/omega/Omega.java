package ie.gmit.sw.omega;

import ie.gmit.sw.visitor.Visitor;

/**
 * Interface for classes Beta, Gamma, Epsilon and Zeta.
 * 
 * @author Eoin Wilkie
 * @version 1.0
 */
public interface Omega {
	
	/**
	 * Gets value
	 * @return returns value
	 */
	public int getValue();
	
	/**
	 * Accepts a visitor.
	 * 
	 * @param v The <code>Visitor</code>
	 * @return	Updated data.
	 */
	public int accept(Visitor v);

}
