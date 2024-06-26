package hw14Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n------This is Columbia University------\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.biology();
		columbiaUniversity.cafeteria();
		columbiaUniversity.caring();
		columbiaUniversity.classSize();
		columbiaUniversity.commonRoom();
		columbiaUniversity.computerLab();
		columbiaUniversity.dorm();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.hygiene();
		columbiaUniversity.gymnasium();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.lawInfo();
		columbiaUniversity.maths();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.morgue();
		columbiaUniversity.playGround();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.teacher();
		columbiaUniversity.surgeryRoom();
	
		System.out.println("\n------This is University------\n");
		//University university = new University();
		
		/*
		 * University cannot be instantiated because we can't instantiate an interface.
		 */
		
		System.out.println("\n------This is MedicalSchool------\n");
		//MedicalSchool medicalSchool = new MedicalSchool();

		/*
		 * University cannot be instantiated because we can't instantiate an Abstract class.
		 */
	}

}
