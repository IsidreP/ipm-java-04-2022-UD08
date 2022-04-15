package Ej02;

import java.security.SecureRandom;

public class Password {
	
	//Atributos
	private int longitud;
	private String contraseña;
	
	// Constructor1
	public Password() {
		this.longitud =8;
		this.contraseña ="";
	}

	// Constructor2
	public Password(int longitud, String contraseña) {
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	// Getters & Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	// Metodo para sacar contraseña
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
