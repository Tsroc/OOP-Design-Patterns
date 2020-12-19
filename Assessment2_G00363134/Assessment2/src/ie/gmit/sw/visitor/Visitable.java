package ie.gmit.sw.visitor;

/**
 * Allows the Visitor to pass the Omega object. 
 * 
 * @author Eoin Wilkie 
 *
 */
public interface Visitable {
	
	/**
	 * <code>accept()</code> is passed the Visitor object and the method <code>visit()</code> is called.
	 * 
	 * @param v Visitor.
	 * @return Updated data.
	 */
	public int accept(Visitor v);

}
