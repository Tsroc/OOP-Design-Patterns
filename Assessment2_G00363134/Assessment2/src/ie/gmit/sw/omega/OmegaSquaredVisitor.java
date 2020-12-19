package ie.gmit.sw.omega;

import ie.gmit.sw.visitor.Visitor;

/**
 * Implementation of Visitor for the Omega interface. 
 * 
 * @author Eoin Wilkie 
 *
 */
public class OmegaSquaredVisitor implements Visitor {

	/**
	 * Omega classes have their <code>getValue()</code> method squared.
	 * 
	 * @param omega Omega object being visited.
	 * @return <code>omega.getValue()</code> is squared.
	 */
	public int visit(Omega omega) {
		Double squared = Math.pow(omega.getValue(), 2);
		System.out.println(omega.toString() + ", Value(squared): " + squared);
		
		return squared.intValue();
	}

	/**
	 * Overloaded <code>visit()</code> for Gamma subclass.
	 * 
	 * @param gamma Gamma object being visited.
	 * @return Data is not updated for Gamma. 
	 */
	public int visit(Gamma gamma) {
		System.out.println("Gamma: cannot be squared!");
		return gamma.getValue();
	}

}
