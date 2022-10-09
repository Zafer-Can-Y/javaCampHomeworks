package thirdWeekHomework3.entities;

public class Instructor {
	private int id;
	private String firstName;
	private String lastName;
	private int instructorSalary;

	public Instructor() {

	}

	public Instructor(int id, String firstName, String lastName, int instructorSalary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.instructorSalary = instructorSalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getInstructorSalary() {
		return instructorSalary;
	}

	public void setInstructorSalary(int instructorSalary) {
		this.instructorSalary = instructorSalary;
	}

}
