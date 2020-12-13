package ie.gmit.dip;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

public class Runner {

	//private Collection <Student> students = new TreeSet<>((c, n) -> Long.compare(c.getDob().getTime(), n.getDob().getTime()));
	private Collection <Student> students = new TreeSet<>(Comparator.comparing(Student::getStudentID));
	
	
	public void go() throws CloneNotSupportedException {
		Student key = new Student("G7", new Date(System.nanoTime())); //Prototypical search key
		//Student key = (Student) students.get(6).clone();	//Clone
		
		Iterator<Student> it = students.iterator();

			Student current = null;
			while(it.hasNext() ) {
				current = it.next();
				
				if(current.equals(key)){
					key = (Student) current.clone();
					System.out.println("Key has been cloned.");
				}

		}
		boolean found = students.contains(key);
		
		System.out.println(found);
		//key.clear();
		//System.out.println(key.count());
		
	}
	
	public void init() {
		for(int i = 0; i < 10; i++) {
			Student s = new Student("G" + i, new Date(System.nanoTime()));
			students.add(s);
			
			for(int j = 0; j < 20; j++) {
				s.addBook(new Book(i+j, "Book"+i));
			}
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Runner r = new Runner();
		r.init();
		r.go();
	}
	
	public void testRecords() {
		// == Looking at Records.
		Book b = new Book(123, "New Book");
		Book c = new Book(123, "New Book");
		
		System.out.println(b + "==" + c);
		System.out.println(b == c);
		System.out.println(b.equals(c));
		System.out.println(b.hashCode() == c.hashCode());
		System.out.println(b.hashCode() + "==" + c.hashCode());
		System.out.println(System.identityHashCode(b) + "==" + System.identityHashCode(c));
		
	}
}
