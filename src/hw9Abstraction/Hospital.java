package hw9Abstraction;

public interface Hospital {

	// abstract method decleared here.
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	// default method implemented in interface
	public default void morgue() {

	}

	// static method implemented in interface
	public static void pharmacy() {

	}

}
