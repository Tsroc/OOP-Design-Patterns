package ie.gmit.sw;

/*
 * The class Node plays the duals roles of a Component and a Leaf in the 
 * iterator pattern  and defines an interface for all objects in the 
 * composition, both  the composite and leaf nodes. A Leaf defines the 
 * behaviour for elements in the composition. Does this by implementing 
 * methods that the Composite supports.
 */
public class Node<E> {
	private E data;

	public Node(E data) {
		this.data = data;
	}

	public E get() {
		return data;
	}
	
	public int childCount() {  
		return 0;
	}
}