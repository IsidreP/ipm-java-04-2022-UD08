package Ej01;

public class Persona {
	
	String genero="Hombre";
	
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private int peso;
	private double altura;
	
	// Constructor1
	public Persona() {
		this.nombre="";
		this.edad=0;
		this.DNI="";
		this.sexo=genero;
		this.peso=0;
		this.altura=0;
	}
	
	// Constructor2
	public Persona(String nombre, int edad, String sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.DNI="";
		this.sexo=sexo;
		this.peso=0;
		this.altura=0;
	}
	
	// Constructor3
	public Persona(String nombre, int edad, String DNI, String sexo, int peso, double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.DNI=DNI;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}
	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso="
				+ peso + ", altura=" + altura + "]";
	}
	
	public String sexo (String genero) {
		
		if (genero=="Mujer") {
			genero="Mujer";
		}else {
			genero="Hombre";
		}
		return genero;
	}

}
