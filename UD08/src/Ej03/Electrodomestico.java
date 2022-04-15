package Ej03;

public class Electrodomestico {

	
	
	public enum Color{blanco, negro, rojo, azul, gris, BLANCO, NEGRO, ROJO, AZUL, GRIS};
	public enum ConsumoEnergetico{A, B, C, D, E, F, a, b, c, d, e, f};

	// Variables
	private int precioBase;
	private int peso;
	private Color micolor;
	private ConsumoEnergetico miconsumoEnergetico;
	
	// Constructor1
	public Electrodomestico() {
		this.precioBase = 100;
		this.micolor = Color.blanco;
		this.miconsumoEnergetico = ConsumoEnergetico.F;
		this.peso = 5;
	}	
	
	// Constructor2
	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.micolor = Color.blanco;
		this.miconsumoEnergetico = ConsumoEnergetico.F;
		this.peso = peso;
	}
	
	// Constructor3
	public Electrodomestico(int precioBase, Color micolor, ConsumoEnergetico miconsumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.micolor = micolor;
		this.miconsumoEnergetico = miconsumoEnergetico;
		this.peso = peso;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Color getMicolor() {
		return micolor;
	}

	public void setMicolor(Color micolor) {
		this.micolor = micolor;
	}

	public ConsumoEnergetico getMiconsumoEnergetico() {
		return miconsumoEnergetico;
	}

	public void setMiconsumoEnergetico(ConsumoEnergetico miconsumoEnergetico) {
		this.miconsumoEnergetico = miconsumoEnergetico;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", peso=" + peso + ", micolor=" + micolor
				+ ", miconsumoEnergetico=" + miconsumoEnergetico + "]";
	}
	
}
