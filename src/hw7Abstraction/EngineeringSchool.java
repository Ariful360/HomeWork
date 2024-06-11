package hw7Abstraction;

public abstract class EngineeringSchool {
	// abstract method decleared here.
	public abstract void mechanicalLab();

	// non-abstract method implemented here.
	public void computerLab() {
		System.out.println("This is non-abstract methos from EngineeringSchool");
	}

}
