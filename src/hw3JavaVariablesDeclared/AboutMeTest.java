package hw3JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe ariful = new AboutMe();
		ariful.myName = "Ariful Islam";
		ariful.myAge = 32;
		ariful.myId = 92031252l;
		ariful.myGrade = 2.919;
		ariful.myPhoneNumber = 1231916795;
		ariful.myBirthYear = 1992;
		ariful.mySex = 'M';
		ariful.mySalary = 4400.65f;
		ariful.usCitizen = true;
		ariful.aboutMe();

		System.out.println("---------------------------------\n");
		AboutMe alex = new AboutMe();
		alex.myName = "Alex";
		alex.myAge = 35;
		alex.myId = 23234298l;
		alex.myGrade = 2.932;
		alex.myPhoneNumber = 1347531132;
		alex.myBirthYear = 1991;
		alex.mySex = 'M';
		alex.mySalary = 4500.64f;
		alex.usCitizen = false;
		alex.aboutMe();

	}

}
