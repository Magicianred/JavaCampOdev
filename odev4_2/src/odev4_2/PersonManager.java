package odev4_2;

public class PersonManager {
static Person[] persons;
	
	public PersonManager(Person[] persons) {
		PersonManager.persons = persons;
	}
	
	public static boolean isValid(int nationalId, String firstName) {
		for(Person p : persons) {
			if(p.nationalId == nationalId && p.firstName == firstName) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
