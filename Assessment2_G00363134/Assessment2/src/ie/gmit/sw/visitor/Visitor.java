package ie.gmit.sw.visitor;

import ie.gmit.sw.omega.Omega;

/**
 * Visitor pattern is used to perform an action on an <code>Omega</code> object. 
 * 
 * @author Eoin Wilkie 
 *
 */
public interface Visitor {
	
	/**
	 * Determines how the data will be updated.
	 * 
	 * @param omega Omega object being visited.
	 * @return Updated data.
	 */
	public int visit(Omega omega);

}
