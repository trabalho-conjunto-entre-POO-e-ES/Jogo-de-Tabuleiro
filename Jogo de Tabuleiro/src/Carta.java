import java.util.Random;
/**
 * A classe Carta contem operações para criar um valor random para o nivel e o poder da carta.
 * @author jopes
 * @author gabriel
 */
public class Carta {
	// ATRIBUTOS
	/**
	 * Os atributos utilizados na construção da classe dado foram:
	 * <ul>
	 *   <li>poder</li>
	 *   <li>nivel</li>
	 * <ul>
	 */
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
	/**
	 * Este método faz com que a o nivel da carta seja random.
	 * @param carta
	 * @return retorna um nivel random de 1 a 5
	 */
	public int randNivel(Carta carta) {
		Random rand = new Random();
		int minimo = 1;
		int maximo = 5;
		int rand_nivel = rand.nextInt(maximo-minimo) + minimo;
		return rand_nivel;
	}
	/**
	 * Escolhe entre as opções existentes um poder random.
	 * @param carta
	 * @return retorna um poder ao calhas.
	 */
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
	/**
	 * Este comportamento complementar devolve o nivel e o poder.
	 * @return retorna o nivel e o poder.
	 */
	@Override
	public String toString() {
		return "Carta [poder=" + poder + ", nivel=" + nivel + "]";
	}
}