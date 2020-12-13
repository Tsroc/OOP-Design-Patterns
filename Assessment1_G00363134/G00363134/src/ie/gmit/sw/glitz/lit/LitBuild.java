package ie.gmit.sw.glitz.lit;

import ie.gmit.sw.glitz.Glitz;

/**
 * Class used to build a Lit
 *
 * @author Eoin Wilkie
 * @version 1.0
 */
public class LitBuild implements LitBuilder {
	private Lit lit;

	/**
	 * Class constructor
	 */
	public LitBuild() {
		this.lit = new LitImpl();
	}

	/**
	 * LitBuilder implementation, used to add to the LitImpl class
	 * 
	 * @param s Adds String to the builder
	 * @return Returns a LitBuilder
	 */
	@Override
	public LitBuilder with(String s) {
		lit.add(s);
		return this;
	}

	/**
	 * Returns the <code>Lit</code> when built
	 * 
	 * @return Lit
	 */
	@Override
	public Lit build() {
		return this.lit;
	}

	/**
	 * Inner class which is built by the LitBuild class
	 *
	 * @author Eoin Wilkie
	 * @version 1.0
	 */
	private class LitImpl implements Lit, Glitz {
		private AbstractLitField l = new DefaultLitField();
		private AbstractLitField i = new DefaultLitField();
		private AbstractLitField t = new DefaultLitField();
		private int status;

		/**
		 * Class constructor
		 */
		public LitImpl() {
			// Has no L, I, T by default.
			this.status = 0;
		}

		/**
		 * Adds a value to the lit
		 * 
		 * @param s Takes a string value
		 */
		public void add(String s) {
			switch (s) {
			case "l" -> l = new Lambda();
			case "i" -> i = new Iota();
			case "t" -> t = new Theta();
			default -> s = "";
			}
			;
		}

		/**
		 * Calculates the status of the implementing class
		 * 
		 */
		public void calculateStatus() {
			this.status += l.getValue() + i.getValue() + t.getValue();
		}

		/**
		 * Gets the Day enum of the implementing class
		 * 
		 * @return Day enum
		 */
		public Day getDay() {
			calculateStatus();

			return switch (this.status) {
			case 1 -> Day.MONDAY;
			case 2 -> Day.TUESDAY;
			case 3 -> Day.WEDNESDAY;
			case 4 -> Day.THURSDAY;
			case 5 -> Day.FRIDAY;
			case 6 -> Day.SATURDAY;
			case 7 -> Day.SUNDAY;
			default -> Day.NODAY;
			};
		}

		/**
		 * Gets the status of the implementing class
		 * 
		 * @return Status string
		 */
		public String getStatus() {
			return getDay().toString();
		}

		/**
		 * Returns information on the implementing class
		 */
		public void about() {
			System.out.println("L: ");
			l.about();
			System.out.println("I: ");
			i.about();
			System.out.println("T: ");
			t.about();
		}

	}
}
