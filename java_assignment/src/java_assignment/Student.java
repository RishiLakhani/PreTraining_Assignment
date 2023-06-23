package java_assignment;

public class Student implements Comparable<Student> {
	
	// Initialize global variables
	public String name;
	public int id;
	private float percent;
	private long phoneNo;

	// Parameterized constructor to set the values of global variables
	public Student(String name, int id, float percent, long number) {
		this.name = name;
		this.id = id;
		this.percent = percent;
		this.phoneNo = number;
	}
	
	// Method to access the private global variable- percent
	public float getPercent() {
		return percent;
	}
	
	// Method to access the private global variable- phoneNo
	public long getNumber() {
		return phoneNo;
	}

	// Overriding the method of class Comparable to help sorting the students based on their percentage
	public int compareTo(Student s) {
		float percent = s.getPercent();
		return (int)(percent - this.percent);
	}
}