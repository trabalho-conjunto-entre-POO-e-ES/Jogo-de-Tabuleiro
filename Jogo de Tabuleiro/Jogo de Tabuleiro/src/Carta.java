import java.util.ArrayList;
import java.util.Arrays;

public class Carta {
	// ATRIBUTOS
	ArrayList<String> poder = new ArrayList<String>();
	int nivel[] = new int[6];
	
	// ACESSORES
	public ArrayList<String> getPoder() {
		return poder;
	}
	public void setPoder(ArrayList<String> poder) {
		this.poder = poder;
	}
	public int[] getNivel() {
		return nivel;
	}
	public void setNivel(int[] nivel) {
		this.nivel = nivel;
	}

	// CONSTRUTOR - DEFAULT
	public Carta() {
		
	}
	
	// CONTRUTOR - COM PARAMETROS
	public Carta(ArrayList<String> poder, int[] nivel) {
		super();
		this.poder = poder;
		this.nivel = nivel;
	}
	
	
	// CONSTRUTOR - COPIA

	// COMPORTAMENTOS
	
	
	// COMPLEMENTARES
	@Override
	public String toString() {
		return "Carta [poder=" + poder + ", nivel=" + Arrays.toString(nivel) + "]";
	}
}
