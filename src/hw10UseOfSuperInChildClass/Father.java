package hw10UseOfSuperInChildClass;

public class Father {
	// variables decleared here
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// default constructor implemented
	public Father() {
		System.out.println("This is default Constructor of Father class");
	}

	// parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(
				"Father's name: " + name + "\nAge: " + age + "\nGender: " + sex + "\nUS Citizen: " + usCitizen);
	}

	// void type method
	public void father() {
		System.out.println("This is method of super class");
	}

	// void type parameterized method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(
				"Father's name: " + name + "\nAge: " + age + "\nGender: " + sex + "\nUS Citizen: " + usCitizen);
	}

}
