package hw8Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Ariful Islam");
		emp.setAge(30);
		emp.setSex('M');
		emp.setCitizen(true);
		System.out.println("Emplyee Name: " + emp.getName() + "\nEmplyee Age: " + emp.getAge() + "\nEmplyee Gender: "
				+ emp.getSex() + "\nEmplyee is citizen: " + emp.isCitizen());

	}

}
