package Ej04;

public class SerieApp {

	public static void main(String[] args) {
		
		Serie serie1= new Serie();
		Serie serie2= new Serie("fugitivo", 4, true, "accion", "Manolo");
		
		System.out.println(serie1);
		System.out.println(serie2);

	}

}
