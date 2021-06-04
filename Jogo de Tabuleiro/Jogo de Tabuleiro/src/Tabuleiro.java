import java.util.ArrayList;

public class Tabuleiro {
	//ATRIBUTOS
	ArrayList<Casas> casas = new ArrayList<Casas>();

	
	//ACESSORES
	public ArrayList<Casas> getCasas() {
		return casas;
	}

	public void setCasas(ArrayList<Casas> casas) {
		this.casas = casas;
	}

	//CONSTRUTOR - DEFAULT
	public Tabuleiro() {
		
	}


	//CONTRUTOR - COM PARAMETROS
	public Tabuleiro(ArrayList<Casas> casas) {
		super();
		this.casas = casas;
	}

	//CONSTRUTOR - COPIA

	//COMPORTAMENTOS

	//COMPLEMENTARES
}
