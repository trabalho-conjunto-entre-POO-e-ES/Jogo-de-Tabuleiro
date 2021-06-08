import java.util.ArrayList;

public class Tabuleiro {
	//ATRIBUTOS
	private ArrayList<Casa> casas = new ArrayList<Casa>();

	
	//ACESSORES
	public ArrayList<Casa> getCasas() {
		return casas;
	}

	public void setCasas(ArrayList<Casa> casas) {
		this.casas = casas;
	}

	//CONSTRUTOR - DEFAULT
	public Tabuleiro() {
		
	}


	//CONTRUTOR - COM PARAMETROS
	public Tabuleiro(ArrayList<Casa> casas) {
		super();
		this.casas = casas;
	}

	//CONSTRUTOR - COPIA

	//COMPORTAMENTOS

	//COMPLEMENTARES
}