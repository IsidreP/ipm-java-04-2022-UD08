package Ej02;

import java.security.SecureRandom;

public class Password {
	
	//Atributos
	private int longitud;
	private String contrase�a;
	
	// Constructor1
	public Password() {
		this.longitud =8;
		this.contrase�a ="";
	}

	// Constructor2
	public Password(int longitud, String contrase�a) {
		this.longitud = longitud;
		this.contrase�a = contrase�a;
	}

	// Getters & Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}
	
	// Metodo para sacar contrase�a
    public static String generateRandomPassword(int len){
        
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }
}
