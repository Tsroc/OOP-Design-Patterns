package ie.gmit.sw.glitz.lit;

import ie.gmit.sw.glitz.Glitz;

/**
 * Abstract class which implements interfaces: Gz, Glitz, and has a value field,
 * value is set to 0
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public abstract class AbstractLitField implements LitField, Glitz {

	private int value;

	/**
	 * No param class constructor and sets the value
	 */
	public AbstractLitField() {
		this.value = 0;
	}

	/**
	 * Returns a value associated with implementing class
	 * 
	 * @return int value
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * Prints information on <code>DefaultLitField</code>, Set to no information
	 * available
	 */
	public void about() {
		System.out.println("No information available.");
	}

}
