package hw10UseOfSuperInChildClass;

public class Daughter extends Father{
	// variable decleard here
	public String birthMonth;
	public int age;

	// default contructor
	public Daughter() {
		super();
		System.out.println("This is default Constructor of Daughter class");
	}

	// parameterized constructor
	public Daughter(String birthMonth, int age) {
		super("Ariful", 31, 'M', true);
		super.familyName = "Islam";
		this.birthMonth = birthMonth;
		this.age = age;
		super.familyName = "Islam";
		System.out.println("Birth month: " + birthMonth + "\nDaughter's age: " + age + "\nFamily name: " + familyName);
	}

	// void type method
	public void daughter() {
		System.out.println("This is method of child class");
	}

	// void type parameterized method
	public void daughterInfo(String birthMonth, int age) {
		super.fatherInfo("Md", 57, 'M', false);
		super.familyName = "Miah";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month: " + birthMonth + "\nDaughter's age: " + age + "\nFamily name: " + familyName);
	}

}
