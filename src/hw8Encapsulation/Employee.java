package hw8Encapsulation;

public class Employee {
	private String name;
	private int age;
	private char sex;
	private boolean citizen;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isCitizen() {
		return citizen;
	}

	public void setCitizen(boolean citizen) {
		this.citizen = citizen;
	}

}
