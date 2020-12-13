package ie.gmit.sw.glitz.gz;

/**
 * Class which extends AbstractGz
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public class Zeta extends AbstractGz {

	/**
	 * Class constructor specifying the status.
	 * 
	 * @param s The status to be set
	 */
	public Zeta(String s) {
		super.setStatus(s);
	}

	/**
	 * Prints information on <code>Zeta</code>
	 */
	public void about() {
		System.out.println(
				"""
						Z:
						Zeta is the sixth letter of the Greek alphabet.
						In the system of Greek numerals, it has a value of 7. It was derived from the Phoenician letter zayin Zayin.
						Letters that arose from zeta include the Roman Z and Cyrillic
								""");
	}
}