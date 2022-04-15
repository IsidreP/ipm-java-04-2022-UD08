package Ej03;

import Ej03.Electrodomestico.Color;
import Ej03.Electrodomestico.ConsumoEnergetico;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		
		//Electrodomestico Electrodomestico1=new Electrodomestico();
		//Electrodomestico Electrodomestico1=new Electrodomestico(100, Color.rojo, ConsumoEnergetico.A, 50);
		Electrodomestico Electrodomestico1=new Electrodomestico(100, Color.AZUL, ConsumoEnergetico.a, 50);
		
		System.out.println(Electrodomestico1);

	}

}
