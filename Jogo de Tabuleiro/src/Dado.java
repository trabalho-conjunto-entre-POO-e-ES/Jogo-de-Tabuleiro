import java.util.Random;

public class Dado {
	// ATRIBUTOS
	private int vezesLancado; // vezes que o dado foi lançado
	private int lados; // lados = sides
	private Random random;

	// CONSTRUTOR - DEFAULT
	public Dado() {

	}

	// CONTRUTOR - COM PARAMETROS
	public Dado(int sides) {
		vezesLancado = 0;
		lados = sides;
		random = new Random();
	}

	// ACESSORES
	public int getVezesLancado() {
		return vezesLancado;
	}

	public int getLados() {
		return lados;
	}

	// COMPORTAMENTOS
	public int lancar() {
		vezesLancado++;
		return random.nextInt(lados) + 1;
	}

	public void lancamento() {
		Dado dado = new Dado(6);
		
		for(int i = 0; i < 1; i++)
		{
		    int rolar = dado.lancar();
		    System.out.println("Lançar" + dado.getVezesLancado() + ": " + rolar);
		}
		
	}

	// COMPLEMENTARES
	public String toString() {
		return "# lados: " + getLados() + " # lancamentos: " + getVezesLancado();
	}

}