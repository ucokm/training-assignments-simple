package eu.sig.training.ch05.buildandsendmail;

public class NameFormat {
	private String firstName;
	private String lastName;
	private String division;

	public NameFormat(String firstName, String lastName,
			String division) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.division = division;
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

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
}