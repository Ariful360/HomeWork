package hw18JavaSwitch;

import java.util.Scanner;

public class LevelOfJava {

	public static void main(String[] args) {
		System.out.println("Please Write about your Java level");
		Scanner scanner = new Scanner(System.in);

		String myLevel = "Biginner";
		switch (myLevel) {
		case "Biginner":
			System.out.println("I am at the beginning level");
			break;
		case "Intermediate":
			System.out.println("I am at the intermediate level");
			break;
		case "Expert":
			System.out.println("I am at expert level");
			break;
		case "Excellent":
			System.out.println("I have a Java Certification from Oracle");
			break;
		default:
			System.out.println("I am a drop out");
		}

		scanner.close();
	}

}
