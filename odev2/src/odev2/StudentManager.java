package odev2;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.id+"   "+student.firstName+"   "+student.lastName+"   "+student.email+"   "+"Öğrenci eklendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.id+"   "+student.firstName+"   "+student.lastName+"   "+"Öğrenci Silindi");
	}
	
	public void update(Student student) {
		System.out.println(student.id+"   "+student.firstName+"   "+student.lastName+"   "+"Öğrenci bilgileri güncellendi");
	} 
}
