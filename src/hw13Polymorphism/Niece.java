package hw13Polymorphism;

public class Niece extends Sister{
	
	// void type method is implemented
		@Override
		public void sister() {
			System.out.println("This is void type method is from Sister class");
		}

		// void type parameterized method is implemented
		@Override
		public void sister(int age1, int age2, int age3, int age4, int age5, String age6) {
			int total4 = age1 / 2 + age2 - 20 + age4 + age3 + age5 + Integer.parseInt(age6) * 3;
			System.out.println("Total age: " + total4);
		}

		// return type parameterized method is implemented
		@Override
		public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
			int total = age1 + 10 + age2 / 2 + age3 + Integer.parseInt(age4) + age5 * 3 + age6 - 30;
			System.out.println("Total age: " + total);
			return total;
		}

		// return type parameterized method is implemented
		@Override
		public int sister(int age1, int age2, int age3, int age4, String age5) {
			int total1 = age1 + 20 + age2 / 3 + age3 + age4 - 20 + Integer.parseInt(age5) * 4;
			System.out.println("Total age: " + total1);
			return total1;
		}

		/*
		 * // static type parameterized method is implemented
		 * 
		 * @Override public static int sister(int age1, int age2, int age3, int age5,
		 * int age6) { int total2 = age1 + age2 + age3 + age5 + age6;
		 * System.out.println("Total age: " + total2); return total2; }
		 */
		/*
		 * When different methods exist the same name and parameter are also same, but
		 * the syntax logic are different is called method Overridden. Method Overriding
		 * occurs during run time. static type method is personal, it can't be override in
		 * Niece class. However, Niece class can implement it's own static method
		 * without @Override annotation.
		 */

		/*
		 * // Return type parameterized method is implemented which is final
		 * 
		 * @Override public final int sister(int age1, int age2, int age3, int age5) {
		 * int total3 = age1 + age2 + age3 + age5 + 10; System.out.println("Total age: "
		 * + total3); return total3; }
		 */
		/*
		 * When different methods exist the same name and parameter are also same, but
		 * the syntax logic are different is called method Overridden. Method Overriding
		 * occurs during run time. Final type method can not be overridden, since the method
		 * is final and used for the super class.
		 */

}
