package odev2;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.id+"   "+instructor.firstName+"   "+instructor.lastName+"   "+instructor.email+"   "+"E�itmen eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.id+"   "+instructor.firstName+"   "+instructor.lastName+"   "+"E�itmen silindi");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.id+"   "+instructor.firstName+"   "+instructor.lastName+"   "+"E�itmen bilgileri g�ncellendi");
	}
	
}
