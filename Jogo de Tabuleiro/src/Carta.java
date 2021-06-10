import java.util.Random;

public class Carta {
	// ATRIBUTOS

	private String poder[] = new String[] {"fogo", "agua", "terra","vento"};
	private int nivel;
	
	// ACESSORES
	public String[] getPoder() {
		return poder;
	}
	public void setPoder(String[] poder) {
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
	public Carta(String[] poder, int nivel) {
		super();
		this.poder = poder;
		this.nivel = nivel;
	}
	
	
	// CONSTRUTOR - COPIA

	// COMPORTAMENTOS
	public int randNivel(Carta carta) {
		Random rand = new Random();
		int minimo = 1;
		int maximo = 5;
		int rand_nivel = rand.nextInt(maximo-minimo) + minimo;
		return rand_nivel;
	}
	public String randPoder(Carta carta) {
		Random rand = new Random();
		int rand_poder = rand.nextInt(4);
		if (rand_poder == 0) {
			return "fogo";
		}else {
			if(rand_poder == 1) {
				return "agua";
			}else {
				if(rand_poder == 2) {
					return "terra";
				}else {
					return "vento";
				}
			}
		}
	}
	
	public int comparar(Carta carta) {
		return 0;
	}
	
	
	
	// COMPLEMENTARES
	@Override
	public String toString() {
		return "Carta [poder=" + poder + ", nivel=" + nivel + "]";
	}
}