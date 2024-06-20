package hw13Polymorphism;

public class Sister {

	public void sister() {
		System.out.println("This is void type method is from Sister class");
	}

	// void type parameterized method is implemented
	public void sister(int age1, int age2, int age3, int age4, int age5, String age6) {
		int total4 = age1 + age2 + age3 + age5 + Integer.parseInt(age6);
		System.out.println("Total age: " + total4);
	}

	// return type parameterized method is implemented
	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age: " + total);
		return total;
	}

	// return type parameterized method is implemented
	public int sister(int age1, int age2, int age3, int age4, String age5) {
		int total1 = age1 + age2 + age3 + age4 + Integer.parseInt(age5);
		System.out.println("Total age: " + total1);
		return total1;
	}

	// static type parameterized method is implemented
	public static int sister(int age1, String age2, int age3, int age5, int age6) {
		int total2 = age1 + Integer.parseInt(age2) + age3 + age5 + age6;
		System.out.println("Total age: " + total2);
		return total2;
	}

	// Return type parameterized method is implemented which is final
	public final int sister(int age1, int age2, int age3, String age6) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age6);
		System.out.println("Total age: " + total3);
		return total3;
	}

	/*
	 * When different method is created by the same method name, but parameter are
	 * different it is called method overloading. Method overloading is also called
	 * static polymorphism. Method overloading happen during compile time.
	 */

}
