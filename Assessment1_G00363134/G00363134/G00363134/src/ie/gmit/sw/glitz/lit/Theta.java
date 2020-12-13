package ie.gmit.sw.glitz.lit;

/**
 * Class which extends AbstractLitField
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public class Theta extends AbstractLitField {

	private int value;

	/**
	 * No param class constructor and sets the value
	 */
	public Theta() {
		this.value = 2;
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
	 * Prints information on <code>Theta</code>
	 */
	@Override
	public void about() {
		// TODO Auto-generated method stub
		System.out.println(
				"""
						Theta is the eighth letter of the Greek alphabet, derived from the Phoenician letter Teth Phoenician teth.svg.
						In the system of Greek numerals it has the value 9.
						""");
	}

}