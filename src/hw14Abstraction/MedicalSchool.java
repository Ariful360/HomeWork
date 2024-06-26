package hw14Abstraction;

/*
 *  extends and implements keywords are used for the inheritance in Java for Abstract Class.
 *  abstract class can inherit only one regular class or abstract class with extends keyword.
 *  regular class can't use extends keyword to inherit interfaces.
 *  abstract class can inherit one or more than one interfaces with implements keyword.
 */
public abstract class MedicalSchool extends NursingSchool implements LawSchool {
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