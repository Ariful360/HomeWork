package hw3JavaVariablesDeclared;

public class AboutMe {

	// variable is declared here
	public String myName;
	public byte myAge;
	public long myId;
	public double myGrade;
	public int myPhoneNumber;
	public short myBirthYear;
	public char mySex;
	public float mySalary;
	public boolean usCitizen;

	// Constructor declared
	public AboutMe() {
		System.out.println("This is all About Me");
	}

	// method is implemented here
	public void aboutMe() {
		System.out.println("------------ This is all about myself ------------");

		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Id Number: " + myId + "\nMy Grade: "
				+ myGrade + "\nMy Phone Number: " + myPhoneNumber + "\nMy Birthyear: " + myBirthYear + "\nMy Gander: "
				+ mySex + "\nMy Salary: " + mySalary + "\nI'm Citizen: " + usCitizen);

	}

}
