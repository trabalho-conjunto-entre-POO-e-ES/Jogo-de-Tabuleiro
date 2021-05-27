import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Jogador {
	//ATRIBUTOS
	private ArrayList<Carta> cartas;
	
	private String jogador[] = new String[2];

	//ACESSORES
	public String[] getJogador() {
		return jogador;
	}

	public void setJogador(String[] jogador) {
		this.jogador = jogador;
	}

	//CONSTRUTOR - DEFAULT
	public Jogador() {
		
	}
	//CONTRUTOR - COM PARAMETROS
	public Jogador(String[] jogador) {
		super();
		this.jogador = jogador;
	}
	//CONSTRUTOR - COPIA
	

	//COMPORTAMENTOS
	public void nomeJogador() {
	for ( int i=0 ; i<= jogador.length ; i++ ) {
		JOptionPane.showInputDialog("nome do jogador" + jogador);
	    }
	}


	//COMPLEMENTARES
	@Override
	public String toString() {
		return "Jogador [jogador=" + Arrays.toString(jogador) + "]";
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
		if (!Arrays.equals(jogador, other.jogador))
			return false;
		return true;
	}


	
}

