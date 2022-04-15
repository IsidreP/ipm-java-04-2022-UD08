package Ej04;

public class Serie {


	// Variables
	private String titulo;
	private int numeroTemporada;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	// Constructor1
	public Serie() {
		this.titulo = "";
		this.numeroTemporada = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	// Constructor2
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.numeroTemporada = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}


	// Constructor3
	public Serie(String titulo, int numeroTemporada, boolean entregado, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numeroTemporada = numeroTemporada;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNumeroTemporada() {
		return numeroTemporada;
	}


	public void setNumeroTemporada(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}


	public boolean isEntregado() {
		return entregado;
	}


	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporada=" + numeroTemporada + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
	

}
