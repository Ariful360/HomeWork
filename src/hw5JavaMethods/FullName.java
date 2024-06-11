package hw5JavaMethods;

public class FullName {

	public String fullName(String fName, String lName) {
		System.out.println("Family Members: " + fName + " " + lName);
		return null;
	}

	public static void main(String[] args) {
		FullName name = new FullName();
		name.fullName("Ariful", "Islam");
		name.fullName("Nasrin", "Liza");
		name.fullName("Ayan", "Islam");
		name.fullName("Tarek", "Islam");

	}

}
