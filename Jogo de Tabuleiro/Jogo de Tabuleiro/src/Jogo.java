import java.util.ArrayList;

public class Jogo {

	//Atributo
	private Tabuleiro tabuleiro;
	private Jogador jogador1;
	private Jogador jogador2;
	private Dado dado;
	
	
	private ArrayList<Casa> construirCasas(){
		ArrayList<Casa> casas = new ArrayList<Casa>();
		for(int i=0 ; i < 10; i++) {
			casas.add( new Casa(Casa.Cor.vermelho , i));
			casas.add( new Casa(Casa.Cor.laranja , i+1));
			casas.add( new Casa(Casa.Cor.amarelo , i+2));
		}
		return casas;
	}
	
	public Jogo() {
		tabuleiro = new Tabuleiro(construirCasas());
	}
}
