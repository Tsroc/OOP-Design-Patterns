package ie.gmit.sw.glitz.gz;

import ie.gmit.sw.glitz.Glitz;

/**
 * Abstract class which implements interfaces: Gz, Glitz, and has a status field
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public abstract class AbstractGz implements Gz, Glitz {

	private Status status;

	/**
	 * Gets the class name
	 * 
	 * @return The class name
	 */
	public String getGz() {
		return "Executing " + this.getClass().getName();
	}

	/**
	 * Sets the status
	 * 
	 * @param s The status of <code>AbstractGz</code>
	 */
	public void setStatus(String s) {
		switch (s) {
		case "Slight" -> this.status = Status.Slight;
		case "Low" -> this.status = Status.Low;
		case "Medium" -> this.status = Status.Medium;
		default -> this.status = Status.None;
		};
	}

	/**
	 * Gets the status
	 * 
	 * @return status
	 */
	public String getStatus() {
		return this.status.toString();
	}

	/**
	 * Prints information on <code>Abstract</code>, Set to no information available
	 */
	public void about() {
		System.out.println("No information available.");
	}
}