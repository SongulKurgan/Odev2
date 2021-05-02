package odev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.email="engin@demirog.com";
		instructor.password="12345";
		
		Student student=new Student();
		student.id=2;
		student.firstName="Songül";
		student.lastName="Kurgan";
		student.email="songul@kurgan.com";
		student.password="77326";
		
		UserManager userManager=new UserManager();
		User[] users= {instructor,student};
		userManager.addMultiple(users);
		
		StudentManager studentManager=new StudentManager();
		studentManager.delete(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.update(instructor);
		
		
	}

}
