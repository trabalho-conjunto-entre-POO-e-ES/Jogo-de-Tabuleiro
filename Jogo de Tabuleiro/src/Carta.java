public class Carta {
	// ATRIBUTOS

	private String poder;
	private int nivel;
	
	// ACESSORES
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	// CONSTRUTOR - DEFAULT
	public Carta() {
		
	}
	
	// CONTRUTOR - COM PARAMETROS
	public Carta(String poder, int nivel) {
		super();
		this.poder = poder;
		this.nivel = nivel;
	}
	
	
	// CONSTRUTOR - COPIA

	// COMPORTAMENTOS
	public int comparar(Carta carta) {
		return 0;
	}
	
	
	// COMPLEMENTARES
	@Override
	public String toString() {
		return "Carta [poder=" + poder + ", nivel=" + nivel + "]";
	}
}