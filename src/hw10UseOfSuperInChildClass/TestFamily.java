package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n-----Default constructor is initialized here-----\n");
		Daughter daughter = new Daughter();

		System.out.println("\n-----Parameterized constructor initialized here------\n");
		Daughter daughter2 = new Daughter("March", 2);

		System.out.println("\n-----Void type method is initialized here-----\n");
		daughter2.daughter();

		System.out.println("\n----parameterized method is initialized here:-----\n");
		daughter2.daughterInfo("April", 18);

	}

}
