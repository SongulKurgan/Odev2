package odev2;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.id+"   "+instructor.firstName+"   "+instructor.lastName+"   "+instructor.email+"   "+"Eðitmen eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.id+"   "+instructor.firstName+"   "+instructor.lastName+"   "+"Eðitmen silindi");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.id+"   "+instructor.firstName+"   "+instructor.lastName+"   "+"Eðitmen bilgileri güncellendi");
	}
	
}
