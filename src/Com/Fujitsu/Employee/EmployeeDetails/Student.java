
public class Student {

	
	String firstname;
	String lastname;
	String address;
	int marks;
	
	public Student() {	
	}
	
	public Student(String firstname, String lastname, String address, int marks) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.marks = marks;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
