package ie.gmit.sw.omega;

import ie.gmit.sw.visitor.Visitor;

/**
 * Class which implements Omega
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public class Gamma implements Omega {
	
	private byte value;
	
	/**
	 * Class constructor, specifying value.
	 *
	 */
	public Gamma(byte v) {
		value = v;
	}
	
	/**
	 * Value getter. 
	 * 
	 * @return Updated value.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Overrides toString()
	 * 
	 * @return Class name and value. 
	 */
	public String toString() {
		return String.format("%s, Value: %d",
				getClass().getName(), getValue());
	}

	/**
	 * <code>accept()</code> is passed the Visitor object and the method <code>visit()</code> is called.
	 * 
	 * @param visitor Visitor.
	 * @return Updated data.
	 */
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
}