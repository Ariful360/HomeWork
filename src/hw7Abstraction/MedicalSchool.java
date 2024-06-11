package hw7Abstraction;

public abstract class MedicalSchool {
// abstract method decleared here.
	public abstract void anatomyLab();

// non-abstract method implemented here.
	public void biochemistryLab() {
		System.out.println("This is non-abstract methos");
	}

// default constructor
	public MedicalSchool() {
		System.out.println("This is default constructor of abstract class");
	}
}