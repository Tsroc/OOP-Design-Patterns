package ie.gmit.sw.compositeIterator;

import java.util.Arrays;

/**
 * Composite’s role is to define behaviour of the components 
 * having children and to store child components.
 * 
 * @author Eoin Wilkie 
 *
 */
public class Composite<E> extends Node<E> {
	
	private Node<E>[] elements;
	private int size = 0;
	
	/**
	 * Class constructor
	 * 
	 * @param Initial node.
	 *
	 */
	@SuppressWarnings("unchecked")
	public Composite(E data) {
		super(data);
		elements = new Node[1];
	}
	

	/**
	 * Adds a child to the container.
	 * 
	 * @param e The child node to be added.
	 */
	public void addChild(Node<E> e) { 
		ensureCapacity();
		elements[size] = e;
		size++;
	}


	/**
	 * Finds the index of the child to be removed,
	 * Calls <code>remove()</code>.
	 * 
	 * @param e The child node to be removed.
	 */
	public void removeChild(Node<E> e) { 
		remove(indexOf(e)); 
	}
	
	/**
	 * Removes a child from the container.
	 * 
	 * @param index The index of child to be removed.
	 */
	private void remove(int index) { 
		checkRange(index);
		elements[index] = null;
		elements[size - 1] = null;
		size--;
	}

	/**
	 * Returns container.
	 * 
	 * @return The node container.
	 */
	public Node<E>[] children() {
		return (Node<E>[]) elements;
	}
	
	/**
	 * Checks if the container has node.
	 * 
	 * @param e The node being searched for.
	 * @return True if container has, false if not.
	 */
	public boolean hasChild(Node<E> e) { 
		return indexOf(e) >= 0; 
	}
	
	/**
	 * Returns the size of the container.
	 * 
	 * @return Size of container.
	 */
	public int childCount() {
		return size;
	}
	
	/**
	 * Searches for a node index.
	 * 
	 * @param e The node being searched for.
	 * @return Index of the node.
	 */
	private int indexOf(Node<E> e) { 
		if (e != null) {
			for (int i = 0; i < size; i++) {
				if (elements[i].equals(e)) return i;
			}
		}
		return -1;
	}
	
	/**
	 * Ensures the searched for index is within container range.
	 * 
	 * @param index Index being searched for.
	 */
	private void checkRange(int index) {
		if (index >= elements.length) throw new ArrayIndexOutOfBoundsException();
	}

	/**
	 * Ensures the container has capacity.
	 */
	private void ensureCapacity() {
		if (elements.length <= size) elements = Arrays.copyOf(elements, size + 1);
	}

}
