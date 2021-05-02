package odev2;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.id+"   "+user.email+"   "+user.password+"   "+"Kullanýcý eklendi");
	}
	
	public void logIn(User user){
		System.out.println(user.email+"   "+user.password+"   "+"Kullanýcý giriþ yaptý");
	}
	
	public void logOut(User user){
		System.out.println(user.id+"   "+"Kullanýcý çýkýþ yaptý");
	}
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
	
}
