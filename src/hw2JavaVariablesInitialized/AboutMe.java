package hw2JavaVariablesInitialized;

public class AboutMe {
	// variable is declareed here
	public String mycountry;

	// variable is initialized here
	public String myName = "Ariful";
	public int myAge = 34;
	public char mySex = 'M';
	public float mySalary = 4532.50f;
	public boolean usCitizen = true;

	// Constructor is declared here
	public AboutMe() {
		System.out.println("------------ This is all about Myself ------------");
	}

	public static void main(String[] args) {
		// Constructor is initialized here
		AboutMe aboutMe = new AboutMe();
		System.out.println("My Name: " + aboutMe.myName);
		System.out.println("My Age: " + aboutMe.myAge);
		System.out.println("My Sex: " + aboutMe.mySex);
		System.out.println("My Salary: " + aboutMe.mySalary);
		System.out.println("I'm Citizen: " + aboutMe.usCitizen);
	}

}
