package ie.gmit.sw;

import java.util.ArrayDeque;
import java.util.Deque;

import ie.gmit.sw.compositeIterator.Composite;
import ie.gmit.sw.compositeIterator.Iterator;
import ie.gmit.sw.compositeIterator.Node;


/**
 * Delta used to manipulate a Omega composite.
 * 
 * @author Eoin Wilkie 
 *
 * @param <E>
 */
public class Delta<E> implements GetDeltaData<E>{
	// Delta should exist as a singleton.
	private static Delta delta_instance = null;
	
	/**
	 * Class constructor.
	 * 
	 */
	private Delta() {
		
	}
	
	/**
	 * Returns single instance of Delta
	 * 
	 * @return Delta singleton
	 */
	public static Delta getInstance() 
    { 
        if (delta_instance == null) {
            delta_instance = new Delta();
            
        }
          
        return delta_instance; 
    } 
	
	private Composite<E> root;
	
	/**
	 * Adds a node to the parent.
	 * If the collection is null, a new collection is created with node at root.
	 * Otherwise, node is added to the collection.
	 * 
	 * @param child The node to be added.
	 * @param parent Collection.
	 */
	public void add(Node<E> child) {

		if(root == null) {
			root = new Composite<>(child.get());
		}
		else {
			root.addChild(child);
		}
		
	}

	/**
	 * Removes a child from the parent. 
	 * 
	 * @param child Child to be removed.
	 * @param parent
	 */
	public void remove(Node<E> child) {
		root.removeChild(child);
	}

	/**
	 * DeltaIterator.
	 * 
	 * @param root The collection to be iterated over.
	 * @return Delta iterator.
	 */
	public Iterator<E> iterator(){
		return new DeltaIterator<E>(root);
	}
	

	/**
	 * Private DeltaIterator class.
	 * 
	 * @author Eoin Wilkie
	 *
	 * @param <T>
	 */
	private class DeltaIterator<T extends E> implements Iterator<E>{
		private Deque<Node<E>> deque = new ArrayDeque<>();

		private Node<E> current;

		/**
		 * Class constructor
		 * 
		 * @param Collection to be iterated over.
		 *
		 */
		public DeltaIterator(Node<E> node) {
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