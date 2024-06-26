package hw14Abstraction;

public abstract class EngineeringSchool extends NYUniversity implements AeronauticalSchool{
	// abstract method decleared here.
	public abstract void mechanicalLab();

	// non-abstract method implemented here.
	public void computerLab() {
		System.out.println("This is non-abstract methos from EngineeringSchool");
	}

}
