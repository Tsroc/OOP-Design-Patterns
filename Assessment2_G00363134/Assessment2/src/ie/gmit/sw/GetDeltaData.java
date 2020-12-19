package ie.gmit.sw;

import ie.gmit.sw.compositeIterator.Node;

/**
 * Interface for accessing Delta through proxy.
 * 
 * @author Eoin Wilkie 
 *
 * @param <E>
 */
public interface GetDeltaData<E> {

	/**
	 * Adds a node to delta.
	 * 
	 * @param Node The node to be added.
	 */
	public void add(Node<E> child);

}
