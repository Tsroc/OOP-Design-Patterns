package ie.gmit.sw.compositeIterator;

/**
 * Node contains data of type E.
 * 
 * @author Eoin Wilkie 
 *
 */
public class Node<E> {
	private E data;
	
	/**
	 * Node constructor. Node is type E
	 * 
	 * @param data The data being stored in the node.
	 */
	public Node(E data) {
		this.data = data;
	}
	
	/**
	 * Returns the data in the node.
	 * 
	 * @return Data node contains.
	 */
	public E get() {
		return data;
	}
	
	/**
	 * Returns the number of children nodes.
	 * 
	 * @return child count.
 	 */
	public int childCount() {
		return 0;
	}

}
