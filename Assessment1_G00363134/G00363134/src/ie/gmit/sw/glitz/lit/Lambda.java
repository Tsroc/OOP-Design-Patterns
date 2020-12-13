package ie.gmit.sw.glitz.lit;

/**
 * Class which extends AbstractLitField
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public class Lambda extends AbstractLitField {
	private int value;

	/**
	 * No param class constructor and sets the value
	 */
	public Lambda() {
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
	 * Prints information on <code>Lambda</code>
	 */
	@Override
	public void about() {
		System.out.println(
				"""
						Lambda is the 11th letter of the Greek alphabet, representing the sound /l/. In the system of Greek numerals lambda has a value of 30. Lambda is derived from the Phoenician Lamed Lamedh.
						Lambda gave rise to the Latin L and the Cyrillic El (Л). The ancient grammarians and dramatists give evidence to the pronunciation as [laːbdaː] (λάβδα) in Classical Greek times.
						In Modern Greek the name of the letter, Λάμδα, is pronounced [ˈlam.ða].
						In early Greek alphabets, the shape and orientation of lambda varied. Most variants consisted of two straight strokes, one longer than the other, connected at their ends.
						The angle might be in the upper-left, lower-left ("Western" alphabets), or top ("Eastern" alphabets). Other variants had a vertical line with a horizontal or sloped stroke running to the right.
						With the general adoption of the Ionic alphabet, Greek settled on an angle at the top; the Romans put the angle at the lower-left.
						The HTML 4 character entity references for the Greek capital and small letter lambda are &#923; and &#955; respectively. The Unicode code points for lambda are U+039B and U+03BB.
						""");
	}

}
