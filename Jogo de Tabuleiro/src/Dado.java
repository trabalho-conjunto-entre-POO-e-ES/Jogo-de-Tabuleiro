import java.util.Random;
/**
 * A classe Dado contem opera??es para realizar o lancamento e obten??o do valor do dado que permite os jogadores avan?arem no jogo.
 * @author jopes
 * @author gabriel
 */
public class Dado {
	// ATRIBUTOS
	/**
	 * Os atributos utilizados na constru??o da classe dado foram:
	 * <ul>
	 *   <li>vezesLancado</li>
	 *   <li>lados</li>
	 *   <li>random</li>
	 * <ul>
	 */
	private int vezesLancado; // vezes que o dado foi lan?ado
	private int lados; // lados = sides
	private Random random;

	// CONSTRUTOR - DEFAULT
	public Dado() {
		
	}

	/**
	 * Se o dado conter mais de 6 lados n?o poder? ser criado.
	 * @param sides
	 */
	// CONTRUTOR - COM PARAMETROS
	public Dado(int sides) {
		if( sides != 6 )
			throw new IllegalArgumentException("Dado inv?lido");
		
		vezesLancado = 0;
		lados = sides;
		random = new Random();
	}

	// ACESSORES
	/**
	 * Retorna as vezes que um dado fui lan?ado.
	 * @return retorna as vezes que o dado foi lan?ado.
	 */
	public int getVezesLancado() {
		return vezesLancado;
	}
	/**
	 * Permite ver a quantidade de lados que o dado possui.
	 * @return retorna o numero de lados que o dado tem.
	 */

	public int getLados() {
		return lados;
	}

	// COMPORTAMENTOS
	/**
	 * Este comportamento permite receber o valor de um dos lados do dado.
	 * @return retorna um lado aleatorio do dado.
	 */
	public int lancar() {
		vezesLancado++;
		return random.nextInt(lados) + 1;
	}
	
/**
 * O comportamento lancamento lan?a o dado 1 vez e retorna o valor da fa?e do dado.
 */
	public void lancamento() {
		Dado dado = new Dado(6);
		
		for(int i = 0; i < 1; i++)
		{
		    int rolar = dado.lancar();
		    System.out.println("Lan?ar" + dado.getVezesLancado() + ": " + rolar);
		}
		
	}

	// COMPLEMENTARES
	/**
	 * Este comportamento complementar devolve o numero de lados e as vezes que o dado foi lan?ado.
	 * @return retorna o numero de lados como tambem o numero de lan?amentos.?
	 */
	@Override 
	public String toString() {
		return "# lados: " + getLados() + " # lancamentos: " + getVezesLancado();
	}

}