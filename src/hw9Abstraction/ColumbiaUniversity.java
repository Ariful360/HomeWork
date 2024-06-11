package hw9Abstraction;
/*
 *  extends and implements keywords are used for the inheritance in Java for regular Class.
 *  regular class can inherit only one regular class or abstract class with extends keyword.
 *  regular class can't use extends keyword to inherit interfaces.
 *  regular class can inherit one or more than one interfaces with implements keyword.
 */
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{

	// public abstract void chemistry();
	// abstract method is not allowed in a regular class

	// method emplemented here
	public void biology() {
		System.out.println("This is a method from ColumbiaUniversity class");
	}

	// this is a default constructor
	public ColumbiaUniversity() {
		System.out.println("This is a defaul constructor from ColumbiaUniversity class");
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

}
