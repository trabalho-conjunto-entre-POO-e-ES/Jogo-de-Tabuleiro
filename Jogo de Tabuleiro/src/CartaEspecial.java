import java.util.ArrayList;

public class CartaEspecial extends Carta {
	// ATRIBUTOS
	private ArrayList<String> capacidade = new ArrayList<String>();

	// ACESSORES
	public ArrayList<String> getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(ArrayList<String> capacidade) {
		this.capacidade = capacidade;
	}
	// CONSTRUTOR - DEFAULT

	public CartaEspecial() {

	}
	// CONTRUTOR - COM PARAMETROS

	public CartaEspecial(ArrayList<String> capacidade) {
		super();
		this.capacidade = capacidade;
	}

	// CONSTRUTOR - COPIA

	// COMPORTAMENTOS
	@Override
	public int comparar(Carta carta) {
		// TODO Auto-generated method stub
		return 0;
	}

	// COMPLEMENTARES
	@Override
	public String toString() {
		return "CartaEspecial [capacidade=" + capacidade + "]";
	}

}