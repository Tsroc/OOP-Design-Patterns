package ie.gmit.sw.glitz.gz;

/**
 * Class which extends AbstractGz
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public class Gamma extends AbstractGz {

	/**
	 * Class constructor specifying the status.
	 * 
	 * @param s Status to be set
	 */
	public Gamma(String s) {
		super.setStatus(s);
	}

	/**
	 * Prints information on <code>Gamma</code>
	 */
	public void about() {
		System.out.println(
				"""
						G:
						Gamma is the third letter of the Greek alphabet.
						In the system of Greek numerals it has a value of 3. In Ancient Greek, the letter gamma represented a voiced velar stop /ɡ/.
						In Modern Greek, this letter represents either a voiced velar fricative or a voiced palatal fricative.
						In the International Phonetic Alphabet and other modern Latin-alphabet based phonetic notations, it represents the voiced velar fricative.
							""");
	}
}