package hw14Abstraction;

public interface College {

	// abstract method decleared here.
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {

	}

	public static void studyRoom() {

	}

}
