package odev2;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.id+"   "+student.firstName+"   "+student.lastName+"   "+student.email+"   "+"��renci eklendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.id+"   "+student.firstName+"   "+student.lastName+"   "+"��renci Silindi");
	}
	
	public void update(Student student) {
		System.out.println(student.id+"   "+student.firstName+"   "+student.lastName+"   "+"��renci bilgileri g�ncellendi");
	} 
}
