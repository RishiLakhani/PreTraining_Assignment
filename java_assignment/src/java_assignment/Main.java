package java_assignment;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int num;	// Number of students
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		num = sc.nextInt();
		ArrayList<Student> students = new ArrayList<>();	// Array list of students
		
		// Input student data
		for(int i = 0; i < num; i++) {
			System.out.print("\nEnter the name of the student: ");
			String name = sc.next();
			System.out.print("Enter the ID number of the student: ");
			int id = sc.nextInt();
			System.out.print("Enter the percentage scored by the student: ");
			float percent = sc.nextFloat();
			System.out.print("Enter the phone number of the student: ");
			long phoneNo = sc.nextLong();
			Student s = new Student(name, id, percent, phoneNo);
			students.add(s);
		}
		
		//Display the details entered
		System.out.println("\nDetails entered:");
		for(int i = 0; i < num; i++) {
			Student s = students.get(i);
			System.out.println(s.id + "\t" + s.name + "\t" + s.getPercent() + "\t" + s.getNumber());
		}
		
		// Sorting the students based on percentage
		Collections.sort(students);
		
		// Displaying the student rankings
		System.out.println("\nRanking of Students:");
		for(Student s : students) {
			System.out.println(s.id + "\t" + s.name + "\t" + s.getPercent() + "\t" + s.getNumber());
		}
		sc.close();
	}

}