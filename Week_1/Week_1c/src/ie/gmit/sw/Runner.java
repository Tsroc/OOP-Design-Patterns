package ie.gmit.sw;

import java.util.*;

public class Runner {
	private Collection<Person> col = new ArrayList<>();
	
	public void go() {
		for(int i = 0; i < Math.pow(10, 9); i++) {
			Person p = new Person(i);
			
			if(i % 100 == 0) col.add(p);
		}
	}
	
	
	public static void main(String[] args) {
		new Runner().go();
	}

}
