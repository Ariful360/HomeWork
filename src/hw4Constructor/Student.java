package hw4Constructor;

public class Student {
	// variables declared here
	public String stName;
	public int stID;
	public char gender;
	public boolean isProgrammer;
	public float grade;

	// This is a default constructor
	public Student() {
		System.out.println("This is all about Student");
	}

	// This is a parameterized constructor
	public Student(String stName, int stID, char gender, boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.gender = gender;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student name: " + stName + ", Student Id: " + stID + ", Student gender: " + gender
				+ ", Java Programmer: " + isProgrammer + ", Student grade: " + grade);
	}

}
