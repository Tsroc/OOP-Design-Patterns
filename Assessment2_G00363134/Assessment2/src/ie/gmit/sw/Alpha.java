package ie.gmit.sw;


import java.util.ArrayDeque;
import java.util.Deque;

import ie.gmit.sw.compositeIterator.Composite;
import ie.gmit.sw.compositeIterator.Iterator;
import ie.gmit.sw.compositeIterator.Node;
import ie.gmit.sw.omega.Beta;
import ie.gmit.sw.omega.Gamma;

/**
 * Alpha is used to manipulate a Gamma composite.
 * 
 * @author Eoin Wilkie 
 *
 * @param <E>
 */
public class Alpha<E> {
	private Status status;
	
	/**
	 * Constructor, sets status.
	 * 
	 * @param status Alpha's status.
	 */
	public Alpha(Status status) {
		this.status = status;
	}

	/**
	 * Getter.
	 * 
	 * @return Status.
	 */
	public Status getStatus() {
		return status;
	}
	
	/**
	 * Adds a node to the parent, if class is instanceof Gamma.
	 * If it is an instance of Beta it is added to deltaproxy
	 * Otherwise it is ignored.
	 * 
	 * @param child The node to be added.
	 * @param parent Collection.
	 */
	public void add(Node<E> child, Composite<E> parent) {

		if(child.get() instanceof Gamma) {
			parent.addChild(child);
		}
		else if (child.get() instanceof Beta) {
			// Passing this node to the proxy.
			GetDeltaData<E> deltaProxy = new DeltaProxy<>();
			deltaProxy.add(child);
		}
	}
	
	/**
	 * Removes a child from the parent. 
	 * 
	 * @param child Child to be removed.
	 * @param parent
	 */
	public void remove(Node<E> child, Composite<E> parent) {
		parent.removeChild(child);
	}

	/**
	 * AlphaIterator.
	 * 
	 * @param root The collection to be iterated over.
	 * @return Alpha iterator.
	 */
	public Iterator<E> iterator(Composite<E> root){
		return new AlphaIterator<E>(root);
	}
	
	/**
	 * Private AlphaIterator class.
	 * 
	 * @author Eoin Wilkie
	 *
	 * @param <T>
	 */
	private class AlphaIterator<T extends E> implements Iterator<E>{
		private Deque<Node<E>> deque = new ArrayDeque<>();

		private Node<E> current;

	    
		/**
		 * Class constructor
		 * 
		 * @param Collection to be iterated over.
		 */
		public AlphaIterator(Node<E> node) {
	    	deque.push(node); //We're LIFO!
	    }
		
		/**
		 * Traversal is implemented here in depth-first order.
		 * 
		 * @param node Node being traversed.
		 */
	    private void enqueue(Node<E> node) {
	    	if (node.childCount() > 0) {
	    		Composite<E> com = (Composite<E>) node;
	    		Node<E>[] children =  com.children();
	    		for (Node<E> child : children) {
	    			deque.push(child);
	    		}
	    	}
	    }
	    
		/**
		 * Checks if the next item in the list has a value.
		 * 
		 * @return If value in next, returns true, else returns false 
		 * 
		 */
		public boolean hasNext() {
	        return deque.peek() != null;
	    }

		/**
		 * Iterates to the next value.
		 * 
		 * @return next value in collection. 
		 * 
		 */
	    public E next() {
	    	current = deque.pollFirst();
	    	
	    	if (current != null) {
	    		enqueue(current);
	    		return current.get();
	    	}else {
	    		return null;
	    	}
	    }
	}
	
}