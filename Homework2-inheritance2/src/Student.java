
public class Student extends User{
	
	String takenCourses;

	
	public Student(int id,String firstName,String lastName,String takenCourses) {
		super(id, takenCourses, takenCourses);
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.takenCourses=takenCourses;
		
		
	}
	
	public String getTakenCourses() {
		return takenCourses;
	}


	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}
	

}
