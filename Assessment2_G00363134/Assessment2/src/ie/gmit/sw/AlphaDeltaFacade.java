package ie.gmit.sw;

import java.util.ArrayList;
import java.util.List;

import ie.gmit.sw.compositeIterator.Composite;
import ie.gmit.sw.compositeIterator.Iterator;
import ie.gmit.sw.compositeIterator.Node;
import ie.gmit.sw.omega.Omega;
import ie.gmit.sw.omega.OmegaFactory;
import ie.gmit.sw.omega.OmegaSquaredVisitor;
import ie.gmit.sw.visitor.Visitor;

public class AlphaDeltaFacade {
	
	private Composite<Omega> client = null;// = new _Composite<>(new Gamma( (byte)128 ));
	private Alpha<Omega> alpha = new Alpha<>(Status.Extreme); //This is our "data structure"
	@SuppressWarnings("unchecked")
	private Delta<Omega> delta = Delta.getInstance();
	private OmegaFactory omf = OmegaFactory.getInstance();
	Visitor visitor = new OmegaSquaredVisitor();
	
	/**
	 *	Class constructor. 
	 *
	 */
	public AlphaDeltaFacade() {
		buildData();
		
	}
	
	/**
	 * Builds test data.
	 * 
	 */
	private void buildData() {
		int i = 128;
		
		List<Node<Omega>> nodes = new ArrayList<>();

		nodes.add(new Node<Omega>(omf.getOmega("Gamma", (byte)i--)));
		nodes.add(new Node<Omega>(omf.getOmega("Beta", (byte)i--)));
		nodes.add(new Node<Omega>(omf.getOmega("Gamma", (byte)i--)));
		nodes.add(new Node<Omega>(omf.getOmega("Gamma", (byte)i--)));
		nodes.add(new Node<Omega>(omf.getOmega("Beta", (byte)i--)));
		nodes.add(new Node<Omega>(omf.getOmega("Eta", (byte)i--)));
		nodes.add(new Node<Omega>(omf.getOmega("Kappa", (byte)i--)));
		nodes.add(new Node<Omega>(omf.getOmega("Gamma", (byte)i--)));
		nodes.add(new Node<Omega>(omf.getOmega("Gamma", (byte)i--)));
		nodes.add(new Node<Omega>(omf.getOmega("Gamma", (byte)i--)));
		nodes.add(new Node<Omega>(omf.getOmega("Gamma", (byte)i--)));
		
		for(Node<Omega> node: nodes) {
			if(client == null){
				client = new Composite<>(node.get());
			}
			else {
				alpha.add(node, client);
			}
		}
		
	}

	/**
	 * Adds a value to container alpha.
	 * 
	 * @param s Class name.
	 * @param b Value to be set.
	 */
	public void add(String s, byte b) {
		alpha.add(new Node<Omega>(omf.getOmega(s, (byte)b)), client);
	}

	/**
	 * Adds a value to container delta.
	 * 
	 * @param s Class name.
	 * @param b Value to be set.
	 */
	public void add(String s, int i) {
		delta.add(new Node<Omega>(omf.getOmega(s, i)));
	}
	
	/**
	 * Iterates over delta, followed by alpha.
	 * 
	 */
	public void iterateData(){
		iterateDelta();
		iterateAlpha();
	}
	
	/**
	 * Iterates over delta.
	 * 
	 */
	public void iterateDelta() {
		System.out.println("Iterating over Delta...");
		Iterator<Omega> j =  delta.iterator();
		while (j.hasNext()) {
			Omega delta = j.next();
			System.out.println(delta.toString());
		}		
	}


	/**
	 * Iterates over alpha.
	 * 
	 */
	public void iterateAlpha() {
		System.out.println("Iterating over Alpha...");
		Iterator<Omega> i = alpha.iterator(client);
		while (i.hasNext()) {
			Omega alpha = i.next();
			System.out.println(alpha.toString());
		}	
	}
	
	/**
	 * Uses a visitor to update the data in alpha.
	 */
	public void viewUpdates() {
		System.out.println("Viewing updates with visitor...");
		Iterator<Omega> i = alpha.iterator(client);
		while (i.hasNext()) {
			Omega alpha = i.next();
			alpha.accept(visitor);
		}	
	}
}
