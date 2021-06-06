import java.util.ArrayList;

public class CartaEspecial extends Carta {
	//ATRIBUTOS
	ArrayList<String> capacidade = new ArrayList<String>();
	
	//ACESSORES
	public ArrayList<String> getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(ArrayList<String> capacidade) {
		this.capacidade = capacidade;
	}
	//CONSTRUTOR - DEFAULT

	public CartaEspecial() {
		
	}
	//CONTRUTOR - COM PARAMETROS

	public CartaEspecial(ArrayList<String> capacidade) {
		super();
		this.capacidade = capacidade;
	}

	//CONSTRUTOR - COPIA

	//COMPORTAMENTOS

	//COMPLEMENTARES
	@Override
	public String toString() {
		return "CartaEspecial [capacidade=" + capacidade + "]";
	}
}
