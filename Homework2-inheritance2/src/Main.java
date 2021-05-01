
public class Main {

	public static void main(String[] args) {
		Instructor instructor1=new Instructor(1, "Engin", "Demiro�", "Software Developing");
		Student student1=new Student(2, "�zkan", "Kuruo�lu", "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudentManager(student1);
		
		UserManager userManager=new UserManager();
		userManager.addUser(student1);
		userManager.addUser(instructor1);

	}

}
