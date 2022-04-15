package Ej02;

public class PasswordApp {

	public static void main(String[] args) {
		
		Password password1=new Password(10, "799");
		
		System.out.println(password1.generateRandomPassword(12));

	}

}
