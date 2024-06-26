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

		System.out.println("\n--------------University----------------\n");
		University university = new ColumbiaUniversity();
		university.languageClub();
		university.cafeteria();
		university.classSize();
		university.commonRoom();
		university.emergencyRoom();
		university.gymnasium();
		university.laboratory();
		university.playGround();
		university.surgeryRoom();
		university.teacher();
		University.library();

		System.out.println("\n--------------MedicalSchool----------------\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.anthropology();
		medicalSchool.caring();
		medicalSchool.aeronauticalInfo();
		medicalSchool.computerLab();
		medicalSchool.hygiene();
		medicalSchool.lawInfo();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();

	}

}
