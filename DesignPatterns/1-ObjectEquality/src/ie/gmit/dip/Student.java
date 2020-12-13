package ie.gmit.dip;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student implements Cloneable{
	private String studentID;
	private Date dob;

	private List<Book> books = new ArrayList<>();

	// == Constructor
	public Student(String studentID, Date dob) {
		this.studentID = studentID;
		this.dob = dob;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public boolean addBook(Book b) {
		return books.add(b);
	}

	public Object[] books() {
		return books.toArray(Book[]::new);
	}

	public boolean hasBook(Object o) {
		return books.contains(o);
	}

	public int count() {
		return books.size();
	}

	public void clear() {
		books.clear();
	}
	
	private void addAll(List<Book> list) {
		this.books = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentID == null) {
			if (other.studentID != null)
				return false;
		} else if (!studentID.equals(other.studentID))
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Deep copy.
		Student s = (Student) super.clone();
		List<Book> copy = new ArrayList<>(books);
		s.addAll(copy);
		
		return s;
	}

	
}
