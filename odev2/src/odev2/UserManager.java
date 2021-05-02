package odev2;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.id+"   "+user.email+"   "+user.password+"   "+"Kullan�c� eklendi");
	}
	
	public void logIn(User user){
		System.out.println(user.email+"   "+user.password+"   "+"Kullan�c� giri� yapt�");
	}
	
	public void logOut(User user){
		System.out.println(user.id+"   "+"Kullan�c� ��k�� yapt�");
	}
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
	
}
