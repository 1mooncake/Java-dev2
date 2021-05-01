
public class Instructor extends User {
	String profession;
	
	public Instructor(int id, String firstName, String lastName,String profession) {
		super(id, firstName, lastName);
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.profession=profession;
		
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
}