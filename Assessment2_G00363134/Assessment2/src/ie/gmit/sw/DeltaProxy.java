package ie.gmit.sw;

import ie.gmit.sw.compositeIterator.Node;

/**
 * A proxy used by alpha to access delta.
 * 
 * @author Eoin Wilkie 
 *
 * @param <E>
 */
public class DeltaProxy<E> implements GetDeltaData<E> {
	@SuppressWarnings("unchecked")
	private Delta<E> delta = Delta.getInstance();

	/**
	 * Adds a node to delta.
	 * 
	 * @param Node The node to be added.
	 */
	public void add(Node<E> child) {
		delta.add(child);
		
	}

}
