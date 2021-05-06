package gameSalesSimulation;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private int yearOfBirthDate;
	private String nationalityId;
	
	public Customer(int id, String firstName, String lastName, int yearOfBirthDate, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirthDate = yearOfBirthDate;
		this.nationalityId = nationalityId;
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

	public int getYearOfBirthDate() {
		return yearOfBirthDate;
	}

	public void setYearOfBirthDate(int yearOfBirthDate) {
		this.yearOfBirthDate = yearOfBirthDate;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
