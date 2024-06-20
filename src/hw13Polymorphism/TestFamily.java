package hw13Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("\n--------------Sister---------------");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(24, 36, 32, 30, 40, "38");
		sister.sister(24, 36, 32, "30", 40, 38);
		sister.sister(24, 36, 32, 30, "40");
		Sister.sister(18, "36", 32, 40, 38);
		sister.sister(24, 36, 32, "38");

		System.out.println("\n--------------Niece---------------");
		Niece niece = new Niece();
		niece.sister(24, 36, 32, "30", 40, 38);
		niece.sister(24, 36, 32, 30, "40");
		// Niece.sister(18, "36", 32,40, 38);
		// niece.sister(24, 36, 32, "38");
		niece.sister();
		niece.sister(24, 36, 32, 30, 40, "38");
	}

}
