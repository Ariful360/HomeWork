package hw14Abstraction;

//we can use only one keyword to inherit in interface
public interface University extends College, Hospital{
	// abstract method decleared here.
	public void classSize();

	public void playGround();

	public void teacher();

	/*
	 * public void University() { }
	 */

	// constructor is not allowed in an Interface.
	public default void gymnasium() {
	}

	public static void library() {
	}

	/*
	 * We can inherit multiple interfaces using extends keyword. interface can't
	 * inherit any regular class with extends keyword. interface can't inherit any
	 * abstract with extends keyword.
	 */

}
