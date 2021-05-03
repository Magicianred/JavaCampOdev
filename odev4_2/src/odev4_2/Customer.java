package odev4_2;

public class Customer implements Entity {
	private int id;
 private String firstName;
 private  String lastName;
 private String nationalIdendtity;
  private String dateOfBirth;

public Customer (int id, String firstName, String lastName, String nationalIdentity) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.nationalIdendtity = nationalIdentity;
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
public String getNationalIdendtity() {
	return nationalIdendtity;
}
public void setNationalIdendtity(String nationalIdendtity) {
	this.nationalIdendtity = nationalIdendtity;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

}
