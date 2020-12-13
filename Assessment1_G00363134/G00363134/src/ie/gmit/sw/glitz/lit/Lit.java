package ie.gmit.sw.glitz.lit;

/**
 * Interface class which has the following methods, add, calculateStatus,
 * getDay, getStatus, about
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public interface Lit {

	/**
	 * Adds a value to the lit
	 * 
	 * @param s Takes a string value
	 */
	void add(String s);

	/**
	 * Calculates the status of the implementing class
	 * 
	 */
	void calculateStatus();

	/**
	 * Gets the Day enum of the implementing class
	 * 
	 * @return Day enum
	 */
	Day getDay();

	/**
	 * Gets the status of the implementing class
	 * 
	 * @return Status
	 */
	String getStatus();

	/**
	 * Returns information on the implementing class
	 */
}
