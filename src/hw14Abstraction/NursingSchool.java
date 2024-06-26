package hw14Abstraction;

public abstract class NursingSchool extends RockefellerUniversity{
	// abstract method decleared here.
	public abstract void hygiene();

	// non-abstract method implemented here.
	public void caring() {
		System.out.println("This is non-abstract methos from NursingSchool");
	}

}
