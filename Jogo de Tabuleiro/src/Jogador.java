import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Jogador {
	// ATRIBUTOS
	private ArrayList<Carta> cartas;

	private String nome;

	// ACESSORES
	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	// CONSTRUTOR - DEFAULT
	public Jogador() {

	}

	// CONTRUTOR - COM PARAMETROS
	public Jogador(String nome) {
		super();
		this.nome = nome;
	}
	// CONSTRUTOR - COPIA

	

	// COMPORTAMENTOS
	public void nomenome() {
			JOptionPane.showInputDialog("Nome do Jogador" + nome);
	}
	
	public ArrayList<Carta> construirCarta(Carta carta){
		//ArrayList<Carta> carta = new ArrayList<Carta>();
		for(int i=0;i<10;i++) {
			carta.randNivel(carta);
			}
		 return cartas;
		
	}

	// COMPLEMENTARES
	@Override
	public String toString() {
		return "Jogador [cartas=" + cartas + ", nome=" + nome + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		if (cartas == null) {
			if (other.cartas != null)
				return false;
		} else if (!cartas.equals(other.cartas))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	

}
