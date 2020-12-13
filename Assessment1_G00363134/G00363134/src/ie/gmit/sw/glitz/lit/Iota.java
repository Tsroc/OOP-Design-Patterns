package ie.gmit.sw.glitz.lit;

/**
 * Class which extends AbstractLitField
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public class Iota extends AbstractLitField {
	private int value;

	/**
	 * No param class constructor and sets the value
	 */
	public Iota() {
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
	 * Prints information on <code>Iota</code>
	 */
	@Override
	public void about() {
		System.out.println(
				"""
						Iota is the ninth letter of the Greek alphabet.
						It was derived from the Phoenician letter Yodh. Letters that arose from this letter include the Latin I and J, the Cyrillic І, Yi, and Je, and iotated letters.
						In the system of Greek numerals, iota has a value of 10.
						Iota represents the sound [i]. In early forms of ancient Greek, it occurred in both long [iː] and short [i] versions, but this distinction was lost in Koine Greek.
						Iota participated as the second element in falling diphthongs, with both long and short vowels as the first element. Where the first element was long, the iota was lost in pronunciation at an early date, and was written in polytonic orthography as iota subscript, in other words as a very small ι under the main vowel. Examples include ᾼ ᾳ ῌ ῃ ῼ ῳ. The former diphthongs became digraphs for simple vowels in Koine Greek.[3]
						The word is used in a common English phrase, "not one iota", meaning "not the slightest amount", in reference to a phrase in the New Testament (Matthew 5:18): "until heaven and earth pass away, not an iota, not a dot, (King James Version: '[not] one jot or one tittle') will pass from the Law until all is accomplished". (Mt 5:18)[4] This refers to iota, the smallest letter, or possibly Yodh, י, the smallest letter in the Hebrew alphabet.
						The word 'jot' (or iot) derives from iota.
						The German, Portuguese, and Spanish name for the letter J (Jot / jota) is derived from iota.
						""");
	}

}
